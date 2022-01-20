package StudentsGPA;


import java.io.Serializable;
import java.util.Arrays;

public class BangDiem implements Serializable {
    private HocSinh hocSinh;
    private MonHoc[] monHocs;
    private int[] diem;

    public BangDiem() {
    }

    public BangDiem(HocSinh hocSinh, MonHoc[] monHocs, int[] diem) {
        this.hocSinh = hocSinh;
        this.monHocs = monHocs;
        this.diem = diem;
    }

    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }

    public MonHoc[] getMonHocs() {
        return monHocs;
    }

    public void setMonHocs(MonHoc[] monHocs) {
        this.monHocs = monHocs;
    }

    public int[] getDiem() {
        return diem;
    }

    public void setDiem(int[] diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Bang Diem{" +
                "hoc sinh=" + hocSinh +
                ", mon hoc=" + Arrays.toString(monHocs) +
                ", diem=" + Arrays.toString(diem) +
                '}';
    }
}
