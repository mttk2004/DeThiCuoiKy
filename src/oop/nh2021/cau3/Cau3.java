package oop.nh2021.cau3;


/**
 * Author: Kiet Mai Tran Tuan
 * Current user system login name: KIET
 * Created: 21/12/2023
 * Project name: DeThiCuoiKy
 * All rights reserved
 */
public class Cau3 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
    }
}

class Base {
    public void show() {
        System.out.println("Base::show() called");
    }
}

class Derived extends Base {
    public void show() {
        System.out.println("Derived::show() called");
    }
}


/*
Lệnh `b.show()` sẽ in ra "Derived::show() called" trên màn hình.

Đây là một ví dụ về đa hình (polymorphism) trong Java.
Trong đoạn mã của bạn, `b` là một tham chiếu của lớp `Base`,
nhưng nó thực sự trỏ đến một đối tượng của lớp `Derived`.
Khi phương thức `show()` được gọi, Java sẽ chọn phương thức `show()`
của lớp `Derived` để thực thi, vì `b` thực sự trỏ đến một đối tượng
của lớp `Derived`.
*/

