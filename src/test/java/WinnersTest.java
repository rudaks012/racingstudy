import java.util.Arrays;

import domain.Car;
import domain.Winners;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WinnersTest {

    //1. 자동차 경주 참가자 5대가 존재한다.
    //3. 1번 참가자와 2번참가자가 제일 멀리 갔다. 1번고 2번은 3이고 나머지는 0이다(포지션)
    //4. 우승자를 선별 한다.
    //5. 선별한 우승자는 1번과 2번이다.
    @Test
    @DisplayName("우승자들을 선별하다.")
    void selectWinners() {
        // given
        Car car1 = new Car("1");
        Car car2 = new Car("2");
        Car car3 = new Car("3");
        Car car4 = new Car("4");
        Car car5 = new Car("5");

        car1.moveForward();
        car1.moveForward();
        car1.moveForward();
        car2.moveForward();
        car2.moveForward();
        car2.moveForward();
        // when
        Winners winners = new Winners(Arrays.asList(car1, car2, car3, car4, car5));
        String winnerNames = winners.getWinnerNames();
        // then
        Assertions.assertThat(winnerNames).isEqualTo("1,2,");
    }


    @Test
    @DisplayName("우승자들을 선별하다.")
    void selectWinners1() {
        // given
        Car car1 = new Car("1");
        Car car2 = new Car("2");
        Car car3 = new Car("3");
        Car car4 = new Car("4");
        Car car5 = new Car("5");

        car3.moveForward();
        car3.moveForward();
        car3.moveForward();
        car4.moveForward();
        car4.moveForward();
        car4.moveForward();
        // when
        Winners winners = new Winners(Arrays.asList(car1, car2, car3, car4, car5));
        String winnerNames = winners.getWinnerNames();
        // then
        Assertions.assertThat(winnerNames).isEqualTo("3,4,");
    }



}