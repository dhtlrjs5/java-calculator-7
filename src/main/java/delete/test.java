package calculator.delete;

import calculator.InputValidator;

//todo 삭제
public class test {
    public static void main(String[] args) {
        //todo 어노테이션, 주석, 인터페이스, 추상클래스, 상속, 파일분리, 리팩토링, readMe
        //todo 1. 패키지 구분 2. 주석 달기 3. 인터페이스, 클래스 구분해서 정리 4. 어노테이션 작성 5. 리드미 작성 6. 커밋하기
        String input = "1";
        InputValidator validator = new InputValidator();
        System.out.println(input);
        System.out.println(input.matches("^\\d+([,:]\\d+)*$"));
        System.out.println(validator.checkDelimiter(input));
        input = "1,";
        System.out.println(input);
        System.out.println(input.matches("^\\d+([,:]\\d+)*$"));
        System.out.println(validator.checkDelimiter(input));
        input = ",1";
        System.out.println(input);
        System.out.println(input.matches("^\\d+([,:]\\d+)*$"));
        System.out.println(validator.checkDelimiter(input));
        input = "1,2:3";
        System.out.println(input);
        System.out.println(input.matches("^\\d+([,:]\\d+)*$"));
        System.out.println(validator.checkDelimiter(input));
        input = "111,222:333";
        System.out.println(input);
        System.out.println(input.matches("^\\d+([,:]\\d+)*$"));
        input = "//;\\n";
        System.out.println(input);
        System.out.println(validator.checkDelimiter(input));
        input = "//;\\n1";
        System.out.println(input);
        System.out.println(validator.checkDelimiter(input));
        input = "//;\\n1,2:3";
        System.out.println(input);
        System.out.println(validator.checkDelimiter(input));
        input = "//;\\n1,2;3";
        System.out.println(input);
        System.out.println(validator.checkDelimiter(input));
        input = "//;\\n1,-2;3";
        System.out.println(input);
        System.out.println(validator.checkDelimiter(input));
        input = "-2";
        System.out.println(input);
        System.out.println(validator.checkDelimiter(input));
    }
}
