package org.launchcode.studio7;

public class Frisbee extends NormalDiscAbstract implements NormalDiscInterface {
    public Frisbee(){  super("100mph","round");  }

    public Frisbee(String speed, String shape) { super(speed, shape);  }

    @Override
    public void spinDisc() { System.out.println("Frisbee RPM: "+getSpinSpeed()); }

    @Override
    public void shape() { System.out.println("Frisbee RPM: "+getShape()+"\n");  }
}
