public class Hammer extends Tool{

    public Hammer(Tool tool) {
        super(tool);
    }

    public Hammer() {

    }

    /*@Override
    public void work() {
        workable.work();
        uniqueWork();
        
    }*/

    @Override
    public void uniqueWork() {
        System.out.println("Knock-knock");
    }
}
