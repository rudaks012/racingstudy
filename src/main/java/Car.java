public class Car {

    private int position;
    private String name;

    public Car() {

    }

    public Car(String name) {
        validateNameLength(name);
        this.name = name;
    }

    private void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차의 이름은 5자를 초과할 수 없다. ");
        }
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

    public String getName() {
        return name;
    }
}
