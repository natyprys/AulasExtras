import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int valor;

        do {
            System.out.println(" Digite um valor para introduzir os calculos. ");
            valor = sc.nextInt();
            if (valor < 1 || valor > 1000) {
                System.out.println(" Valor invalido. Digite novamente: ");
            }

        } while (valor < 1 || valor > 1000);

        for (int i = 1; i <= valor; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}





