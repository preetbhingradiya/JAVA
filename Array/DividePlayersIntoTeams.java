import java.util.Arrays;

public class DividePlayersIntoTeams {

    public static void main(String[] args) {

        int[] arr ={3,2,5,1,3,4};
        System.out.println(dividePlayers(arr));

    }

    public static long dividePlayers(int[] skill) {

        Arrays.sort(skill);
        
        if(skill.length <= 2) return skill[0] * skill[1];

        int left = 0;
        int right = skill.length - 1;

        //first store 0 and last index sum
        int currentSum = skill[left] + skill[right];
        long res = 0;

        while(left < right){
            int leftEle = skill[left];
            int rightEle = skill[right];

            int sum = leftEle + rightEle;

            //if the any current sum is not equal to currentsum return -1
            if(currentSum != sum) return -1;

            res += (long) (leftEle * rightEle);
            left++;
            right--;
        }

        return res;
    }

    public static long dividePlayers2(int[] skill) {

        int[] freq = new int[1001];
        int sum = 0;

        for (int element : skill) {
            freq[element]++;
            sum += element;
        }

        int teams = skill.length / 2;
        int targetPoints = sum / teams;

        //if all skill sum is not divide by term means no postible pair
        if (sum % teams != 0) {
            return -1;
        }

        long res = 0;

        for (int element : skill) {

            //here corrent element is not availble in fre countinue
            if (freq[element] == 0) {
                continue;
            }

            freq[element]--;
            int partnerOfElement = targetPoints - element;

            //here pair of element as partner is partner not avaible in freq return -1
            if (freq[partnerOfElement] == 0) {
                return -1;
            }

            freq[partnerOfElement]--;
            res = res + ((long) element * (long) partnerOfElement);
        }

        return res;

    }
}
