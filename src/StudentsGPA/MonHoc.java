package StudentsGPA;


import java.io.Serializable;
import java.util.Scanner;

public class MonHoc implements Serializable {
    private static int id = 10000;
    private int maMon;
    private String tenMonhoc;
    private int soDonVi;
    private String loaiMon;


    public MonHoc() {
        this.maMon = ++id;
    }

    public int getId() {
        return maMon;
    }

    public void setId(int id) {
        this.maMon = id;
    }

    public String getTenMonhoc() {
        return tenMonhoc;
    }

    public void setTenMonhoc(String tenMonhoc) {
        this.tenMonhoc = tenMonhoc;
    }

    public int getSoDonVi() {
        return soDonVi;
    }

    public void setSoDonVi(int soDonVi) {
        this.soDonVi = soDonVi;
    }

    public String getLoaiMon() {
        return loaiMon;
    }

    public void setLoaiMon(String loaiMon) {
        this.loaiMon = loaiMon;
    }




    public MonHoc nhap(Scanner scanner)
    {
        System.out.println("Nhập tên môn học: ");
        this.setTenMonhoc(scanner.nextLine());
        System.out.println("Nhập số học trình: ");
        this.setSoDonVi(scanner.nextInt());
        scanner.nextLine();
        int check ;
        try {
            System.out.println("Chon loai sach: ");
            System.out.println("1. Đại cương");
            System.out.println("2. Cơ sở ngành");
            System.out.println("3. Chuyên ngành");
            check = scanner.nextInt(); scanner.nextLine();
            switch (check)
            {
                case 1:
                    this.setLoaiMon("Đại cương");
                    break;
                case 2:
                    this.setLoaiMon("Cơ sở ngành");
                    break;
                case 3:
                    this.setLoaiMon("Chuyên ngành");
                    break;
                default:
                    System.out.println("chỉ nhập 1-3 ");
                    break;
            }

        } catch (Exception e)
        {
            System.out.println("Nhập số!");
        }
        return this;

    }

    @Override
    public String toString() {
        return "Subject{" +
                "maMon=" + maMon +
                ", tenMonhoc='" + tenMonhoc + '\'' +
                ", soDonVi=" + soDonVi +
                ", loai='" + loaiMon + '\'' +
                '}';
    }




}
