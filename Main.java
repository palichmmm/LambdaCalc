import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c;
//        Лямбда выражение ниже выдает ошибку! Потому что произошел случай деления на 0
//        int c = calc.devide.apply(a, b);
//        Вариант решения проверять переменную b. И если она не является 0 то выполнять лямбда выражение.
        if (calc.isPositive.test(Math.abs(b)))  {
            c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } else {
            System.out.println("Ошибка! Деление на ноль!");
        }
//        Еще вариант отлавливать ошибку конструкцией try { лямбда } catch (Exception e) { ... }
    }
}
