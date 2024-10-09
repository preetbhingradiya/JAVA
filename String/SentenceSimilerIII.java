// sentence1 = "My name is Haley", sentence2 = "My Haley"
// sentence can mathc in START, CENTER, END postion
// here name is same in sentence2 in center postion return true

// sentence1 = "of", sentence2 = "A lot of words"  here sentence1 is missing word are both side left and right so it can not posible return false


public class SentenceSimilerIII{

    public static void main(String[] args){

    }

    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length() > sentence2.length()){ //i can make every case sentence1 is smaller
            return areSentencesSimilar(sentence2, sentence1);
        }

        String smallerWords[] = sentence1.split(" ");
        String largerWords[] = sentence2.split(" ");

        int start = 0;
        int end1 = smallerWords.length-1; //find both length bcz length is differnec
        int end2 = largerWords.length -1;

        while(start<=end1 && smallerWords[start].equals(largerWords[start])){
            start++;
        }

        while(start<=end1 && smallerWords[end1].equals(largerWords[end2])){
            end1--;
            end2--;
        }

        //if start grater than end return true otherwise false
        return (start>end1);
    }
}