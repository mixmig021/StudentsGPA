package StudentsGPA;


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static HocSinh[] hocSinhs = new HocSinh[100];
    static MonHoc[] monHocs = new MonHoc[100];
    static BangDiem[] bangDiems = new BangDiem[100];

    public static void main(String[] args) {
        QuanLyLopHoc ql = new QuanLyLopHoc();

        int check ;

        System.out.println("1 Nhập danh sách sinh viên");
        System.out.println("2 Hiển thị danh sách sinh viên");
        System.out.println("3 Nhập danh sách môn học");
        System.out.println("4 Hiển thị danh sách môn học");
        System.out.println("5 Nhập điểm cho sinh viên");
        System.out.println("6 Sắp xếp bảng điểm theo tên sinh viên");
        System.out.println("7 Sắp xếp bảng điểm theo tên môn học");
        System.out.println("8 lưu dữ liệu vào file text");
        System.out.println("khác-thoát");
        try {
            System.out.println("chọn một chức năng");
            check = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Yêu cầu nhập 1-8!");
            check = 0;
        }
        switch (check)
        {
            case 1:
                ql.nhapHocSinh();
                break;
            case 2:
                ql.showStudents();
                break;
            case 3:
                ql.inputSubjects();
                break;
            case 4:
                ql.showSubject();
                break;
            case 5:
                hocSinhs = ql.getHS();
                monHocs = ql.getMh();
                if(monHocs != null && monHocs != null)
                {
                    ql.nhapDiem(hocSinhs, monHocs);
                    break;
                }
                else {
                    break;
                }
            case 6:
                hocSinhs = ql.getHS();
                monHocs = ql.getMh();
                if(monHocs != null && hocSinhs != null)
                {
                    ql.sortByNameStudent();
                    break;
                }
                else {
                    break;
                }
            case 7:
                hocSinhs = ql.getHS();
                monHocs = ql.getMh();
                if(monHocs != null && hocSinhs != null)
                {
                    ql.sortBySubName();
                    break;
                }
                else {
                    break;
                }
            case 8:

                break;
            default:
                System.out.println("Nhập đúng lựa chọn theo chỉ mục của chức năng!");
        }
    }

}
