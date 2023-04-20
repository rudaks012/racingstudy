import java.util.List;

import domain.Car;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarRacingTest {

    @Test
    @DisplayName("자동차는 조건에 따라 이동한다")
    void move() {
        // given
        Car car = new Car();
        Car stopCar = new Car();
        // when
        CarRacing.move(car, true);
        CarRacing.move(stopCar, false);

        // then
        Assertions.assertThat(car.getPosition()).isEqualTo(1);
        Assertions.assertThat(stopCar.getPosition()).isEqualTo(0);
    }

//    @Test
//    @DisplayName("주어진 수 만큼 자동차들을 생성 한다.")
//    void createCars() {
//        // given
//        int carCount = 5;
//        // when
//        List<domain.Car> cars = CarRacing.createCars(carCount);
//        // then
//        Assertions.assertThat(cars.size()).isEqualTo(carCount);
//    }

    @Test
    @DisplayName("주어진 자동차의 이름 만큼 자동차를 생성 한다.")
    void createCars() {
        // given
        List<String> carNames = List.of("경만","정운","용주","poby","apple");
        // when
        List<Car> cars = CarRacing.createCars(carNames);
        // then
        Assertions.assertThat(cars.size()).isEqualTo(5);
    }
}