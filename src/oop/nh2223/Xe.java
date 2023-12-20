package oop.nh2223;


import java.util.Scanner;


/**
 * Author: Kiet Mai Tran Tuan
 * Current user system login name: KIET
 * Created: 20/12/2023
 * Project name: DeThiCuoiKy
 * All rights reserved
 */

public abstract class Xe {
    private String bienSo;
    private String mauXe;
    private String nhanHieu;
    
    Xe(String bienSo, String mauXe, String nhanHieu) {
        this.bienSo = bienSo;
        this.mauXe = mauXe;
        this.nhanHieu = nhanHieu;
    }
    
    Xe() {
        this("", "", "");
    }
    
    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }
    
    String getBienSo() {
        return bienSo;
    }
    
    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }
    
    String getMauXe() {
        return mauXe;
    }
    
    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }
    
    String getNhanHieu() {
        return nhanHieu;
    }
    
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap bien so: ");
        setBienSo(scanner.nextLine());
        
        System.out.print("Nhap mau xe: ");
        setMauXe(scanner.nextLine());
        
        System.out.print("Nhap nhan hieu: ");
        setNhanHieu(scanner.nextLine());
    }
    
    
    @Override
    public String toString() {
        return "bienSo = " + bienSo
                + ", mauXe = " + mauXe
                + ", nhanHieu = " + nhanHieu;
    }
    
    public abstract double soTienQuaTram();
}
