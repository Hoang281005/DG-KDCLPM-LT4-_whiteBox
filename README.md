# 📘 BÀI THỰC HÀNH 04 - KIỂM THỬ HỘP TRẮNG (WHITE-BOX TESTING)

## 👤 Thông tin sinh viên
- Họ tên: Nguyen Huy Hoang
- Mã sinh viên: 23010143
- Môn học: Đánh giá & Kiểm thử phần mềm

---

## 📌 Mô tả bài tập
Bài thực hành sử dụng ngôn ngữ Java để xây dựng các chương trình cơ bản và áp dụng kỹ thuật kiểm thử hộp trắng (White-box Testing) bằng JUnit.

Mục tiêu:
- Phân tích câu lệnh, nhánh điều kiện, vòng lặp và đường đi logic
- Thiết kế test case đạt độ bao phủ cao (statement coverage & branch coverage)
- Viết test tự động bằng JUnit

---

## 🧮 Danh sách chức năng

1. Tính chu vi hình chữ nhật  
2. Tính diện tích hình chữ nhật  
3. Giải phương trình bậc 2  
4. Tính số ngày của một tháng  
5. Kiểm tra số nguyên tố  
6. Tính tổng S = 1 - 2 + 3 - 4 + ... + n  
7. Tìm UCLN của hai số  
8. Tính tổng S = 1! + 2! + ... + n!

---

## 🧪 Kiểm thử JUnit

### ✔ Công cụ sử dụng
- JUnit 5

### ✔ Mục tiêu kiểm thử
- 100% Statement Coverage
- 100% Branch Coverage
- Kiểm thử:
  - Input hợp lệ
  - Input biên (edge cases)
  - Input lỗi (invalid cases)
  - Ngoại lệ (exceptions)
  - Vòng lặp (loop coverage)

---

## 📊 Phân tích White-box Testing

### 1. Câu lệnh (Statement Coverage)
- Tất cả các dòng code trong từng hàm đều được thực thi ít nhất 1 lần

### 2. Nhánh (Branch Coverage)
- Mỗi điều kiện if/else được kiểm thử cả TRUE và FALSE

### 3. Vòng lặp (Loop Coverage)
- Kiểm thử:
  - 0 lần lặp
  - 1 lần lặp
  - nhiều lần lặp

### 4. Đường đi logic
- Bao phủ các path chính của từng thuật toán

---

## 🧾 Test Case
Danh sách test case được thiết kế trong file JUnit, bao gồm:

- Test hợp lệ (valid cases)
- Test biên (boundary cases)
- Test lỗi (invalid cases)
- Test ngoại lệ (exception cases)

---

## ▶️ Cách chạy chương trình

### Chạy bằng IDE (IntelliJ / Eclipse)
- Run file `main`
- Run JUnit test

### Chạy bằng Maven
```bash
mvn test