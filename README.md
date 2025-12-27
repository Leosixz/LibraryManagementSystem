# LibraryManagementSystem

## 1. Giới thiệu
Đây là chương trình quản lý thư viện đơn giản được xây dựng bằng Java theo mô hình lập trình hướng đối tượng (OOP).
Hệ thống cho phép quản lý sách, độc giả và quá trình mượn/trả sách thông qua giao diện console.

## 2. Các chức năng chính
- Thêm sách vào thư viện
- Hiển thị danh sách sách
- Tìm sách theo tên
- Mượn sách
- Trả sách
- Kiểm tra trạng thái sách

## 3. Áp dụng OOP
- Encapsulation: Thuộc tính private, truy cập qua method
- Inheritance: Reader, Librarian kế thừa User
- Polymorphism: Ghi đè phương thức getRole()
- Abstraction: Lớp User là abstract

## 4. Công nghệ sử dụng
- Ngôn ngữ: Java
- Phiên bản Java: Java 8 trở lên
- Giao diện: Console

## 5. Hướng dẫn chạy chương trình
### Cách 1: Chạy bằng IDE (IntelliJ / Eclipse / VS Code)
1. Mở project
2. Chạy file Main.java
3. Chương trình hiển thị menu console

### Cách 2: Chạy bằng dòng lệnh
```bash
javac src/library/*.java
java library.Main
