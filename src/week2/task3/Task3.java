package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class tivi{//class tivi
    //thuoc tinh
    private boolean on_off;
    private int chanel;
    private int volum;
    //getter setter
    public boolean Get_on_off(){return this.on_off;}
    public int Get_chanel(){return this.chanel;}
    public int Get_volum(){return this.volum;}
    public void Set_on_off(boolean i){this.on_off = i;}
    public void Set_chanel(int chanel){this.chanel = chanel;}
    public void Set_volum(int volum){this.volum = volum;}

    public tivi(){
        this.Set_chanel(0);
        this.Set_on_off(false);
        this.Set_volum(0);
    }

    public void Turn_on_off(){//ham bat tat tivi
       if (this.Get_on_off()==true){
           this.Set_on_off(false);
           System.out.println("tivi da tat");
       }
       else{
           this.Set_on_off(true);
           System.out.println("tivi da bat");
       }
    }
    public void choose_chanel(int chanel ){//ham chon kenh
        if(this.Get_on_off() == true) {
            this.Set_chanel(chanel);
            System.out.println("da chuyen sang kenh" + chanel);
        }else System.out.println("ti vi dang tat");
    }
    //ham tang giam am luong
    public void increse_volum(){
        if(this.Get_on_off() == true) {
            this.Set_volum(this.Get_volum()+5);
            System.out.println("da tang am luong len"+this.Get_volum());
        }else System.out.println("ti vi dang tat");
    }


    public void reduce_volum(){
        if(this.Get_on_off() == true) {
            this.Set_volum(this.Get_volum()-5);
            System.out.println("da giam am luong ve"+this.Get_volum());
        }else System.out.println("ti vi dang tat");
    }
}


class binh_nuoc{
    private int do_ben;
    private int dung_luong;
    private int nhiet_do;
    //getter setter
    public int Get_do_ben(){return this.do_ben;}
    public int Get_dung_luong(){return this.dung_luong;}
    public int Get_nhiet_do(){return this.nhiet_do;}
    public void Set_do_ben(int i){this.do_ben = i;}
    public void Set_dung_luong(int dung_luong){this.dung_luong = dung_luong;}
    public void Set_nhiet_do(int nhiet_do){this.nhiet_do = nhiet_do;}

    public binh_nuoc(){
        this.Set_do_ben(100);
        this.Set_dung_luong(0);
        this.Set_nhiet_do(27);
    }

    public void Lam_roi(){//ham lam roi binh nuoc
        if (this.Get_dung_luong()!=0){
            this.Set_dung_luong(0);
            System.out.println("binh da chay het nuoc");
        }
        this.Set_do_ben(this.Get_do_ben()-20);
        if(this.Get_do_ben()<=0) System.out.println("binh nuoc da hong");
    }

    public void fill_binh_nuoc(int dungLuong, int nhiet_do ){//ham do nuoc vao binh
        this.Set_dung_luong(this.Get_dung_luong()+dungLuong);
        this.Set_nhiet_do((this.Get_dung_luong()*this.Get_nhiet_do()+dungLuong*nhiet_do)/(this.Get_dung_luong()+dungLuong));
        if(this.Get_dung_luong()>100) this.Set_dung_luong(100);
        System.out.println("binh nuoc da duoc lam day");
        System.out.println("binh nuoc co nhiet do:"+this.Get_nhiet_do());

    }

    public void them_da_lanh(){//ham them da vao binh
        this.Set_nhiet_do(this.Get_nhiet_do()-5);
        System.out.println("da giam nhiet do nuoc ve"+this.Get_nhiet_do());
    }

    public void Rot_nuoc(){//ham rot nuoc ra coc
        this.Set_dung_luong(this.Get_dung_luong()-5);
        System.out.println("da rot nuoc ra coc, luong nuoc con lai trong binh la"+this.Get_dung_luong());
    }
}

class nguoi_yeu{
    private int muc_do_tinh_cam;
    private int trinh_do_nau_an;
    private int do_xinh_dep;
    //getter setter
    public int Get_muc_do_tinh_cam(){return this.muc_do_tinh_cam;}
    public int Get_trinh_do_nau_an(){return this.trinh_do_nau_an;}
    public int Get_do_xinh_dep(){return this.do_xinh_dep;}
    public void Set_muc_do_tinh_cam(int muc_do_tinh_cam){this.muc_do_tinh_cam = muc_do_tinh_cam;}
    public void Set_trinh_do_nau_an(int trinh_do_nau_an){this.trinh_do_nau_an = trinh_do_nau_an;}
    public void Set_do_xinh_dep(int do_xinh_dep){this.do_xinh_dep = do_xinh_dep;}

    public nguoi_yeu(){
        this.Set_muc_do_tinh_cam(50);
        this.Set_trinh_do_nau_an(50);
        this.Set_do_xinh_dep(50);
    }

    public void DuocTangQua(String tenMonQua){//ham tang qua cho nguoi yeu
        if (tenMonQua=="gaubong") this.Set_muc_do_tinh_cam(this.Get_muc_do_tinh_cam()+5);
        else if (tenMonQua=="nhanHotXoan") this.Set_muc_do_tinh_cam(this.Get_muc_do_tinh_cam()+15);
        else if (tenMonQua=="XeHoi") this.Set_muc_do_tinh_cam(this.Get_muc_do_tinh_cam()+25);
        else this.Set_muc_do_tinh_cam(this.Get_muc_do_tinh_cam()+2);
        System.out.println("Sau khi được tặng "+tenMonQua+" tình cảm của người yêu đối với bạn là: "+this.Get_muc_do_tinh_cam());
    }

    public void cai_nhau(int n){//ham cai nhau voi nguoi yeu
        for (int i = 0; i<n ; i++){
            this.Set_muc_do_tinh_cam(this.Get_muc_do_tinh_cam()-5);
            System.out.println("bạn vừa cãi nhau với người yêu, tình cảm của người yêu dành cho bạn là: "+this.Get_muc_do_tinh_cam());
            if(this.Get_muc_do_tinh_cam() <= 0){
                System.out.println("Ngừoi yêu của bạn đã sút bạn :( xin chào mừng tới hội FA :) ");
                break;
            }
        }
    }

    public void noi_chuyen(){//ham nói chuyện với người yêu
        if(this.Get_muc_do_tinh_cam()<=10) System.out.println("em chán anh lắm rồi :(");
        else if(this.Get_muc_do_tinh_cam()<=20) System.out.println("anh chả thương em gì cả :(");
        else if(this.Get_muc_do_tinh_cam()<=50) System.out.println("anh hết yêu em rồi đúng không :(");
        else if(this.Get_muc_do_tinh_cam()<=80) System.out.println("em yêu anh lắm cơ :)");
        else if(this.Get_muc_do_tinh_cam()<=100) System.out.println("em yêu anh nhất trên đời :) :D ");
    }

    public void makeUp(){//Người yêu make up
        this.Set_do_xinh_dep(this.Get_do_xinh_dep()+50);
        System.out.println("người yêu bạn vừa makeUp, độ xinh đẹp hiện tại là"+this.Get_do_xinh_dep());
    }
    public void tay_trang(){//Người yêu tẩy trang
        this.Set_do_xinh_dep(this.Get_do_xinh_dep()-50);
        System.out.println("người yêu bạn vừa xóa makeUp, độ xinh đẹp hiện tại là"+this.Get_do_xinh_dep());
    }
}