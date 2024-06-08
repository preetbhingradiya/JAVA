public class String_linear_search {
    public static void main(String[] args) {
        String name = "yuvraj";
        char target = 'j';
        System.out.println(stringLinear(name, target));
    }

    static boolean stringLinear(String name , char target){
        if(name.length()==0) return false;

        for (int i = 0; i < name.length(); i++) {
            char element = name.charAt(i);
            if(element==target){
                return true;
            }
        }

        return false;
    }
}
