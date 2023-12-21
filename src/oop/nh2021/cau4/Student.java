package oop.nh2021.cau4;


/**
 * Author: Kiet Mai Tran Tuan
 * Current user system login name: KIET
 * Created: 21/12/2023
 * Project name: DeThiCuoiKy
 * All rights reserved
 */
public class Student {
    private String maSo;
    private Fullname hoTen;
    private Address diaChi;
    
    
    public Student(String maSo, Fullname hoTen, Address diaChi) {
        this.maSo   = maSo;
        this.hoTen  = hoTen;
        this.diaChi = diaChi;
    }
    
    
    public String getMaSo() {
        return maSo;
    }
    
    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }
    
    public Fullname getHoTen() {
        return hoTen;
    }
    
    public void setHoTen(Fullname hoTen) {
        this.hoTen = hoTen;
    }
    
    public Address getDiaChi() {
        return diaChi;
    }
    
    public void setDiaChi(Address diaChi) {
        this.diaChi = diaChi;
    }
    
    
    public String printStudent() {
        return "MSSV: " + maSo
                + "\nHo ten: " + hoTen
                + "\nDia chi: " + diaChi;
    }
    
    public static void main(String[] args) {
        var student = new Student(
                "8523543",
                new Fullname("Mai Tran", "Tuan", "Kiet"),
                new Address(123, "Ba Thang Hai", "Tan Phu",
                            "thanh pho Ho Chi Minh")
        );
        
        System.out.println(student.printStudent());
    }
}
