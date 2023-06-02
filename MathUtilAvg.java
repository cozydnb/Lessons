
// Тренажер номер 5 - средняя сумма простых чисел

public class MathUtilAvg {
    public static int getPrimeNumbersSum(byte a, int b) {
        // Проверяем, являются ли оба числа положительными и первое число меньше второго
        if (a < 0 || b < 0 || a >= b) {
            return 0;
        }
    
        int sum = 0; // Сумма четных чисел
        int count = 0; // Количество четных чисел
    
        // Проходим циклом по всем четным числам между a и b
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }
    
        if (count > 0) {
            // Если были найдены четные числа, вычисляем среднее и округляем вниз до целого числа
            return sum / count;
        } else {
            // Иначе возвращаем 0
            return 0;
        }
    }
    
    private MathUtilAvg() {

    }

    public static void main(String[] args) {
        System.out.println("avg четных чисел у ряда с 1 до 10 должен равняться 6 - "
                + MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 10));
    }
}
