package week11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static <S extends Comparable> S max(ArrayList<S> n){
        S max = n.get(0);
        for(int i=0;i<n.size();i++){
            if(max.compareTo(n.get(i))<0){
                max = n.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args){
        Character[] data1= {'w','s','a','i','h'};
        Integer[] data2= {3,2,647,444,33};
        Float[] data3={1.1F,44F,63.2F,3.5F};
        Byte[] data4={-4,44,2,-6};
        Short[] data5={235,111,3433,99};
        Long[] data6={44L,22L,32L};
        Double[] data7={23.3,32.1,53.5,55.2};
        ArrayList<Character> characters = new ArrayList<>(Arrays.asList(data1));
        System.out.println(max(characters)+"\n");
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(data2));
        System.out.println(max(integers)+"\n");
        ArrayList<Byte> bytes = new ArrayList<>(Arrays.asList(data4));
        System.out.println(max(bytes)+"\n");
        ArrayList<Short> shorts = new ArrayList<>(Arrays.asList(data5));
        System.out.println(max(shorts)+"\n");
        ArrayList<Long> longs = new ArrayList<>(Arrays.asList(data6));
        System.out.println(max(longs)+"\n");
        ArrayList<Float> floats = new ArrayList<>(Arrays.asList(data3));
        System.out.println(max(floats)+"\n");
        ArrayList<Double> doubles = new ArrayList<>(Arrays.asList(data7));
        System.out.println(max(doubles)+"\n");


    }
}