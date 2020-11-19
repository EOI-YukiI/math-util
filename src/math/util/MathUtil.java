/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import yukii.util.MathUtility;

/**
 *
 * @author inosi
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        System.out.println(MathUtility.getFactorial(5));
        
        System.out.println("CI for today.");

    }

}

//Code viết ra Dev phải test trước
//có vài hình thức test code khác nhau
//1. TDD, Test Driven Development
//viets dàn khung của hàm getFactorial(int n)
//sau đó dựng hàm test()
//chạy thử để coi xanh đỏ, dỏ là lỗi, xanh là ổn
//cứ liên tục như thế trong quá trình viết code
//và sửa code, người ta gọi là lập trình hướng theo thỏa mãn/
//việc test, TDD

//2. sout(hàm kèm dât) để có kết quả ra sao, có đúng như mình kỳ vọng không
//nó phải trả về như thế này ahay không -> xem thế quả test = mắt

//3. JOtionPane của bên JavaDesktop để popup kết quả lên màn hình 
//vẫn xem = mắt

//4. viết 1 trnag web gọi hàm xử lí,... hao sức quá

//ta chơi cách một