package main.factory;

public class Car {
    
    private String model;
    private int buildYear;
    private String color;
    private int maxSpeed;
    private int ccm;
    private int consumption;
    private int milage;
    
    public Car(){
        this.model = "undefined";
        this.buildYear = -1;
        this.color = "undefined";
        this.maxSpeed = -1;
        this.ccm = -1;
        this.consumption = 0;
        this.milage = 0;
    }
    
    public Car(String customModel, int customBuildYear, String customColor, int customMaxSpeed, int customCcm){
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.color = customColor;
        this.maxSpeed = customMaxSpeed;
        this.ccm = customCcm;
    }

    public Car(String model, int buildYear, String color, int maxSpeed, int ccm, int consumption, int milage) {
        this.model = model;
        this.buildYear = buildYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.ccm = ccm;
        this.consumption = consumption;
        this.milage = milage;
    }
    
    
    
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String customModel) {
        this.model = customModel;
    }
    
    public int getBuildYear () {
        return this.buildYear;
    }
    
    public void setBuildYear(int customBuildYear){
            this.buildYear = customBuildYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String customColor) {
        this.color = customColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int customMaxSpeed) {
        this.maxSpeed = customMaxSpeed;
    }

    public int getCcm() {
        return ccm;
    }

    public void setCcm(int customCcm) {
        this.ccm = customCcm;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }
    
    
    
    public void printAttributes() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Ccm: " + this.getCcm());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println("Kilometraza: " + this.getMilage());
        System.out.println("Maksimalna brzina: " + this.getMaxSpeed());
        System.out.println();
    }
    
    public void goToTravel (int distance) {
        this.setMilage(this.getMilage()+ distance);
    }
}