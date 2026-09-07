
public class Usuario {

    String nombre;
    String correo;
    String clave;
    int  edad;

    public Usuario(String nombre,String correo,String clave, int edad){
        this.nombre=nombre;
        this.correo = correo;
        this.clave=clave;
        this .edad = edad;
    }

    public String getNombre(){
        return  nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave(){
        return clave;
    }

    public int getEdad(){
        return  edad;
    }

    //probar la consola xd
    public void mostrarDatos(){
        System.out.println("nombre: "+nombre);
        System.out .println("correo: " + correo);
        System.out.println("edad: "+ edad );
    }

}
