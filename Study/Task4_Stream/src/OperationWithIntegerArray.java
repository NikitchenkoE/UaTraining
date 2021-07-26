import java.util.*;
import java.util.stream.Stream;

public class OperationWithIntegerArray {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 5, 9, 8, 7, 4, 5, 6, 2, 2, 3, 0, 0, 25, 0, 9, 8, 0, 0, 5);

        //Sort with Collections usage
//        Collections.sort(integerList,((o1, o2) -> o1-o2));
//
//        for (Integer integer:integerList){
//            System.out.print(integer + " ");
//        }
        //Sorted array
        integerList.sort((o1, o2) -> o1 - o2);
        integerList.forEach(System.out::print);

        System.out.println();

        //revers sorted array
        integerList.sort((o1, o2) -> o2 - o1);
        integerList.forEach(System.out::print);
        System.out.println();

        //Number of elements that equals 0
        Long count = integerList.stream().filter(integer -> integer == 0).count();
        System.out.println(count);

        //Number of elements that bigger than 0
        count = integerList.stream().filter(integer -> integer > 0).count();
        System.out.println(count);

        //Number of elements in array
        count = integerList.stream().count();
        System.out.println(count);

        //doubled array
        integerList.stream().map(integer -> integer * 2)
                .forEach(System.out::print);
        System.out.println();

        //Sum of array
        Optional<Integer> sumAll = integerList.stream().reduce((left, right) -> left + right);
        sumAll.ifPresent(System.out::println);

        //Average of array
        Optional<Integer> avarage = integerList.stream().reduce((left, right) -> left + right)
                .stream().map(integer -> integer / integerList.size()).findAny();
        avarage.ifPresent(System.out::println);

        //Min value in array
        Integer minValue1 = integerList.stream().distinct().filter(integer -> integer != 0)
                .reduce(Integer.MAX_VALUE, (left, right) -> left < right ? left : right);
        System.out.println("Value=" + minValue1 + " index=" + integerList.indexOf(minValue1));

        Integer minValue2 = integerList.stream().distinct().filter(integer -> integer != 0)
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("Value=" + minValue2 + " index=" + integerList.indexOf(minValue2));


    }
}
