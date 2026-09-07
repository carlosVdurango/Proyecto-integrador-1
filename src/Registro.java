import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    Scanner sc = new Scanner(System.in);

    public void registrarUsuario(){

        String nom;
        String correo1;
        String clave1;
        String clave2;
        int  edad1;
        boolean band = false;

        System.out.println("registro");
        System.out.print("Ingrese su nombre: ");
        nom = sc.nextLine();

        System.out.print("Ingrese su correo: ");
        correo1=sc.nextLine();

        //revision d correo sin repetir
        for(int i = 0;i<listaUsuarios.size();i++){
            if(listaUsuarios.get(i).getCorreo().equals(correo1)){
                band=true;
            }
        }

        if(band==true){
            System.out.println("Ese correo ya esta registrado!!");
            return;
        }

        System.out.print("Ingrese su edad: ");
        edad1 = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese una contraseña: ");
        clave1 = sc.nextLine();

        System.out.print("Confirme la contraseña: ");
        clave2=sc.nextLine();

        if(clave1.equals(clave2) == false){
            System.out.println("las contraseñas no coinciden, intente de nuevo");
            return;
        }

        if (clave1.length()<4) {
            System.out.println("la contraseña es muy corta, debe tener minimo 4 caracteres");
            return ;
        }

        Usuario u1 = new Usuario(nom,correo1,clave1,edad1);
        listaUsuarios.add(u1);

        System.out.println("Usuario registrado con exito");

    }


    public ArrayList<Usuario> getListaUsuarios(){
        return listaUsuarios;
    }

}
