public class Radio implements Consumer{

    private void radioOn(){
        System.out.println("The Radio playing!");
    }
    @Override
    public void turning() {
        radioOn();
    }
}
