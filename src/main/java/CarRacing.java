import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CarRacing {

    public static void main(String[] args) {
        Input input = new Input();
        String[] carNames = input.inputCarCount().split(",");

        int inputCarCount = carNames.length;
        int inputMoveCount = Integer.parseInt(input.inputMoveCount());

        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }

        Output output = new Output();
        output.printResultMessage();

        for (int i = 0; i < inputMoveCount; i++) {
            for (Car k3 : cars) {
                boolean canMove = k3.canMove(new Random().nextInt(10));
                if (canMove) {
                    k3.moveForward();
                }

                output.printCars(k3);
            }
            System.out.println();
        }
        List<Car> winners = findWinners(cars);
        output.printWinners(winners);
    }


    private static List<Car> findWinners(List<Car> cars) {
        int maxPosition = 0;
        List<Car> winners = new ArrayList<>();

        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                winners.clear();
                winners.add(car);
                maxPosition = car.getPosition();
            } else if (car.getPosition() == maxPosition) {
                winners.add(car);
            }
        }

        return winners;
    }
}
