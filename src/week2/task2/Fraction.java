package week2.task2;
import java.lang.Math;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int T_s;
    private int M_s;
    private static void qdps(Fraction f1, Fraction f2){//ham quy dong 2 phan so
        int a = f1.M_s;
        int b = f2.M_s;
        f1.T_s *= b;
        f1.M_s *= b;
        f2.T_s *= a;
        f2.M_s *= a;
    }
    private static void toigian(Fraction f1){//ham toi gian phan so
        if(f1.T_s!=0) {
            int a = Math.abs(f1.T_s);
            int b = Math.abs(f1.M_s);
            while (a != b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
            f1.T_s /= a;
            f1.M_s /= a;
        }
    }
    private static void inps(Fraction f1){//ham in ra phan so
        toigian(f1);
        if (f1.T_s == 0) System.out.println(0);
        else if ((f1.T_s==f1.M_s)) System.out.println(1);
        else System.out.println(f1.T_s+"/"+f1.M_s);
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        if(denominator!=0) {
            this.T_s = numerator;
            this.M_s = denominator;
        }else {
            System.out.println("phan so loi");
            this.T_s = 0;
            this.M_s = 1;
        }
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        qdps(this,other);
        return new Fraction(this.T_s+other.T_s,other.M_s);
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        qdps(this,other);
        return new Fraction(this.T_s-other.T_s,other.M_s);
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới

        return new Fraction(this.T_s*other.T_s,this.M_s*other.M_s);
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        return new Fraction(this.T_s*other.M_s,this.M_s*other.T_s);
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(4,6);
        inps(f1);
        inps(f2);
        inps(f1.add(f2));
        inps(f1.subtract(f2));
        inps(f1.multiply(f2));
        inps((f1.divide(f2)));
    }
}
