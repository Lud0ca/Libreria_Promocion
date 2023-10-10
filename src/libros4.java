import java.util.Scanner;

public class libros4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite el primer precio del libro:");
        double n1 = input.nextDouble();

        System.out.println("Digite el segundo precio del libro:");
        double n2 = input.nextDouble();

        System.out.println("Digite el tercer precio del libro:");
        double n3 = input.nextDouble();

        if (n1 >= n2 && n1 >= n3) {
            double cobro = n1;
            double suma = n2 + n3;
            System.out.println("La cantidad a pagar es:" + cobro);
            System.out.println("La cantidad a ahorrada es:" + suma);
        } else if (n2 >= n1 && n2 >= n3) {
            double cobro = n2;
            double suma = n1 + n3;
            System.out.println("La cantidad a pagar es:" + cobro);
            System.out.println("La cantidad a ahorrada es:" + suma);
        } else if (n3 >= n1 && n3 >= n2) {
            double cobro = n3;
            double suma = n1 + n2;
            System.out.println("La cantidad a pagar es:" + cobro);
            System.out.println("La cantidad a ahorrada es:" + suma);
        }

        input.close();
    }
}