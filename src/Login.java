import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    Scanner sc = new Scanner(System.in);

    public void iniciarSesion(ArrayList<Usuario> lista ){

        String correoLog;
        String claveLog;
        int cont = 0;
        boolean encontrado=false;

        System.out.println("inicio de sesion");

        if(lista.size()==0){
            System.out.println("no hay usuarios registrados");
            return;
        }

        System.out.print("correo: ");
        correoLog=sc.nextLine();
        System.out.print("contraseña: ");
        claveLog = sc.nextLine();

        for (int i=0;i<lista.size() ;i++ ) {
            Usuario aux = lista.get(i);

            if(aux.getCorreo().equals(correoLog) && aux.getClave().equals(claveLog)){
                encontrado = true;
                System.out.println("Bienvenido " + aux.getNombre() + "!!");
                break;
            }


        }
        if(encontrado== false){
            System.out.println("correo o contraseña incorrectos");
        }
    }
}
