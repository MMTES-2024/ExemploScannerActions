import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String name = scanner.nextLine();
        System.out.println("Olá, " + name + "!");
        scanner.close();
    }
}

