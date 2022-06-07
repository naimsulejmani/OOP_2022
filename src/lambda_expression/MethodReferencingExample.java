package lambda_expression;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferencingExample {
    public static void main(String[] args) {
        //Anonymous Class
        Consumer<String> consumeAC = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        //lambda expression
        Consumer<String> consume = (s) -> System.out.println(s);
        //method referencing
        Consumer<String> consumeMR = System.out::println;

        consume.accept("NAIM");

        consume.accept("FILAN");

        consumeMR.accept("ALBI");
    }
}



