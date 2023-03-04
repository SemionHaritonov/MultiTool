public class Knife extends Tool{
    public Knife(Tool tool) {
        super(tool);
    }

    public Knife() {

    }

    /*@Override
    public void work() {
        workable.work();
        uniqueWork();
    }*/

    @Override
    public void uniqueWork() {
        System.out.println("Snak-snak");
    }
}
