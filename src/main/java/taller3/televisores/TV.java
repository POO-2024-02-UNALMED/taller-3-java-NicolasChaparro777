package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV; 

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public Marca getMarca(){
        return this.marca;
    }
    public void setMarca(Marca nuevaMarca){
        this.marca = nuevaMarca;
    }

    public int getPrecio(){
        return this.precio;
    }
    public void setPrecio(int nuevoPrecio){
        this.precio = nuevoPrecio;
    }

    public int getCanal(){
        return this.canal;
    }
    public void setCanal(int nuevoCanal){
        if (this.estado == true){
            if (nuevoCanal >= 1 && nuevoCanal <= 120){
                this.canal = nuevoCanal;
            }
        }
    }

    public int getVolumen(){
        return this.volumen;
    }
    public void setVolumen(int nuevoVolumen){
        if (this.estado == true){
            if (nuevoVolumen >= 0 && nuevoVolumen <= 7){
                this.volumen = nuevoVolumen;
            }
        }
    }

    public Control getControl(){
        return this.control;
    }
    public void setControl(Control nuevoControl){
        this.control = nuevoControl;
    }

    public static int getNumTV(){
        return numTV;
    }
    public static void setNumTV(int nuevoNumTV){
        numTV = nuevoNumTV;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void turnOff(){
        this.estado = false;
    }
    public void turnOn(){
        this.estado = true;
    }

    public void canalUp(){
        if (this.estado == true){
            if (this.canal < 120){
                this.canal += 1;
            }
        }
    }
    public void canalDown(){
        if (this.estado == true){
            if (this.canal > 1){
                this.canal -= 1;
            }
        }
    }

    public void volumenUp(){
        if (this.estado == true){
            if (this.volumen < 7){
                this.volumen += 1;
            }
        }
    }
    public void volumenDown(){
        if (this.estado == true){
            if (this.volumen > 0){
                this.volumen -= 1;
            }
        }
    }
}
