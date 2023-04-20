package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input {

    public static final Scanner SCANNER = new Scanner(System.in);

    public String inputMoveCount() {
        System.out.println("이동횟수 입력");
        return SCANNER.nextLine();
    }

    public List<String> inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        return Arrays.asList(SCANNER.nextLine().split(","));
    }
}
