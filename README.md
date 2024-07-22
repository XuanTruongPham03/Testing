# CV Screening Program
> Luyện tập Kiểm thử và Đảm bảo chất lượng phần mềm

## Mô tả

Chương trình “Lọc CV” được thiết kế để quyết định xem ứng viên là sinh viên mới ra trường có đủ điều kiện tham gia vào các vòng tiếp theo của quy trình tuyển dụng hay không. Quyết định được đưa ra dựa trên điểm GPA của ứng viên và kết quả bài kiểm tra đầu vào của công ty.
| GPA/Kết quả bài thi | Đạt                        | Không đạt      |
|---------------------|-----------------------------|----------------|
| **[0.0, 3.0)**      | Loại                        | Loại           |
| **[3.0, 3.5)**      | Vào vòng 1                  | Loại           |
| **[3.5, 4.0]**      | Vào vòng 2                  | Vào vòng 1     |


### Đầu vào

| Tham số              | Mô tả                         | Giới hạn      |
|----------------------|--------------------------------|---------------|
| **gpa**              | Điểm trung bình tích lũy       | gpa ∈ [0.0, 4.0] |
| **entryTestRes** | Kết quả bài kiểm tra đầu vào    | pass/fail     |


### Đầu ra

Dựa trên giá trị của GPA và kết quả bài kiểm tra đầu vào, chương trình sẽ đưa ra các quyết định sau:

- **invalid input**: Đầu vào không hợp lệ (ví dụ: GPA ngoài khoảng [0.0, 4.0], kết quả bài kiểm tra không phải là "pass" hoặc "fail").
- **reject**: Loại (GPA < 3.0, hoặc GPA ∈ [3.0, 3.5) và kết quả bài kiểm tra là "fail").
- **phase1**: Vào vòng 1 (GPA ∈ [3.0, 3.5) và kết quả bài kiểm tra là "pass", hoặc GPA ∈ [3.5, 4.0] và kết quả bài kiểm tra là "fail").
- **phase2**: Vào vòng 2 (GPA ∈ [3.5, 4.0] và kết quả bài kiểm tra là "pass").

### Yêu cầu chức năng

- Trả về Quyết định tuyển dụng dựa trên đầu vào tương ứng.
- Xử lý những đầu vào không hợp lệ.

## Lập trình

- Ngôn ngữ lập trình `Java`
- Công cụ `JUnit` 

## Cấu trúc mã nguồn
```
./src/
├── main
│   ├── java
│   │   └── sumterm
│   │       └── testing
│   │           ├── Main.java
│   │           └── ScreenCV
│   │               └── CVScreening.java
│   └── resources
│       ├── blackBoxTesting
│       │   ├── boundaryTesting.csv
│       │   └── decisionTableTesting.csv
│       └── CFGTesting
│           └── CFGTesting.csv
└── test
    └── java
        └── CVScreenTesting.java
```

- Các Ca kiểm thử được lấy từ các tệp `.csv` trong folder [`./src/resources/`](./src/main/resources/)
- Tệp [`CVScreenTesting.java`](./src/test/java/CVScreenTesting.java) là nơi thực hiện các ca kiểm thử