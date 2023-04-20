package view;

import java.util.Arrays;
import java.util.List;
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

    public List<String> inputCarNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        return Arrays.asList(scanner.nextLine().split(","));
    }
}
