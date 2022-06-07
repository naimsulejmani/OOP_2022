package lambda_expression;

public class NumberGeneratorTest {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator() {
            @Override
            public int generate() {
                return (int) (Math.random() * 100) + 1;
            }
        };

        NumberGenerator generatorLambda = () -> (int) (Math.random() * 100) + 1;

        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
    }
}
