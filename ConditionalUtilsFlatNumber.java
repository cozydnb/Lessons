
// Тренажер номер 10 - Плоское число

public class ConditionalUtilsFlatNumber {
    public static boolean isDescendingNumber(int inputNumber) {
        if (inputNumber < 100 || inputNumber > 999) {
            // Если передано число меньше 100 или больше 999, метод вернет false.
            return false;
        }
        int firstDigit = inputNumber / 100; // Получаем первую цифру числа
        int secondDigit = (inputNumber % 100) / 10; // Получаем вторую цифру числа
        int thirdDigit = inputNumber % 10; // Получаем третью цифру числа
        if (firstDigit == secondDigit && secondDigit == thirdDigit) {
            // Если все три цифры числа равны между собой, это плоское число
            return true;
        } else {
            // Иначе это не плоское число
            return false;
        }
    }

    private ConditionalUtilsFlatNumber() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе числа 777 метод должен вернуть true - "
                + ConditionalUtilsFlatNumber.isDescendingNumber(777));
    }
}