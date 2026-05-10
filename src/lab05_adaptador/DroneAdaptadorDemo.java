package lab05_adaptador;
public class DroneAdaptadorDemo {
public static void main(String[] args){
        PatoReal pr1= new PatoReal();
        SuperDrone sd1 = new SuperDrone();
        Pato pd1 = new AdaptadorDrone(sd1);
        
        System.out.println("El drone hace...");
        sd1.beep(); 
        sd1.despegar();
        
         System.out.println("\nEl pato hace...");
        PruebaAdapter(pr1);

        System.out.println("\nEl AdaptadorPato hace...");
        PruebaAdapter(pd1);
    }
        static void PruebaAdapter(Pato pato) {
                pato.cuaquear();
                pato.volar();
            }
    
}
