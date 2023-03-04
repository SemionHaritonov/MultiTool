public abstract class Tool implements Workable{
    protected Workable workable;

    public Tool() {

    }

    public Tool(Workable workable) {
        this.workable = workable;
    }

    @Override
    public void work() {
        uniqueWork();
        if (workable != null) {
            workable.work();
        }
    }

    abstract public void uniqueWork();

}
