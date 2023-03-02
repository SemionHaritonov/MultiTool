public class Screwdriver extends Tool {
    public Screwdriver(Tool tool) {
        super(tool);
    }

    public Screwdriver() {
        super();
    }

    @Override
    public void work() {
        if (workable != null) workable.work();
        System.out.println("Vodka + Orange Juice");
    }
}