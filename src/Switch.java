import java.util.ArrayList;
import java.util.List;

public class Switch {
    List<Consumer> list = new ArrayList<Consumer>();

    private Consumer consumer;
    public void addConsumer(Consumer consumer){
        list.add(consumer);
    }

    public void turnOn(){
        System.out.println("Switch is on");
        for(Consumer consumer1:list) {
            consumer1.turning();
        }
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public Consumer getConsumer() {
        return consumer;
    }


}
