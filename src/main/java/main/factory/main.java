package main.factory;

public class main {
    
    public static void main(String[] args) {
        System.out.println("Pocetak");
        
        int x = 5;
        Car auto1 = new Car();
        
        auto1.model = "Audi";
        auto1.buildYear = 2003;
        auto1.ccm = 2000;
        
        System.out.println("Model automobila je " + auto1.model);
        
        int y = 29;
        Car auto2 = new Car();
        auto2.model = "Fiat";
        auto2.buildYear = 2019;
        
        System.out.println("Model automobila je " + auto2.model);
    }
    
}
