
public class Sum_of_digit_after_convert {

    public static void main(String[] args) {
        String str = "leetcode";
        int k = 2;
        System.out.println(getLucky(str, k));
    }

    public static int getLucky(String s, int k) {
        String sb = "";
        for (int i = 0; i < s.length(); i++) {
            sb += s.charAt(i) - 'a' + 1;
        }

        int sum =0;
        for (char ch : sb.toCharArray()) {
            sum += ch - '0';
        }
        System.out.println(sum);
        System.out.println(sb);

        for (int i=1;i<k;i++) {
            sum = kTimeDigite(sum);
        }

        return sum;
    }

    public static int kTimeDigite(int num){
        int res = 0;
        while(num > 0){
            res += num%10;
            num /= 10;
        }

        return res;
    }

}
