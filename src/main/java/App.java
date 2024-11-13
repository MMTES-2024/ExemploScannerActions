public class App {
    public static void main(String[] args) {
        String name = System.getenv("USER_NAME");
        if (name == null || name.isEmpty()) {
            System.out.println("No name provided.");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}

