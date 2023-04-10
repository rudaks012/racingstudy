public class Car {

    private int position;

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
