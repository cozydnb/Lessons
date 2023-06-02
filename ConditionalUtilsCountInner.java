// Тренажер номер 7 - Внутреннее число

public class ConditionalUtilsCountInner {

    public static int countInnerNumber(int base, int checkNumber) {
        // Дополним двузначное число нулем слева, чтобы получить строку из двух символов
        String twoDigitStr = String.format("%02d", checkNumber);

        // Преобразуем четырехзначное число в строку и идем циклом по всем возможным
        // парам смежных цифр
        String fourDigitStr = String.valueOf(base);
        int count = 0;
        for (int i = 0; i < fourDigitStr.length() - 1; i++) {
            String pair = fourDigitStr.substring(i, i + 2); // Пара из смежных цифр (2 символа)

            if (pair.contains(twoDigitStr)) { // Если пара содержит двузначное число, то увеличиваем счетчик
                count++;
            }
        }

        return count;
    }

    private ConditionalUtilsCountInner() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе чисел 6522 и 22 метод должен вернуть 1 - "
                + ConditionalUtilsCountInner.countInnerNumber(6522, 22));
    }
}
