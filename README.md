# 3단계 - 자동차 경주
기능 요구사항
초간단 자동차 경주 게임을 구현한다.
주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

---
# 기능
1. 자동차는 전진할 수 있다. (domain.Car#moveForward)
   - 주어진 값이 4이상이면 움직일 수 있다. (domain.Car#canMove(status))
   - 자동자의 위치값을 알려줄 수 있다.(domain.Car#getPosition)
2. 자동차의 개수를 입력 할 수 있다. (view.Input#inputCarCount) 
3. 자동차는 이동횟수를 입력할 수 있어야 한다. (view.Input#inputMoveCount) 
4. 자동차의 위치 값 만큼 - 기호로 출력한다. (view.Output#printPosition)
5. '실행 결과'메시지를 출력한다. (view.Output#printResultMessage)
6. 주어진 수 만큼 자동차들을 생성 한다.(CarRacing#createCars(inputCount))
7. 자동차는 조건에 따라 이동한다(CarRacing#move(k3, canMove))

# 리팩터링
1. 입력
2. 출력
3. 자동차
4. 레이싱게임

# 단위테스트
1. domain.Car#canMove(status)
2. domain.Car#moveForward
3. CarRacing#createCars(inputCount)
4. CarRacing#move(k3, canMove)

# 우승자

## 기능 요구사항
- 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

## 기능
1. 자동차 이름을 부여한다.(domain.Car(name))
   1. 자동차의 이름은 5자를 초과할 수 없다.(domain.Car#validateNameLength(name))
2. 쉼표로 구분된 자동차 이름 목록을 받는다.(view.Input#inputCarNames)
3. 자동차의 이름과 위치를 출력한다.(view.Output#printNameAndPosition(car))
4. 우승자의 이름을 출력한다.(view.Output#printWinners(winners))
5. 우승자들을 선별하다.(domain.Winners#selectWinners(cars))
6. ,로 구분된 우승자들의 이름을 가져온다.(domain.Winners#getWinnerNames)
