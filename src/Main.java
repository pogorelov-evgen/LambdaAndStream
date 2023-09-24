public class Main {
    public static void fire(){
        System.out.println("Fire in the Main");
    }
    public static void main(String[] args) {


        Switch aSwitch = new Switch();
        Lamp lamp = new Lamp();
        aSwitch.addConsumer(lamp);
        aSwitch.addConsumer(new Radio());
        aSwitch.addConsumer(()-> System.out.println("Fire!"));
       aSwitch.addConsumer(()-> Main.fire());




        aSwitch.turnOn();


    }
}