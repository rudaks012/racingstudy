import domain.Car;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CarTest {

    @Test
    @DisplayName("주어진 값이 4이상이면 움직일 수 있다.")
    void canMove() {
        // given
        Car car = new Car();
        int value = 4;
        // when
        boolean actual = car.canMove(value);
        // then
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    @DisplayName("주어진 값이 4미만이면 움직일 수 없다.")
    void canNotMove() {
        // given
        Car car = new Car();
        int value = 3;
        // when
        boolean actual = car.canMove(value);
        // then
        Assertions.assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("자동차는 전진할 수 있다.")
    void moveForward() {
        // given
        Car car = new Car();
        // when
        car.moveForward();
        // then
        Assertions.assertThat(car.getPosition()).isEqualTo(1);
    }
}