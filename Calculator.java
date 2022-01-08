import java.util.function.*;

public class Calculator  {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        // отлавливаем исключение
        try {
            return x / y;
        } catch (ArithmeticException err) {
            System.out.println(x + " / " + y + " = Ошибка! Деление на ноль!!! " + err);
            return 0;
        }
        // или второе решение: проверяем (y) на ноль и выводим сообщение об ошибке
    };
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
