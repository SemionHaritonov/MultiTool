public class Hammer extends Tool{

    public Hammer(Tool tool) {
        super(tool);
    }

    public Hammer() {

    }

    @Override
    public void work() {
        if (workable != null) workable.work();
        System.out.println("Knock-knock");
        
    }
}
