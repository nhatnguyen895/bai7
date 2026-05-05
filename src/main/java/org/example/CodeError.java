package org.example;

import java.util.*;

/**
 * LỚN 1: Thiếu Javadoc chuẩn cho Class (Ví dụ: thiếu @author, @version).
 * LỖI 2: Dòng này quá dài, chắc chắn vượt quá giới hạn 100 hoặc 120 ký tự của Checkstyle -----------------------------------------------------------------------------------------------------------
 */
public class CodeError {

    // LỖI 3: Thụt lề sai (nên dùng 4 khoảng trắng, ở đây dùng táp hoặc quá nhiều khoảng trắng)
    private String mistake1;

    // LỖI 4: Thiếu khoảng trắng xung quanh toán tử assignment (=) và dấu phẩy (,)
    private int badFormatting=10;
    private int[] emptyArray = {1,2,3,4};

    // LỖI 5: Đặt tên biến không theo quy tắc camelCase (phải là mySecretString)
    private String My_Secret_String = "secret";

    /**
     * LỖI 6: Thụ thụt lề sai cho phương thức
     * LỖI 7: Thiếu @param tag trong Javadoc cho biến 'number'
     */
    public int multiply(int number) {
        // LỖI 8: Unit Test sẽ hỏng ở đây: Tôi muốn tính 'number * 2' nhưng tôi lại viết là 'number + 2'
        return number + 2;
    }

    // LỖI 9: Thiếu Javadoc cho phương thức
    // LỖI 10: Quy tắc WhitespaceAround: 'if' không có khoảng trắng sau
    public void printSomething(String text) {
        if(text == null) {
            // LỖI 11: Dấu ngoặc nhọn mở '{' nên ở cuối dòng trên
            System.out.println("Text is null");
        }
        // LỖI 12: 'else' nên ở cùng dòng với dấu ngoặc nhọn đóng của 'if'
        else
        {
            System.out.println("Text is: " + text);
        }
    }
}