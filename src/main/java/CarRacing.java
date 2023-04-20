import domain.Car;
import domain.Winners;
import view.Input;
import view.Output;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarRacing {

    private static final Input input = new Input();
    private static final Output output = new Output();

    public static void main(String[] args) {

        List<String> names = input.inputCarNames();
        int inputMoveCount = Integer.parseInt(input.inputMoveCount());

        List<Car> cars = createCars(names);

        output.printResultMessage();

        for (int i = 0; i < inputMoveCount; i++) {
            moveCars(cars);
            System.out.println();
        }

        Winners winners = new Winners(cars);
        output.printWinners(winners);
    }

    private static void moveCars(List<Car> cars) {
        for (Car k3 : cars) {
            boolean canMove = k3.canMove(new Random().nextInt(10));
            move(k3, canMove);
            output.printNameAndPosition(k3);
        }
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
