/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JavaClass.java to edit this template
 */
package proyectointegrador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/*La mayoria de todas estas librerias fueron copiadas y pegadas de un proyecto de github que usaba un login similar
*y fueron aprendiendose a usar en lo estrictamente necesario a medida que se hacia el codigo
*/

/**
 * Esta clase la usamos para manejar todo lo relacionado con el registro 
 * y el inicio de sesion de los usuarios. Por ahora no estamos usando una base de datos de verdad 
 * (eso lo dejamos para una entrega mas adelante,
 * cuando ya veamos JDBC en poo2), asi que optamos por guardar todo en
 * un archivo de texto plano.
 *
 * El archivo queda guardado en:
 *   data/usuarios.txt
 * (dentro de la carpeta donde se corre el proyecto).
 *
 * Cada linea del archivo tiene este formato:
 *   nombre;correo;hashDeLaContrasena
 *
 * Usamos punto y coma como separador porque es lo mas facil de manejar
 * con split() sin tener que meter una libreria externa para leer CSV.
 *
 */
public class Autenticacion {

    // nombre de la carpeta y del archivo donde guardamos los usuarios
    private static final String CARPETA_DATOS = "data";
    private static final String ARCHIVO_USUARIOS = CARPETA_DATOS+File.separator+"usuarios.txt";

    /**
     * Metodo para registrar un usuario nuevo.
     * Si el correo ya existe en el archivo, no dejamos crear la cuenta
     * y devolvemos false (esto lo controla el formulario de Registro
     * para mostrar el mensaje correspondiente).
     */
    public static boolean registrarUsuario(String nombre, String correo, String contrasena) {
        if(existeUsuario(correo)){
            return false;
        }
        asegurarCarpetaDatos();
        // armamos la linea que se va a guardar, con la contrasena ya en hash
        String linea = nombre + ";" +correo+ ";" + hash(contrasena);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_USUARIOS, true))) {
            bw.write(linea);
            bw.newLine();
            return true;
        } catch (IOException e) {
            // por ahora solo mostramos el error en consola, no manejamos
            // esto de una forma mas elegante porque todavia no vimos logs
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Revisa que el correo y la contrasena que llegan del formulario de
     * login coincidan con algun usuario guardado.
     */
    public static boolean validarCredenciales(String correo, String contrasena) {
        for (String[] usuario : leerUsuarios()) {
            if (usuario[1].equalsIgnoreCase(correo) && usuario[2].equals(hash(contrasena))){
                return true;
            }
        }
        return false;
    }

    /**
     * Nos dice si ya hay una cuenta registrada con ese correo.
     */
    public static boolean existeUsuario(String correo) {
        for (String[] usuario: leerUsuarios()) {
            if(usuario[1].equalsIgnoreCase(correo)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Cambia la contrasena de un usuario que ya existe. Como el archivo
     * es de texto plano, lo que hacemos es leer todas las lineas, cambiar
     * el hash del usuario que corresponde, y volver a escribir el archivo
     * completo de nuevo (no es lo mas eficiente pero para el tamaño de
     * datos que manejamos aqui funciona bien).
     */
    public static boolean actualizarContrasena(String correo, String nuevaContrasena) {
        List<String[]> usuarios = leerUsuarios();
        boolean encontrado = false;
        List<String> lineasNuevas = new ArrayList<>();

        for (String[] usuario : usuarios) {
            if (usuario[1].equalsIgnoreCase(correo)) {
                usuario[2] =hash(nuevaContrasena);
                encontrado = true;
            }
            lineasNuevas.add(usuario[0]+";"+usuario[1]+";"+usuario[2]);
        }

        if (!encontrado) {
            return false;
        }

        asegurarCarpetaDatos();
        try {
            Files.write(Paths.get(ARCHIVO_USUARIOS), lineasNuevas, StandardCharsets.UTF_8);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Metodo interno que lee el archivo de usuarios linea por linea y
     * arma una lista con los datos ya separados (nombre, correo, hash).
     * Si el archivo todavia no existe (por ejemplo la primera vez que se
     * corre el programa) simplemente devolvemos una lista vacia.
     */
    private static List<String[]> leerUsuarios() {
        List<String[]> usuarios = new ArrayList<>();
        File archivo = new File(ARCHIVO_USUARIOS);
        if (!archivo.exists()){
            return usuarios;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine())!= null) {
                if (linea.trim().isEmpty()) {
                    continue; // saltamos lineas vacias por si acaso
                }
                String[] partes = linea.split(";", 3);
                if(partes.length == 3){
                    usuarios.add(partes);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    // crea la carpeta "data" si todavia no existe, para que no truene
    // al intentar escribir el archivo la primera vez
    private static void asegurarCarpetaDatos() {
        File carpeta = new File(CARPETA_DATOS);
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
    }

    /**
     * Convierte el texto (la contrasena) a un hash SHA-256, para no
     * guardar la contrasena de los usuarios directamente en el archivo.
     * Esto lo investigamos porque nunca se
     * debe guardar una contrasena "en texto plano".
     */
    private static String hash(String texto) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(texto.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b: digest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            // en teoria SHA-256 siempre deberia estar disponible en la JVM,
            // pero dejamos este catch por si acaso no lo esta
            return texto;
        }
    }
}
