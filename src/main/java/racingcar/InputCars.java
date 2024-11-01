package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.*;

public class InputCars {
    public Map<String, Integer> receiveCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();

        if (input.contains(" ")) {
            throw new IllegalArgumentException();
        }
        List<String> tempCars = Arrays.stream(input.split(",")).toList();
        Set<String> cars = new HashSet<>(tempCars);  // 중복된 차 이름 제거 위해 Set으로 변환
        for (var car : cars) {
            if (car.length() > 5) {
                throw new IllegalArgumentException();
            }
        }

        Map<String, Integer> carValues = new HashMap<>();
        for (var car : cars) {
            carValues.put(car, 0);
        }

        return carValues;
    }
}
