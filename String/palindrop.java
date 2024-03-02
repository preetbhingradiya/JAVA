public class palindrop {

    public static int palindropString(String str, int n) {
        for (int i = 0; i < n/2; i++) {

            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {

        String str = "preet";
        int n = str.length();

        if(palindropString(str, n)==1){
            System.out.println("Strinig is Palindrop");
        }
        else{
            System.out.println("String is not palindrop");
        }
    }
}
