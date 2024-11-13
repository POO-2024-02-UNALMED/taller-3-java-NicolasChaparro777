package taller3.televisores;

public class Control {
    private TV tv;

    public void enlazar(TV tvEnlazar){
        tvEnlazar.setControl(this);
        this.tv = tvEnlazar;
    }

    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnOff();
    }

    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }

    public void volumenUp(){
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }

    public void setCanal(int nuevoCanal){
        tv.setCanal(nuevoCanal);
    }
    public void setVolumen(int nuevoVolumen){
        tv.setVolumen(nuevoVolumen);
    }

    public TV getTv(){
        return this.tv;
    }
    public void setTv(TV nuevoTV){
        this.tv = nuevoTV;
    }
}
