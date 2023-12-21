package oop.nh2021.cau4;


/**
 * Author: Kiet Mai Tran Tuan
 * Current user system login name: KIET
 * Created: 21/12/2023
 * Project name: DeThiCuoiKy
 * All rights reserved
 */
public class Fullname {
    private String ho;
    private String tenDem;
    private String ten;
    
    public Fullname(String ho, String tenDem, String ten) {
        this.ho     = ho;
        this.tenDem = tenDem;
        this.ten    = ten;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        
        sb.append(ho).append(' ')
          .append(tenDem).append(' ')
          .append(ten);
        
        return sb.toString();
    }
    
}
