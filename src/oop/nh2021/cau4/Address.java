package oop.nh2021.cau4;


/**
 * Author: Kiet Mai Tran Tuan
 * Current user system login name: KIET
 * Created: 21/12/2023
 * Project name: DeThiCuoiKy
 * All rights reserved
 */
public class Address {
    private int soNha;
    private String duong;
    private String quan;
    private String thanhPho;
    
    public Address(int soNha, String duong, String quan, String thanhPho) {
        this.soNha    = soNha;
        this.duong    = duong;
        this.quan     = quan;
        this.thanhPho = thanhPho;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        
        sb.append(soNha)
          .append(", ").append(duong)
          .append(", ").append(quan)
          .append(", ").append(thanhPho);
        
        return sb.toString();
    }
    
}
