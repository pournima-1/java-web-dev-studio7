package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public static final String reWritable = "No";

    public CD (){
        super("500rpm","5GB","laser","laser","CD1","3GB");
    }

    public void reWritable()
    {
        System.out.println("CD Re-Writable: "+reWritable+"\n");
    }


    @Override
    public void spinDisc() { System.out.println("CD RPM: "+getSpinSpeed()); }

    @Override
    public void storageDisc() {
        System.out.println("CD storageCapacity: "+getStorageCapacity());
    }

    @Override
    public void dataWrite() {
        System.out.println("CD dataWriteMethod: "+getDataWriteMethod());
    }

    @Override
    public void dataRead() {
        System.out.println("CD dataReadMethod: "+getDataReadMethod());
    }

    @Override
    public void returnInfo() {
        System.out.println("CD returnInformation: "+toString());
    }
}
