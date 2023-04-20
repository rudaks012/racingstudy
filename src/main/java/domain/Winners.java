package domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    private List<Car> winners;

    public Winners(List<Car> cars) {
        this.winners = selectWinners(cars);
    }

    public List<Car> selectWinners(List<Car> cars) {
        int maxPosition = 0;
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }

        for (Car car : cars) {
            if (maxPosition == car.getPosition()) {
                winners.add(car);
            }
        }

        return winners;
    }

    public String getWinnerNames() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Car winner : winners) {
            stringBuilder.append(winner.getName()).append(",");
        }

        return stringBuilder.toString();
    }

}