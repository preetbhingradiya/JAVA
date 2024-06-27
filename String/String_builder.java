public class String_builder {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char a = (char)('a' + i);
            builder.append(a + " "); // here every time not create a new object like string it can just add a new string in old string
        }

        System.out.println(builder);
    }

}