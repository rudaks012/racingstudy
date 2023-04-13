import java.util.List;

public class Output {

    public void printResultMessage() {
        System.out.println("실행 결과");
    }

    public void printPosition(Car car) {
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void printCars(Car car) {

//        System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        StringBuilder builder  = new StringBuilder();
        for (int i = 0; i < car.getPosition(); i++) {
            builder.append("-");
        }
        System.out.println(car.getName()+ " : " + builder.toString());


    }

    public void printWinners(List<Car> winners) {
        System.out.print("Winner(s): ");
        for (int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i).getName());
            if (i < winners.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
