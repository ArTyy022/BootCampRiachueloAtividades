import java.util.Scanner;

public class EstrutrasDeControleEmJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = scanner.next();
        System.out.println("Informe a sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.printf("Bem vindo %s", nome);
            System.out.printf("Você tem %s, você pode dirigir ", idade);
        } else {
            System.out.printf ("%s você tem %s anos, você não pode dirigir ",nome ,idade);
        }
    }
}