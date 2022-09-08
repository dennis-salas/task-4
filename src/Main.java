public class Main {
    public static void main(String[] args) {
        Cliente cliente =  new Cliente();
        cliente.setNombre("Maria");
        cliente.setEdad(25);
        cliente.setTelefono("3107522173");
        cliente.setCredito("aprobado");
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());


        Trabajador trabajador =  new Trabajador();
        trabajador.setNombre("Jose");
        trabajador.setEdad(28);
        trabajador.setTelefono("3107522173");
        trabajador.setSueldo("SLMV");
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSueldo());
    }
}

class Persona {
    String nombre;
    int edad;
    String telefono;

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getTelefono(){
        return this.telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    String credito;

    public String getCredito(){
        return this.credito;
    }

    public void setCredito(String credito){
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    String sueldo;

    public String getSueldo(){
        return this.sueldo;
    }

    public void setSueldo(String sueldo){
        this.sueldo = sueldo;
    }
}



