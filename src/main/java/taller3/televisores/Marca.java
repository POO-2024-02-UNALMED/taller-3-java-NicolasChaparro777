package taller3.televisores;

public class Marca {
    private String nombre;

    public Marca(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nuevaMarca){
        this.nombre = nuevaMarca;
    }
}
