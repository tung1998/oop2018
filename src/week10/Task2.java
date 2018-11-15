package week10;
import java.util.Random;

public class Task2 {
    public static void bubbleSort(float array[]) {
        for (int i = 0; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                if (array[i] > array[j]) {
                    float tem;
                    tem = array[i];
                    array[i] = array[j];
                    array[j] = tem;
                }
            }
        }
    }
    public static void main(String[] args){
        float[] array= new float[1000];
        Random random= new Random();
        for(int i=0;i<1000;i++){
            array[i]=random.nextFloat();
        }
        Task2.bubbleSort(array);
        for(int i=0;i<1000;i++){
            System.out.println(array[i]);
        }
    }
}

