
// Тренажер номер 4 - Факториал

public class MathUtilFactorial {
    public static long getFactorial(byte number) {
        long factorial = 1;
        for(int i = 1; i <= number; ++i){
            factorial *= i;
        }
        return factorial;
    }

    private MathUtilFactorial() {
        
    }

    public static void main(String[] args) {
        System.out.println("Факториал от 5 должен равняться 120 - " + MathUtilFactorial.getFactorial((byte) 5));
    }
}
