import java.util.Scanner;

public class Input {

    public String inputCarCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 개수 입력");
        return scanner.nextLine();
    }

    public String inputMoveCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이동횟수 입력");
        return scanner.nextLine();
    }
}
