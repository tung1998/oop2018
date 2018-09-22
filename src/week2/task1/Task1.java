package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(a>0 || b>0) {
            while (a != b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
            return a;
        }else return 0;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n<0) return -1;
        else if (n == 0 || n == 1) return n;
        else return(fibonacci(n-1) + fibonacci(n-2)) ;
    }

    public static void main(String[] args) {
        System.out.println(gcd(100, 70));
        System.out.println(fibonacci(6));
    };

}