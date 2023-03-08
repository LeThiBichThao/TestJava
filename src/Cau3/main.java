package Cau3;

public class main {
    public static void main(String[] args) {
        VanBan st=new VanBan("  dobas1901 is the best");
        System.out.println(st);
        System.out.println("So tu trong doan: "+st.demSoTu());
        System.out.println("Chuan hoa tu: "+st.chuanHoa());
        System.out.println("Viet hoa: "+st.vietHoa());
        System.out.println("Viet thuong: "+st.vietThuong());
        System.out.println("Viet hoa chu cai dau"+st.vietHoaChuCaiDauTien());
    }
}
