package org.launchcode.studio7;

public class FloppyDisks extends BaseDisc implements OpticalDisc {

    public FloppyDisks() {
        super("360rpm", "1Mb", "write head aligns the magnetic polarities", "read head aligns the magnetic polarities", "floppy disc1","0.5Mb");
    }

    @Override
    public void spinDisc() {System.out.println("Floppy Disc RPM: "+getSpinSpeed()); }

    @Override
    public void storageDisc() {System.out.println("Floppy Disc storageCapacity: "+getStorageCapacity()); }

    @Override
    public void dataWrite() {  System.out.println("Floppy Disc dataWriteMethod: "+getDataWriteMethod());}

    @Override
    public void dataRead() { System.out.println("Floppy Disc dataReadMethod: "+getDataReadMethod()); }

    @Override
    public void returnInfo() { System.out.println("Floppy Disc returnInformation: "+toString()+"\n"); }
}
