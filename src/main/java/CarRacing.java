import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarRacing {

    public static void main(String[] args) {
        Input input = new Input();
        int inputCarCount = Integer.parseInt(input.inputCarCount());
        int inputMoveCount = Integer.parseInt(input.inputMoveCount());

        List<Car> cars = createCars(inputCarCount);

        Output output = new Output();
        output.printResultMessage();

        for (int i = 0; i < inputMoveCount; i++) {
            for (Car k3 : cars) {
                boolean canMove = k3.canMove(new Random().nextInt(10));
                move(k3, canMove);
                output.printPosition(k3);
            }
            System.out.println();
        }
    }

    public static void move(Car k3, boolean canMove) {
        if (canMove) {
            k3.moveForward();
        }
    }

    public static List<Car> createCars(int inputCarCount) {
        List<Car> cars = new ArrayList<>();
        for (int j = 0; j < inputCarCount; j++) {
            cars.add(new Car());
        }
        return cars;
    }
}
