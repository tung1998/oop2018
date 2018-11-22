package week11;
    
public class Task1 {
    public static <S extends Comparable> void sort(S[] data){
        int length =data.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-1;j++){
                if(data[j].compareTo(data[j+1])>0){
                    S s= data[j];
                    data[j]=data[j+1];
                    data[j+1]=s;
                }
            }
        }
    }
    public static <S extends Comparable> void show(S[] data){
        int length =data.length;
        System.out.println("sort:");
        for(int i=0;i<length;i++){
            System.out.print(data[i]+", ");
        }
        System.out.println("\n\n");
    }

    public static void main(String[] args){
        Character[] data1= {'w','s','a','i','h'};
        Integer[] data2= {3,2,647,444,33};
        Float[] data3={1.1F,44F,63.2F,3.5F};
        Byte[] data4={-4,44,2,-6};
        Short[] data5={235,111,3433,99};
        Long[] data6={44L,22L,32L};
        Double[] data7={23.3,32.1,53.5,55.2};
        sort(data1);
        show(data1);
        sort(data2);
        show(data2);
        sort(data3);
        show(data3);
        sort(data4);
        show(data4);
        sort(data5);
        show(data5);
        sort(data6);
        show(data6);
        sort(data7);
        show(data7);
    }
}
