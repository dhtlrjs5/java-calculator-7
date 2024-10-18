

package calculator;

import camp.nextstep.edu.missionutils.Console;

public class DisplayConsole {
    private static final String START = "덧셈할 문자열을 입력해 주세요.\n";
    private static final String RESULT = "결과 : ";

    private final InputValidator inputValidator = new InputValidator();

    public String input() {
        String result = Console.readLine();
        if (!inputValidator.checkDelimiter(result)) {
            throw new IllegalArgumentException();
        }
        return result;
    }

    public void startConsole() {
        System.out.print(START);
        Calculator calculator = new Calculator();
        endConsole(calculator.checkInput(input()));
    }

    public void endConsole(int result) {
        System.out.print(RESULT + result);
    }
}
