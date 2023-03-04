public class Screwdriver extends Tool {
    public Screwdriver(Tool tool) {
        super(tool);
    }

    public Screwdriver() {
        super();
    }

    /*@Override
    public void work() {
        workable.work();
        uniqueWork();
    }*/

    @Override
    public void uniqueWork() {
        System.out.println("Vodka + Orange Juice");
    }
}