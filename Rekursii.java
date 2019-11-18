import java.util.Scanner;

public class Rekursii {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для вычисления факториала => ");
        int x = in.nextInt();
        int y = 1;
        if (x == 0 || x == 1) {
            System.out.println("Факториал равен 1 =>");
        } else {
            for (int i = 1; i < (x + 1); i++) {
                y *= i;
            }
            System.out.println("Факториал равен => " + y);
        }
    }
}
