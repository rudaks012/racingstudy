public class Car {

    private int position;

    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void moveForward() {
        position += 1;
    }

    public boolean canMove(int value) {
        return value >= 4;
    }

    public int getPosition() {
        return position;
    }
}
