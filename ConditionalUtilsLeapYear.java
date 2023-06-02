// Тренажер номер 9 - Високосный год 

public class ConditionalUtilsLeapYear {
    public static boolean isLeapYear(int inputYear) {
        if (inputYear % 4 != 0) {
            // Если год не делится на 4 без остатка, он точно не високосный
            return false;
        } else if (inputYear % 100 != 0) {
            // Если год делится на 4, но не делится на 100 без остатка, он високосный
            return true;
        } else if (inputYear % 400 == 0) {
            // Если год делится на 400 без остатка, он високосный
            return true;
        } else {
            // В остальных случаях год не високосный
            return false;
        }
    }
    

    private ConditionalUtilsLeapYear() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе числа 2004, метод должен вернуть true - " + ConditionalUtilsLeapYear.isLeapYear(2004));
    }
}