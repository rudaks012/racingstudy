package domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    private final List<Car> winners;

    public Winners(List<Car> cars) {
        this.winners = selectWinners(cars);
    }

    public List<Car> selectWinners(List<Car> cars) {
        int maxPosition = findMaxPosition(cars);
        return findWinners(cars, maxPosition);
    }

    private int findMaxPosition(List<Car> cars) {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    private List<Car> findWinners(List<Car> cars, int maxPosition) {
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            addWinner(maxPosition, winners, car);
        }
        return winners;
    }

    private void addWinner(int maxPosition, List<Car> winners, Car car) {
        if (maxPosition == car.getPosition()) {
            winners.add(car);
        }
    }

    public String getWinnerNames() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Car winner : winners) {
            stringBuilder.append(winner.getName()).append(",");
        }

        return stringBuilder.toString();
    }

}
