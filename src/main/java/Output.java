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
}
