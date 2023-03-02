package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day36Exercise {

    public static void main(String[] args) {



        List<Double> myList=new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);


       List<Double> half= getHalfElementsGreaterThanFiveDistinctReversed(myList);
       System.out.println(half);

        List<String>list=new ArrayList<>();
        list.add("Tom");
        list.add("Jhon");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

       // printAllAlphabeticallyUpperDistinct(list);
//        System.out.println();
//        printAllReversedAlphabeticallyLowerDistinc(list);
//        System.out.println();
//        printAllSortWithLengthUpperDistinct(list);
//        System.out.println();
//        printAllSortWithLastCharhUpperDistinct1(list);
//        System.out.println();
//        printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(list);
//        System.out.println();
////        System.out.println(removeElementIfTheLengthGreaterThanFive(list));
//        System.out.println(removeElementIfStarsWithAorEndsWithd(list));
//        System.out.println();
//        System.out.println(printElementsLengthEven(list));
//        System.out.println();
//        printAllSortWithLastCharhUpperDistinct2(list);
        System.out.println();
        artanSiradaTekrarsiz(list);

    }

    public static  List<Double>getHalfElementsGreaterThanFiveDistinctReversed(List<Double>myList){

        return   myList.stream().distinct().filter(t->t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
    //2)Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz.

    public static void printAllAlphabeticallyUpperDistinct(List<String>list){

        list.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(t-> System.out.print(t +" "));
    }
//3)Tum list elemanlarini kucuk harfle alfabetik siranin tersinde  tekrarsiz olarak yazdiriniz.

    public static void   printAllReversedAlphabeticallyLowerDistinc(List<String> list){
        list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t+" "));
    }
    //4)Tum list elemanlarini buyuk harfle uzunluklarina gore artan sirada  tekrarsiz olarak yazdiriniz.

    public static void artanSiradaTekrarsiz(List<String> list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t+" "));
    }
}
