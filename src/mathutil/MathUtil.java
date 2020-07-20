/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static bao.util.MathUtil.computeFactorial;

/**
 *
 * @author Bao
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("5! = " + computeFactorial(5));
        //tui mún biết xem 5! chạy ra đúng hok
        //vậy tui in kết quả xử lí của hàm ra (actual value)
        //tui so sánh nó coi có bằng 120 mà tui tính trước hok(expected value)
        //nếu hàm có 1 value trả về (actual- giả sử 120)
        //và khớp với cái tui cần nó phải thế(expected - giả sủ mình cần trả về 120)
        //actual khớp với expected, hàm chạy như mong đợi, hàm chạy đúng
        //testing chẳng qua là chạy app, chạy hàm, nơi kết quả trả về nó có đúng như mình mong đợi
        // hay ko - actual và expected là như nhau nếu ko khớp, code có bug, hoặc mình kì vọng sai`
        
        //expected; 720 mới chịu heng
        System.out.println("6! = " + computeFactorial(6));
        
        //expected; 1 mới chịu heng
        System.out.println("1! = " + computeFactorial(1));
        
        //expected; 1 mới chịu heng
        System.out.println("0! = " + computeFactorial(0));
        
        
        //cách test kiểu này phải 
        //chuẩn bị data đầu vào 
        //>gọi hàm với data đầu vào
        //>tính trước kết quả trả về(expected)
        //so sánh kq trả về từ hàm (actual) với expected = mắt
        //tự đưa ra kết quả => luận hàm bằng mắt
        
        //expected; Exception mới chịu heng
        System.out.println("-5! = " + computeFactorial(-5));
        
        // kĩ thuật dùng mắt để đối chiếu kết quả ổn nhưng ko hiệu quả
        // vì máy có thể đối chiếu kết quả được luôn mà, máy so được expected và actual luôn mà
        //Giang hồ đưa ra 1 bộ thư viện, 1 FRAMEWORK GIÚP MÌNH
        //TỰ ĐỘNG SO SÁNH 2 KẾT QUẢ EXPECTED VÀ ACTUAL
        //FRAMEWORK này sẽ tự so sánh và đưa ra màu sắc để hàm ý rằng
        //hàm chạy đúng, màu xanh
        //hàm chạy sai, ko như kì vọng màu đỏ
        //áp dụng cho 1 loạt data đầu vào
        //
    }
    
}
