package main.factory;

public class main {
    
    public static void main(String[] args) {
        System.out.println("Pocetak");
        
        Car audi8 = new Car();
        
        audi8.setModel("Audi A8");
        audi8.setBuildYear(2003);
        audi8.setCcm(2000);
        audi8.setColor("green");
        
//        System.out.println("Model automobila je " + audi8.getModel());
        audi8.printAttributes();
        
        Car fiatPunto = new Car();
        fiatPunto.setModel("Fiat");
        fiatPunto.setBuildYear(2019);
        
        System.out.println("Model automobila je " + fiatPunto.getModel());
        fiatPunto.printAttributes();
        
        Car lada = new Car();
        lada.setModel("Lada");
                
        System.out.println("Model automobila je " + lada.getModel());
        lada.printAttributes();
    }
    
}
