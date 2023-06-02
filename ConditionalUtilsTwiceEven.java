// Тренажер номер 8 - Дважды четное число

public class ConditionalUtilsTwiceEven {
    public static boolean isDoublePrime(int inputNumber) {
        // Проверяем, что число трехзначное (от 100 до 999)
        if (inputNumber < 100 || inputNumber > 999) {
            return false; // Если число меньше 100 или больше 999, возвращаем false
        }

        int sum = 0;
        int product = 1;

        // Разбиваем число на цифры и вычисляем сумму и произведение
        while (inputNumber > 0) {
            int digit = inputNumber % 10; // Получаем последнюю цифру числа
            if (digit % 2 != 0) {
                return false; // Если цифра нечетная, возвращаем false
            }
            sum += digit;
            product *= digit;
            inputNumber /= 10; // Убираем последнюю цифру из числа
        }

        // Проверяем, что и сумма, и произведение четные
        return sum % 2 == 0 && product % 2 == 0;
    }

    private ConditionalUtilsTwiceEven() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе числа 222 метод должен вернуть true - " + ConditionalUtilsTwiceEven.isDoublePrime(222));
    }
}