package oop.nh2021.cau2;


/**
 * Author: Kiet Mai Tran Tuan
 * Current user system login name: KIET
 * Created: 21/12/2023
 * Project name: DeThiCuoiKy
 * All rights reserved
 */
public class Cau2 {
    public static void doFoo(Base base) {
        base.foo();
    }
    
    public static void main(String[] args) {
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
        
        doFoo(x);
        doFoo(y);
        doFoo(z);
    }
}

class Base {
    public void foo() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public void foo() {
        System.out.println("Derived");
    }
}
