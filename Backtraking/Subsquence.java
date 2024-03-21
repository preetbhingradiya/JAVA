public class Subsquence {

    public static void main(String[] args){
        String s = "axc", t = "ahbgdc";
        int n=s.length();
        int m=t.length();

        int i=0,j=0;
        while (i<n && j<m) {
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==n){
            System.out.println(true);
            return;
        }
        else{
        System.out.println(false);
        }
    }

}