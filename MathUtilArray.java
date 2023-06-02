
// Тренажер номер 6 - строка четных чисел

public class MathUtilArray {

    public static String getEvenNumbersUpTo(byte number) {
        if (number < 0) {
            return "";
        } else if (number == 0) {
            return "1";
        }

        StringBuilder result = new StringBuilder(); // Создаем объект, который будет содержать ответ

        // Проходим циклом по всем четным числам от 2 до переданного n включительно и
        // добавляем их в ответ
        for (int i = 2; i <= number; i += 2) {
            result.append(i);
        }

        return result.toString();
    }

    private MathUtilArray() {

    }

    public static void main(String[] args) {
        System.out.println("Если передать число 5, то метод должен вернуть строку 24 - "
                + MathUtilArray.getEvenNumbersUpTo((byte) 5));
    }
}
