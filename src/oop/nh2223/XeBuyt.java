package oop.nh2223;


import java.util.Scanner;


/**
 * Author: Kiet Mai Tran Tuan
 * Current user system login name: KIET
 * Created: 20/12/2023
 * Project name: DeThiCuoiKy
 * All rights reserved
 */
public class XeBuyt extends Xe {
    private short tuyen;
    private double doDaiLoTrinh;
    
    XeBuyt(String bienSo, String mauXe, String nhanHieu, short tuyen, double doDaiLoTrinh) {
        super(bienSo, mauXe, nhanHieu);
        this.tuyen = tuyen;
        this.doDaiLoTrinh = doDaiLoTrinh;
    }
    
    XeBuyt() {
        this("", "", "", (short) 0, 0.0);
    }
    
    
    public short getTuyen() {
        return tuyen;
    }
    
    public void setTuyen(short tuyen) {
        this.tuyen = tuyen;
    }
    
    public double getDoDaiLoTrinh() {
        return doDaiLoTrinh;
    }
    
    public void setDoDaiLoTrinh(double doDaiLoTrinh) {
        this.doDaiLoTrinh = doDaiLoTrinh;
    }
    
    
    public void nhapThongTin() {
        super.nhapThongTin();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap tuyen: ");
        setTuyen(Short.parseShort(scanner.nextLine()));
        
        System.out.print("Nhap do dai lo trinh: ");
        setDoDaiLoTrinh(Double.parseDouble(scanner.nextLine()));
    }
    
    @Override
    public String toString() {
        return super.toString()
                + ", tuyen = " + tuyen
                + ", doDaiLoTrinh = " + doDaiLoTrinh;
    }
    
    
    public double soTienQuaTram() {
        return (doDaiLoTrinh > 20.0)? 10000.0 : 5000.0;
    }
}
