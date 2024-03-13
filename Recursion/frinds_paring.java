public class frinds_paring {

    public static int frindsParings(int n){
        if(n==1 || n==2) return n;

        //single friend  (if the one frind are disiced to single to other frinds is n-1)
        int single = frindsParings(n-1);

        //pairs friend (if the ant two friend in pair so othe frineds are n-2)
        int pairs = frindsParings(n-2);
        int pairWays = (n-1) * pairs;   //this two frinds are pais so multipal choice is pair  ex = a (b,c,d,e,g,h)   if a is (a,b) or (a,c) (a,d) ...

        return single+pairWays;
    }
    public static void main(String[] args){
        System.out.println(frindsParings(3));
    }
    /*n=3  a,b,c
    1 all of single a,b,c
    2 is a (b,c)
    3 is b (a,c)
    4 is c (a,b) */
}
