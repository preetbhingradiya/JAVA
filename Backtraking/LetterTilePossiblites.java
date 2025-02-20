import java.util.HashSet;

public class LetterTilePossiblites {
    static int len;
    public static void main(String args[]){
        String tiles = "AAB";

        len = tiles.length();
        boolean used[] = new boolean[len];
        HashSet<String> set = new HashSet<>();
        backtrack(tiles, used, set, "");
    }

    private static void backtrack(String tiles, boolean[] used, HashSet<String> set, string curr){
        if(set.contains(curr)) return;

        set.add(curr);

        for(int i=0; i<len; i++){
            if(used[i]) continue;

            used[i] = true;
            backtrack(tiles, used, set, curr + tiles.charAt(i));
            used[i] = false;
        }
    }
}
