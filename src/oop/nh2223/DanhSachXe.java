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
    
    ArrayList<Xe> getDanhSachXe() {
        return danhSachXe;
    }
    
    private static void setSoXe(int soXe) {
        DanhSachXe.soXe = soXe;
    }
    
    int getSoXe() {
        return soXe;
    }
    
    public static void themXe(Xe xe) {
        danhSachXe.add(xe);
        ++soXe;
    }
    
    public static void tinhTienQuaTram() {
        for (var xe : danhSachXe) {
            System.out.println(xe.soTienQuaTram());
        }
    }
    
    public static void main(String[] args) {
        var bus1 = new XeBuyt("", "", "", (short) 31, 13.4);
        var tai1 = new XeTai("", "", "", 21.4);
        
        themXe(bus1);
        themXe(tai1);
        
        tinhTienQuaTram();
    }
}
