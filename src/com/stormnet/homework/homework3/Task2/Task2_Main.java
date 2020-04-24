public class Task2_Main {

    private static Task2_Data Data = new Task2_Data();

    public static void main(String[] args) {
        int num1 = Data.getInt();
        int num2 = Data.getInt();
        char operation = Data.getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, Data.getOperation());
        }
        return result;
    }
}