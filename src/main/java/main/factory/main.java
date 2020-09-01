package main.factory;

public class main {
    
    public static void main(String[] args) {
        System.out.println("Pocetak");
        
        Car audi8 = new Car();
        audi8.printAttributes();
        
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
        
        Car lada = new Car("Lada Niva", 1990, "green", 120, 50);
        lada.printAttributes();
//      System.out.println("Model automobila je " + lada.getModel());
        
        Car opel = new Car("Opel", 2002, "blue", 200, 1300, 7, 150000);
        opel.printAttributes();
        opel.goToTravel(200);
        opel.printAttributes();
        
    }
    
}
