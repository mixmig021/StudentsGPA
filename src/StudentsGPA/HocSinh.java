package StudentsGPA;



import java.io.Serializable;
import java.util.Scanner;

public class HocSinh implements Serializable {
    static int idTemp = 10000;
    private int maHS;
    private String tenHS;
    private String diaChi;
    private String soDT;
    private String lop;

    public HocSinh(int maHS, String tenHS, String diaChi, String soDT, String lop) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.lop = lop;
    }

    public HocSinh() {
        this.maHS = ++idTemp;
    }

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public HocSinh nhap(Scanner scanner)
    {
        try{
            System.out.println("Họ và tên:");
            this.setTenHS(scanner.nextLine());
            System.out.println("Địa chỉ:");
            this.setDiaChi(scanner.nextLine());
            System.out.println("Số điện thoại:");
            this.setSoDT(scanner.nextLine());
            System.out.println("Lớp:");
            this.setLop(scanner.nextLine());
        } catch (Exception e)
        {
            System.out.println("nhập đúng định dạng!");
        }
        return this;
    }

    @Override
    public String toString() {
        return "Hoc Sinh:" +
                "iD=" + maHS +
                ", tên HS='" + tenHS + '\'' +
                ", địa chỉ='" + diaChi + '\'' +
                ", số điện thoại='" + soDT + '\'' +
                ", lớp='" + lop + '\'' +
                '}';
    }


}
