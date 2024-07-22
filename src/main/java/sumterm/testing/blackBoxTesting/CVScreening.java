package sumterm.testing.blackBoxTesting;

public class CVScreening {
    /*
     * screenCV: Phương thức kiểm thử bài toán lọc CV dựa trên Testcase theo các ca kiểm thử Bảng quyết định và kiểm thử biên
     * //Ca kiểm thử bảng quyết định: /resources/blackBoxTesting/decisionTableTesting.csv
     * //Ca kiểm thử biên: /resources/blackBoxTesting/boundaryTesting.csv
     * 
     * @param gpa: Điểm trung bình tích luỹ của sinh viên
     * @param entryTestRes: Kết quả bài thi đầu vào của sinh viên
     * 
     * @return: Kết quả lọc CV của sinh viên
     */
    public static String screenCV(double gpa, String entryTestRes) {
        // Làm tròn gpa 1 chữ số thập phân hạ xuống
        gpa = Math.floor(gpa * 10) / 10;

        // Đầu vào không hợp lệ
        if (!entryTestRes.equals("pass") && !entryTestRes.equals("fail")) {
            return "invalid input";
        }

        if (gpa < 0 || gpa > 4) {
            return "invalid input";
        }

        if (gpa < 3.0) {
            return "reject";
        }

        if (gpa >= 3.0 && gpa < 3.5) {
            if (entryTestRes.equals("fail")) {
                return "reject";
            } else  {
                return "phase 1";
            }
        } else {
            if (entryTestRes.equals("fail")) {
                return "phase 1";
            } else {
                return "phase 2";
            }
        }

        //return "invalid input";
    }

    public static void main(String[] args) {
        System.out.println(screenCV(3.4, "pass"));
    }
}