package org.launchcode.studio7;

public abstract class NormalDiscAbstract {
    String speed, shape;

    public NormalDiscAbstract(String speed, String shape) {
        setSpinSpeed(speed);
        setShape(shape);
    }

    //spin speed
    public String getSpinSpeed(){
        return this.speed;
    }
    public void setSpinSpeed(String speed){
        this.speed=speed;
    }

    //shape
    public String getShape(){
        return this.shape;
    }
    public void setShape(String shape){
        this.shape=shape;
    }

}
