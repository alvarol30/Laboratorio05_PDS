package lab05_adaptador;
public class AdaptadorDrone implements Pato{
    protected Drone drone;
    public void AdaptadorDrone(Drone drone){
        this.drone= drone;
    }
    @Override
    public void cuaquear(){
        drone.beep();
    }
    @Override
    public void volar(){
        drone.despegar();
    }
}
