package org.launchcode.studio7;


public class DVD extends BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public static final String reWritable = "Yes";


    public DVD (){
        super("1000rpm","100GB","laser","laser","DVD1","50GB");
    }

    public void reWritable()
    {
        System.out.println("DVD Re-Writable: "+reWritable+"\n");
    }


    @Override
    public void spinDisc() {
        System.out.println("DVD RPM: "+getSpinSpeed());
    }

    @Override
    public void storageDisc() {
        System.out.println("DVD storageCapacity: "+getStorageCapacity());
    }

    @Override
    public void dataWrite() {
        System.out.println("DVD dataWriteMethod: "+getDataWriteMethod());
    }

    @Override
    public void dataRead() {
        System.out.println("DVD dataReadMethod: "+getDataReadMethod());
    }

    @Override
    public void returnInfo() {
        System.out.println("DVD returnInformation: "+toString());
    }


}
