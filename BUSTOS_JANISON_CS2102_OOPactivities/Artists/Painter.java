public class Painter extends Artist {
    private Medium medium;

    public Painter(String name, int age, String specialty, Medium medium) {
        super(name, age, specialty);
        this.medium = medium;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}
