import java.util.Scanner;

public class lib{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el numero de libros a comprar: ");
        int n = sc.nextInt();
        double pago = 0;
        double ahorro = 0;
        double[] precios = new double[n];
        java.util.Arrays.sort(precios);

        for (int a = 0; a < n; a++) {
            System.out.print("Ingrese el precio del libro \'" + (a + 1) + "\' $ ");
            precios[a] = sc.nextDouble();
        }

        for (int a = 0; a < n; a++) {
            if(a % 3 != 2){
            pago += precios[a];
            }else{
            ahorro += precios[a] - pago;
            }
        }

        System.out.println();
        System.out.println("Cantidad a pagar: $" + pago);
        System.out.println("Dinero ahorrado: $" + ahorro);
    }
}