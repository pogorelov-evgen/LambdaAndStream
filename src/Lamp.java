public class Lamp implements Consumer{

    private void lampOn(){
        System.out.println("Lamp is on!");
    }
    public void turning(){
        lampOn();
    }
}
