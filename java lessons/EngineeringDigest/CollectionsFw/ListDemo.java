package CollectionsFw;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
public class ListDemo {
    public static void main(String[] args) {
        //default capacity of ArraList is 10
        //growth factor is 1.5 - 50%
        //Elements are shifted when removed or added automatically.
//        List<Integer> listWithInitialCapacity  = new ArrayList<>(20);
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(10);
//        ls.add(20);
//        ls.add(30);
//        ls.add(10);
//        ls.add(20);
//        ls.add(30);
//        System.out.println(ls);
//        System.out.println(ls.size());
//        ls.remove(1);
//        System.out.println(ls);
//        ls.remove(1);
//        ls.remove(1);
//        System.out.println(ls);

//        trimToSize adjust the size back to number of ele in the list
//        ls.trimToSize();
//        System.out.println(ls.size());

//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] elementData = (Object[]) field.get(ls);
//        System.out.println("initial Capacity" + elementData.length);
//        System.out.println(ls);
//        ls.remove(1);
//        System.out.println(ls);

//        Arrays.asList() returns a fixed sized list
//        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//        list1.set(2,5);
//        Unsupported Operation - can't add in the list1
//        list1.add(16);
//        System.out.println(list1);

//        List.of() - returns unmodifiable list
//        List<Integer> list2 = List.of(1,2,3,4,5);
//        list1.set(2,5);
//
//        System.out.println(ls);
//        //removes index element and shifts
//        ls.remove(1);
//        //removes element and shifts
//        ls.remove(Integer.valueOf(20));
        System.out.println(ls);
//
//        //contains the given element
//        boolean hasThirty = ls.contains(30);
//        System.out.println(hasThirty);
//
//        //Convert to Array
//        //we pass new Integer[0] of size 0 just to tell the type of Array we are expecting in return
//        Integer[] arr = ls.toArray(new Integer[0]);
//        for(Object x : arr){
//            System.out.println(x);
//        }
        //sorts the list
//        ls.sort(null);
//        System.out.println(ls);
        List<String> fruits = Arrays.asList("banana", "apple", "orange");
        fruits.sort(null);
        System.out.println(fruits);
        //descending order sorting
        //take a functional interface compartor
        //String provides the compareTo method
        fruits.sort((a,b) -> b.compareTo(a));
        System.out.println(fruits);
        fruits.sort(new StringLengthComparator());
        fruits.sort((a,b) -> b.length() - a.length());
        System.out.println(fruits);






    }
}
