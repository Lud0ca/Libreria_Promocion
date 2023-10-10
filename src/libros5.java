import java.util.Scanner;

public class libros5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de libros:");
        int contador = sc.nextInt();

        switch (contador) {
            case 1:
                System.out.println("Su libro es barato selecione \'a\', pero si es caro seleccione \'b\' ");
                char costo1 = sc.next().charAt(0);
                if (costo1 == 'a') {
                    System.out.println("Su pago ronda entre los 10 a los 499 pesos");
                } else if (costo1 == 'b') {
                    System.out.println("Su pago ronda entre los 500 a los 10000 pesos");
                }
                break;
            case 2:
                System.out.println("Sus libros son baratos selecione \'a\', pero si son caros seleccione \'b\' ");
                char costo2 = sc.next().charAt(0);
                if (costo2 == 'a') {
                    System.out.println("Su pago ronda entre los 10 a los 499 pesos por cada libro");
                } else if (costo2 == 'b') {
                    System.out.println("Su pago ronda entre los 500 a los 10000 pesos por cada libro");
                }
                break;
            case 3:
                System.out.println("Si 3 libros son baratos selecione \'a\', pero si 1 libro es caro seleccione \'b\' ");
                char costo3 = sc.next().charAt(0);
                if (costo3 == 'a') {
                    System.out.println("Su pago ronda entre los 10 a los 499 pesos por cada libro");
                } else if (costo3 == 'b') {
                    System.out.println("Su pago ronda entre los 500 a los 10000 pesos por cada libro");
                    System.out.println("Su ahorro va de los 10 a los 499 pesos por cada libro que no sobrepase los 500 pesos");
                }
                break;
            case 4:
                System.out.println("Si 4 libros son baratos selecione \'a\', pero si 1 libro es caro seleccione \'b\' ");
                char costo4 = sc.next().charAt(0);
                if (costo4 == 'a') {
                    System.out.println("Su pago ronda entre los 10 a los 499 pesos por cada libro");
                } else if (costo4 == 'b') {
                    System.out.println("Su pago ronda entre los 500 a los 10000 pesos por cada libro");
                    System.out.println("Su ahorro va de los 10 a los 499 pesos por cada libro que no sobrepase los 500 pesos por cada 3 libros");
                }
                break;
            case 5:
                System.out.println("Si 5 libros son baratos selecione \'a\', pero si 1 libros son caros seleccione \'b\' ");
                char costo5 = sc.next().charAt(0);
                if (costo5 == 'a') {
                    System.out.println("Su pago ronda entre los 10 a los 499 pesos por cada libro");
                } else if (costo5 == 'b') {
                    System.out.println("Su pago ronda entre los 500 a los 10000 pesos por cada libro");
                    System.out.println("Su ahorro va de los 10 a los 499 pesos por cada libro que no sobrepase los 500 pesos por cada 3 libros");
                }
                break;
            case 6:
                System.out.println("Si 6 libros son baratos selecione \'a\', pero si 2 libros es caro seleccione \'b\' ");
                char costo6 = sc.next().charAt(0);
                if (costo6 == 'a') {
                    System.out.println("Su pago ronda entre los 10 a los 499 pesos por cada libro");
                } else if (costo6 == 'b') {
                    System.out.println("Su pago ronda entre los 500 a los 10000 pesos por cada libro");
                    System.out.println("Su ahorro va de los 10 a los 499 pesos por cada libro que no sobrepase los 500 pesos por cada 3 libros");
                }
                break;
            case 7:
                System.out.println("Si 7 libros son baratos selecione \'a\', pero si 2 libros es caro seleccione \'b\' ");
                char costo7 = sc.next().charAt(0);
                if (costo7 == 'a') {
                    System.out.println("Su pago ronda entre los 10 a los 499 pesos por cada libro");
                } else if (costo7 == 'b') {
                    System.out.println("Su pago ronda entre los 500 a los 10000 pesos por cada libro");
                    System.out.println("Su ahorro va de los 10 a los 499 pesos por cada libro que no sobrepase los 500 pesos por cada 3 libros");
                }
                break;
            case 8:
                System.out.println("Si 8 libros son baratos selecione \'a\', pero si 2 libros es caro seleccione \'b\' ");
                char costo8 = sc.next().charAt(0);
                if (costo8 == 'a') {
                    System.out.println("Su pago ronda entre los 10 a los 499 pesos por cada libro");
                } else if (costo8 == 'b') {
                    System.out.println("Su pago ronda entre los 500 a los 10000 pesos por cada libro");
                    System.out.println("Su ahorro va de los 10 a los 499 pesos por cada libro que no sobrepase los 500 pesos por cada 3 libros");
                }
                break;
            case 9:
                System.out.println("Si 9 libros son baratos selecione \'a\', pero si 3 libros es caro seleccione \'b\' ");
                char costo9 = sc.next().charAt(0);
                if (costo9 == 'a') {
                    System.out.println("Su pago ronda entre los 10 a los 499 pesos por cada libro");
                } else if (costo9 == 'b') {
                    System.out.println("Su pago ronda entre los 500 a los 10000 pesos por cada libro");
                    System.out.println("Su ahorro va de los 10 a los 499 pesos por cada libro que no sobrepase los 500 pesos por cada 3 libros");
                }
                break;
            case 10:
                System.out.println("Si 10 libros son baratos selecione \'a\', pero si 3 libros es caro seleccione \'b\' ");
                char costo10 = sc.next().charAt(0);
                if (costo10 == 'a') {
                    System.out.println("Su pago ronda entre los 10 a los 499 pesos por cada libro");
                } else if (costo10 == 'b') {
                    System.out.println("Su pago ronda entre los 500 a los 10000 pesos por cada libro");
                    System.out.println("Su ahorro va de los 10 a los 499 pesos por cada libro que no sobrepase los 500 pesos por cada 3 libros");
                }
                break;
            default:
                System.out.println("Error de ingreso del numero de libros, por favor ingrese un numero entre 1 y 10");
                break;
        }
    }
}
