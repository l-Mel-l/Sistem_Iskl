public class Main {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            // Обработка исключения без прерывания основного кода
            System.out.println("Произошла ошибка деления на ноль: " + e.getMessage());
            // Можно выполнить дополнительные действия
        }

        // Основной код продолжает работать после обработки исключения
        System.out.println("Программа завершена");
    }

    public static int divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return num1 / num2;
    }
}

