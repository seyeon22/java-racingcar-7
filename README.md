# java-racingcar-precourse 기능 목록

### 1. main 함수 생성
- 시작 지점이자 전체 흐름을 제어하는 main 함수에서 각각의 기능들을 실행한다.

### 2. InputCars
- 경주할 자동차 이름을 입력받는다.
  - 이름을 5자 초과로 입력한 경우 `IllegalArgumentException`을 발생시키며 종료한다.
  - 한 명이라도 입력받지 않으면 다음 단계로 넘어가지 않는다.
  - 중복된 이름을 입력한 경우 `IllegalArgumentException`을 발생시키며 종료한다.

### 3. InputNumber
- 시도할 횟수를 입력 받는다.

### 4. PlayGames
- 시도 횟수와, 경주할 자동차를 반복문으로 중첩하여 반복하는 역할을 한다.
- 반복문 안에서 랜덤값을 검사하고, 실행결과를 출력하는 `GoOrStop`이라는 클래스로 넘어간다.

### 5. GoOrStop
- 랜덤값을 발생시켜 검사하고, 전진을 할 지 멈출지 결정한다.

### 6. PrintWinner
- 게임 결과를 바탕으로 최종 우승자를 가려내고, 최종 우승자를 출력한다.

### 7. 테스트 코드 작성
- 각종 예외 상황을 다 통과할 수 있는 테스트 코드 작성을 통해 요구사항을 충족했는지 확인한다.

### 8. 리팩토링
- 클린 코드가 될 수 있도록 디자인 패턴을 참고하여 작성된 코드를 개선한다.