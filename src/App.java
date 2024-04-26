import java.util.Scanner;

public class App {

    public static int num1;
    public static int num2;
    public static int num3;

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }

        } while (num1 == num2 || num1 == num3 || num2 == num3);

    }
}
