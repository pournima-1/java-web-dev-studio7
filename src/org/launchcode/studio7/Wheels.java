package org.launchcode.studio7;

public class Wheels extends NormalDiscAbstract implements NormalDiscInterface {
    public Wheels(){
        super("50mph","round");
    }

    @Override
    public void spinDisc() { System.out.println("Wheels RPM: "+getSpinSpeed()); }

    @Override
    public void shape() { System.out.println("Wheels RPM: "+getShape()+"\n"); }
}
