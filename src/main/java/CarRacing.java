import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarRacing {

    public static void main(String[] args) {
        Input input = new Input();
        int inputCarCount = Integer.parseInt(input.inputCarCount());
        int inputMoveCount = Integer.parseInt(input.inputMoveCount());

        List<Car> cars = new ArrayList<>();
        for (int j = 0; j < inputCarCount; j++) {
            cars.add(new Car());
        }

        Output output = new Output();
        output.printResultMessage();

        for (int i = 0; i < inputMoveCount; i++) {
            for (Car k3 : cars) {
                boolean canMove = k3.canMove(new Random().nextInt(10));
                if (canMove) {
                    k3.moveForward();
                }
                output.printPosition(k3);
            }
            System.out.println();
        }
    }
}