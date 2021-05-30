package org.launchcode.studio7;

public abstract class BaseDisc {
    String spinSpeed, storageCapacity, dataWriteMethod, dataReadMethod, returnInformation,content;

    public BaseDisc(String spinSpeed, String storageCapacity,String dataWriteMethod, String dataReadMethod,String returnInformation, String content) {
        setSpinSpeed(spinSpeed);
        setStorageCapacity(storageCapacity);
        setDataWriteMethod(dataWriteMethod);
        setDataReadMethod(dataReadMethod);
        setReturnInformation(returnInformation);
        setContent(content);
    }

    //spin speed
    public String getSpinSpeed(){
        return this.spinSpeed;
    }
    public void setSpinSpeed(String spinSpeed){
        this.spinSpeed=spinSpeed;
    }

    //storage capacity
    public String getStorageCapacity(){
        return this.storageCapacity;
    }
    public void setStorageCapacity(String storageCapacity){
        this.storageCapacity=storageCapacity;
    }

    //data write method
    public String getDataWriteMethod(){ return this.dataWriteMethod;  }
    public void setDataWriteMethod(String dataWriteMethod){
        this.dataWriteMethod=dataWriteMethod;
    }

    //data read method
    public String getDataReadMethod(){
        return this.dataReadMethod;
    }
    public void setDataReadMethod(String dataReadMethod){
        this.dataReadMethod=dataReadMethod;
    }

    //information returned
    public String getReturnInformation(){
        return this.returnInformation;
    }
    public void setReturnInformation(String returnInformation){
        this.returnInformation=returnInformation;
    }

    //data read method
    public String getContent(){
        return this.content;
    }
    public void setContent(String content){
        this.content=content;
    }

    @Override
    public String toString() {
        return "Name: " + getReturnInformation() + "\n" +
                "Capacity: $" + getStorageCapacity() + "\n" +
                "Data Used: " + getContent() + "\n";


    }
}
