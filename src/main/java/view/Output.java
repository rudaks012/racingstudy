package view;

import domain.Car;
import domain.Winners;

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

    public void printNameAndPosition(Car car) {
        System.out.printf("%s : ", car.getName());
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void printWinners(Winners winners) {
        String winnerName = winners.getWinnerNames();

        System.out.println(winnerName + "가 최종 우승했습니다.");
    }
}
