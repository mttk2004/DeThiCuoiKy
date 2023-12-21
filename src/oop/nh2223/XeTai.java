package oop.nh2223;


import java.util.Scanner;


/**
 * Author: Kiet Mai Tran Tuan
 * Current user system login name: KIET
 * Created: 20/12/2023
 * Project name: DeThiCuoiKy
 * All rights reserved
 */
public class XeTai extends Xe {
    private double trongTai;
    
    XeTai(String bienSo, String mauXe, String nhanHieu, double trongTai) {
        super(bienSo, mauXe, nhanHieu);
        this.trongTai = trongTai;
    }
    
    XeTai() {
        this("", "", "", 0.0);
    }
    
    
    public double getTrongTai() {
        return trongTai;
    }
    
    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
    
    
    public void nhapThongTin() {
        super.nhapThongTin();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap trong tai: ");
        setTrongTai(Double.parseDouble(scanner.nextLine()));
    }
    
    @Override
    public String toString() {
        return super.toString()
        + ", trongTai = " + trongTai;
    }
    
    
    public double soTienQuaTram() {
        return (trongTai < 3.0)? 15000.0 : 30000.0;
    }
    
}
