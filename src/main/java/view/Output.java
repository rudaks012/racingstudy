package view;

import domain.Car;
import domain.Winners;

import static java.lang.System.out;

public class Output {

    public void printResultMessage() {
        out.println("실행 결과");
    }

    public void printNameAndPosition(Car car) {
        out.printf("%s : ", car.getName());
        for (int i = 0; i < car.getPosition(); i++) {
            out.print("-");
        }
        out.println();
    }

    public void printWinners(Winners winners) {
        String winnerName = winners.getWinnerNames();
        out.println(winnerName + "가 최종 우승했습니다.");
    }
}
