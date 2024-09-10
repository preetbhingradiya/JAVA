import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("name", "age", "gender", "arpit");

        List<String> filterList = list.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());


        Optional<String> findOne = list.stream().filter(s -> s.startsWith("a")).findFirst(); //retrun the first string that strat with a

        boolean allMatchList = list.stream().anyMatch(s -> s == "gender");

        int count = (int) list.stream().count();

        System.out.println(filterList);
        System.out.println(findOne);
        System.out.println(allMatchList);
        System.out.println(count);

        List<Integer> Integerlist = Arrays.asList(0, 1, 32, 3532, 32, 54, 0, 1);

       
        List<Integer> intList = Integerlist.stream()
                .filter(x -> x % 2 == 0) //filter() filter accroding codition
                .map(n -> n / 2)  //map() use to get data and give modify data
                .distinct()   // distinct() use remoeve duplicate in list
                // .sorted()   // sorted() use to sort list
                // .sorted((a,b)->(b-a)) 
                .collect(Collectors.toList());

        System.out.println(intList);
        
        

    }
}
