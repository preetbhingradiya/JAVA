public class Factor_num {
    public static void main(String[] args) {
        int n =20;
        factorls(n);
    }

    static void factorls(int n){
        for (int i = 1; i <=n ; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
