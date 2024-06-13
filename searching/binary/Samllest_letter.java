
public class Samllest_letter {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'a';
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(start < letters.length ? letters[start] : letters[0]);
    }

}
