package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class CarInput {

    public static List<String> InputCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        return Arrays.stream(input.split(",")).toList();
    }

    public static String inputCarRaceRap() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return Console.readLine();
    }
}
