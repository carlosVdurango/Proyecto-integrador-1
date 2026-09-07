import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        Registro reg=new Registro();
        Login log=new Login();

        int opcion =0;

        //ciclo del menu sin grafica por ahora, adelanten la interfaz de figma!!
        while(opcion!=3){

            System.out.println ("");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Salir");

            System.out.print("Elija una opcion: ");

            opcion =Integer.parseInt(sc.nextLine());

            switch(opcion){
            case 1:
                reg.registrarUsuario();
                break;
            case 2:
                log.iniciarSesion(reg.getListaUsuarios());
                break;
            case 3:
                System.out.println("saliendo del programa...");

                break;
            default :
                System.out.println("opcion invalida");
            }

        }

    }

}
