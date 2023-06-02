// Тренажер номер 11 - Стороны треугольника

public class ConditionalUtilsTriangleSides {
    public static boolean isTriangleSides(int aSide, int bSide, int cSide) {
        if (aSide + bSide <= cSide || aSide + cSide <= bSide || bSide + cSide <= aSide) {
            // Если сумма двух сторон меньше или равна длине третьей стороны,
            // то эти три числа не могут быть длинами сторон треугольника.
            return false;
        } else {
            // Иначе эти три числа могут быть длинами сторон треугольника.
            return true;
        }
    }

    private ConditionalUtilsTriangleSides() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе сторон треугольника 1, 2 и 3, метод должен вернуть false - "
                + ConditionalUtilsTriangleSides.isTriangleSides(1, 2, 3));
    }
}