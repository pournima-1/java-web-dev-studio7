package org.launchcode.studio7;

public class VinylRecords extends BaseDisc implements OpticalDisc{

    public VinylRecords() {
        super("33rpm", "10Mb", "electrical signal of sound waves", "electrical signal of sound waves", "vinyl record1","2Mb");
    }

    @Override
    public void spinDisc() { System.out.println("Vinyl Record RPM: "+getSpinSpeed()); }

    @Override
    public void storageDisc() {System.out.println("Vinyl Record storageCapacity: "+getStorageCapacity());}

    @Override
    public void dataWrite() { System.out.println("Vinyl Record dataWriteMethod: "+getDataWriteMethod()); }

    @Override
    public void dataRead() { System.out.println("Vinyl Record dataReadMethod: "+getDataReadMethod()); }

    @Override
    public void returnInfo() { System.out.println("Vinyl Record returnInformation: "+toString()+"\n"); }
}
