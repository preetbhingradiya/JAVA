public class Hello {
    public static void main(String[] args) {
        World thread = new World();
        thread.start();

        for (;;) {
            System.out.println("Hello word");
        }
    }
}
