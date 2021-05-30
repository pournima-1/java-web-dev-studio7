package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD cd = new CD();
        DVD dvd = new DVD();
        VinylRecords vr = new VinylRecords();
        FloppyDisks fd = new FloppyDisks();

        Wheels wh = new Wheels();
        Frisbee fr = new Frisbee();

        // TODO: Call each CD and DVD method to verify that they work as expected.

        cd.spinDisc();
        cd.storageDisc();
        cd.dataRead();
        cd.dataWrite();
        cd.returnInfo();
        cd.reWritable();

        dvd.spinDisc();
        dvd.storageDisc();
        dvd.dataRead();
        dvd.dataWrite();
        dvd.returnInfo();
        dvd.reWritable();

        vr.spinDisc();
        vr.storageDisc();
        vr.dataRead();
        vr.dataWrite();
        vr.returnInfo();

        fd.spinDisc();
        fd.storageDisc();
        fd.dataRead();
        fd.dataWrite();
        fd.returnInfo();

        wh.spinDisc();
        wh.shape();

        fr.spinDisc();
        fr.shape();
    }
}
