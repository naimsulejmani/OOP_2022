package lambda_expression;

import java.util.function.Consumer;

public class ConsumeString implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
