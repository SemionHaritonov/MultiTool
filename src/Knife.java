public class Knife extends Tool{
    public Knife(Tool tool) {
        super(tool);
    }

    public Knife() {

    }

    @Override
    public void work() {
        if (workable != null) workable.work();
        System.out.println("Snak-snak");
    }
}
