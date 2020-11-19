/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yukii.util.test;

import math.util.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import yukii.util.MathUtility;

/**
 *
 * @author inosi
 */
public class MathUtilityTest {

    //mình sẽ test các tình huoongsxsaif hàm getFactorial() ở đây
    //tình huống là tham số đưa vào: dương, âm, dương trong khoản 0...20, ngoài
    //tình huống xài hàm, test gọi lzaf test cáess
    //thường ta có tình huoonhs thành công và thất bại
    //thành công: đưa vao fvalue hợp lệ 0...20
    //thất bại: đưa vào âm, > 20, bị ăn đòn
    //hàm phải bắt các tình huống này, và giờ ta test thử coi hàm xử lý đúng ko
    @Test
    // bieens hafm nafy thanhf public static void main()
    //quy tắc đặt tên hà cho việc test phần mềm: rất nhjieeuf quy tắc
    //nhunghw nói chung tên hàm sẽ bao gồm ngữ nghĩa kết quả trả về tình trạng test,
    //ko muốn quy tắc đặt tên hàm khi viết app
    //mình đang viết code để test app

    //mình muốn test hàm trả về ngon nếu đưa tham số ngon
    public void getFactorial_RunsWell_IfValodArgument() {
        assertEquals(120, MathUtility.getFactorial(5));
        //tui muoosn check coi 5! có trả về 120 không
        //nếu có hì xanh không thì đỏ
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(6, MathUtility.getFactorial(3));
        
    }//tui muốn thấy xanh tren git ko xem owr ddaay

}
//MẶC ĐỊNH CODE TEST ĐỘC LẬP VỚI CODE CHÍNH VÀ ĐỌC LẬP VỚI QUÁ TRÌNH CLEAR AND BUILD
//TỨC LÀ DÙ CODE M XANH HAY ĐỎ MEIENX LÀ KHOONMG BỊ ERRORR VỀ MẶT CÚ PHÁP BẠN LUÔN ĐÓNG OHGUID BUILD RA ĐƯỢC FILE .JAR
//CHÁP XANH ĐỎ, 
//HƯỢP LOGIC MÀU XNAH TỨC LÀ HÀM CHUẨN THI MỚI NÊN RA ĐƯỢC CHẤM .JAR .WAR
//VAAYH TA CẦN CÓ 1 CÁCH ĐỂ GÀI CÁI XAH ĐỎ VÀO QUY YTRINHF BUILD FILE JAR BUILD FILE WAR
//NẾU CODE ĐANG MÀU ĐỎ THÌ PHẢI DISABLE CÁI NÚT  BẤM CLEAR AND BUILD 
//