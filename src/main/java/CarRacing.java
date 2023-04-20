import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarRacing {

    public static void main(String[] args) {
        Input input = new Input();
        List<String> names = input.inputCarNames();
        int inputMoveCount = Integer.parseInt(input.inputMoveCount());

        List<Car> cars = createCars(names);

        Output output = new Output();
        output.printResultMessage();

        for (int i = 0; i < inputMoveCount; i++) {
            for (Car k3 : cars) {
                boolean canMove = k3.canMove(new Random().nextInt(10));
                move(k3, canMove);
                output.printNameAndPosition(k3);
            }
            System.out.println();
        }
        Winners winners = new Winners(cars);
        output.printWinners(winners);
    }

    public static void move(Car k3, boolean canMove) {
        if (canMove) {
            k3.moveForward();
        }
    }

    public static List<Car> createCars(List<String> names) {
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }
}
