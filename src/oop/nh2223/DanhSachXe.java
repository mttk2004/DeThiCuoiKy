package oop.nh2223;


import java.util.ArrayList;


/**
 * Author: Kiet Mai Tran Tuan
 * Current user system login name: KIET
 * Created: 20/12/2023
 * Project name: DeThiCuoiKy
 * All rights reserved
 */
public class DanhSachXe {
    private static ArrayList<Xe> danhSachXe;
    private static int soXe;
    
    static {
        danhSachXe = new ArrayList<>();
        soXe = 0;
    }
    
    public static void setDanhSachXe(ArrayList<Xe> danhSachXe) {
        DanhSachXe.danhSachXe = danhSachXe;
        setSoXe(danhSachXe.size());
    }
    
    public static ArrayList<Xe> getDanhSachXe() {
        return danhSachXe;
    }
    
    private static void setSoXe(int soXe) {
        DanhSachXe.soXe = soXe;
    }
    
    public static int getSoXe() {
        return soXe;
    }
    
    public static void themXe(Xe xe) {
        danhSachXe.add(xe);
        ++soXe;
    }
    
    public static void tinhTienQuaTram() {
        for (var xe : danhSachXe) {
            if (xe instanceof XeBuyt)
                System.out.print("Xe buyt: ");
            else if (xe instanceof XeTai)
                System.out.print("Xe tai: ");
            
            System.out.println(xe.soTienQuaTram());
        }
    }
    
    public static void main(String[] args) {
        Xe bus1 = new XeBuyt("", "", "", (short) 31, 13.4);
        Xe tai1 = new XeTai("", "", "", 21.4);
        
        System.out.println(getSoXe());
        themXe(bus1); System.out.println(getSoXe());
        themXe(tai1); System.out.println(getSoXe());
        
        tinhTienQuaTram();
        
        XeTai tai2 = new XeTai();
        tai2.nhapThongTin();
        
        themXe(tai2); System.out.println(getSoXe());
        
        tinhTienQuaTram();
    }
}
