package Cau2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        kithuat k1 = new kithuat("ST325","LeBichThao","19/10/2001","Ba Dinh - Ha Noi","HTTT");
        System.out.println(k1);
        System.out.println(k1.moTaCongViec());


        // nhap vao tu ban phim
        Scanner in =new Scanner(System.in);
        System.out.printf("nhap mã nhan vien:");
        String maNhanVien = in.nextLine();
        System.out.printf("nhap ho ten nhan vien:");
        String hoTen = in.nextLine();
        System.out.printf("nhap nam sinh nhan vien:");
        String namSinh = in.nextLine();
        System.out.printf("nhap dia chi nhan vien:");
        String diaChi = in.nextLine();
        System.out.printf("nhap vao nganh hoc:");
        String nganh = in.nextLine();

        kithuat k2 = new kithuat(maNhanVien, hoTen, namSinh, diaChi, nganh );
        System.out.println(k2);
        System.out.println(k2.moTaCongViec());
    }
}
