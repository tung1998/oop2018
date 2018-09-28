package week2.task2;
import java.lang.Math;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int T_s;
    private int M_s;
    // getter setter
    public int Get_Ts(){return this.T_s;}
    public int Get_Ms(){return this.M_s;}
    public void Set_Ts(int Ts){this.T_s = Ts;}
    public void Set_Ms(int Ms){this.M_s = Ms;}

    private static void qdps(Fraction f1, Fraction f2){//ham quy dong 2 phan so
        int a = f1.Get_Ms();
        int b = f2.Get_Ms();
        if (a!=b) {
            f1.T_s *= b;
            f1.M_s *= b;
            f2.T_s *= a;
            f2.M_s *= a;
        }
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
    public static void inps(Fraction f1){//ham in ra phan so
        toigian(f1);
        if (f1.Get_Ts() == 0) System.out.println(0);
        else if ((f1.Get_Ts()==f1.Get_Ms())) System.out.println(1);
        else if (f1.Get_Ms()==1) System.out.println(f1.Get_Ts());
        else System.out.println(f1.Get_Ts()+"/"+f1.Get_Ms());
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        if(denominator!=0) {
            this.Set_Ts(numerator);
            this.Set_Ms(denominator);
        }else {
            System.out.println("phan so loi");
            this.Set_Ts(0);
            this.Set_Ms(1);
        }
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        qdps(this,other);
        return new Fraction(this.Get_Ts()+other.Get_Ts(), other.Get_Ms());
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        qdps(this,other);
        return new Fraction(this.Get_Ts()-other.Get_Ts(), other.Get_Ms());
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới

        return new Fraction(this.Get_Ts()*other.Get_Ts(),this.Get_Ms()*other.Get_Ms());
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        return new Fraction(this.Get_Ts()*other.Get_Ms(),this.Get_Ms()*other.Get_Ts());
    }
    public boolean equals(Object obj){
        Fraction other = (Fraction) obj;
        other.toigian();
        this.toigian();
        return  ((other.denominator == this.denominator) && (other.numerator == this.numerator));
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(0, 3);
        Fraction f2 = new Fraction(4,6);
        inps(f1);
        inps(f2);
        inps(f1.add(f2));
        inps(f1.subtract(f2));
        inps(f1.multiply(f2));
        inps((f1.divide(f2)));
    }
}
