import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é Armstrong: ");

        if (leitor.hasNextInt()) {
            int numero = leitor.nextInt();

            if (numeroArmstrong(numero)) {
                System.out.println("O número " + numero + " é um número Armstrong! ✨");
            } else {
                System.out.println("O número " + numero + " não é um número Armstrong.");
            }
        } else {
            System.out.println("Erro: Por favor, digite apenas números inteiros.");
        }

        leitor.close();
    }

    public static int cont_digitos(int n) {
        if (n == 0) return 1;
        int digitos = 0;
        for (long i = 1; i <= n; i *= 10) {
            digitos++;
        }
        return digitos;
    }

    public static boolean numeroArmstrong(int n) {
        int digitos = cont_digitos(n);
        int soma = calculaArmstrong(n, digitos);
        return soma == n;
    }

    public static int calculaArmstrong(int n, int digitos) {
        if (n <= 0) {
            return 0;
        } else {
            int digitoAtual = n % 10;
            return (int) Math.pow(digitoAtual, digitos) + calculaArmstrong(n / 10, digitos);
        }
    }
}