public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        //Попытка деления на ноль. Можно решить двумя способами:
        // - Обработать исключение для NPE
        // - Изменить метод Calculator.devide. Например, добавив проверку на ноль
        // Вопрос решен вторым способом
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

    }


}
