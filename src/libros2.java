import java.util.Arrays;
import java.util.Scanner;

public class libros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precios = new double[10];

        System.out.print("Ingrese el número de artículos (máximo 10): ");
        int numArticulos = sc.nextInt();

        if (numArticulos > 0 && numArticulos <= 10) {
            //Solicitar los precios de los 10 libros
            for (int a = 0; a < numArticulos; a++) {
                System.out.print("Ingrese el precio del libro " + (a + 1) + " $ ");
                precios[a] = sc.nextDouble();
            }

            // Ordenar los precios en orden descendente
            Arrays.sort(precios);
            double cantidadAPagar = 0;
            double ahorro = 0;

            // Calcular la cantidad a pagar y el ahorro
            for (int i = 10 - 1; i >= 0; i--) {
                if (precios[i]>500.0 && precios[i]<=10000.0) {
                    cantidadAPagar += precios[i];
                }if(precios[i]<499.0 && precios[i]>0.0){
                    ahorro += precios[i];
                }
            }

            System.out.println("Precios ordenados: " + Arrays.toString(precios));
            System.out.println("Cantidad a pagar: $" + cantidadAPagar);
            System.out.println("Dinero ahorrado: $" + ahorro);
        }else {
            System.out.println("Número de artículos no válido. Debe estar entre 1 y 10.");
        }
        sc.close();
    }
}
