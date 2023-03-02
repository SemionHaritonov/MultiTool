public class Main {
    public static void main(String[] args) {
        Tool multitool = new Knife(new Hammer(new Knife(new Screwdriver())));
        multitool.work();
    }
}