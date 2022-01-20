package StudentsGPA;


import java.io.*;
import java.util.Scanner;

public class QuanLyLopHoc implements Serializable {
    static Scanner scanner = new Scanner(System.in);
    HocSinh[] hs;
    MonHoc[] mh;
    BangDiem[] bd;
    int[] diem;
    HocSinh[] checkHS = new HocSinh[10];
    public void nhapHocSinh()
    {
        int dem ;
        System.out.print("Nhập số sinh viên: ");
        dem = Integer.parseInt(scanner.nextLine());
        hs = new HocSinh[dem];
        checkHS = new HocSinh[dem];
        for (int i = 0; i < dem; i++) {
            hs[i] = new HocSinh();
            hs[i] = hs[i].nhap(scanner);
        }

    }
    public void showStudents()
    {
        for (int i = 0; i < hs.length; i++) {
            System.out.println(hs[i].toString());
        }


    }

    public void inputSubjects()
    {
        int dem = 0;
        System.out.print("Nhập số môn học: ");
        dem = Integer.parseInt(scanner.nextLine());
        mh = new MonHoc[dem];
        for (int i = 0; i < dem; i++) {
            mh[i] = new MonHoc();
            mh[i] = mh[i].nhap(scanner);
        }
    }
    public void showSubject() {
        do {
            for (int i = 0; i < mh.length; i++) {
                System.out.println(mh[i].toString());
            }
        }
        while (mh!=null);
    }

    public void nhapDiem(HocSinh[] hocSinhs, MonHoc[] monHocs)
    {
        int countStudent = hocSinhs.length;
        int countSubject = monHocs.length;
        if(countStudent == 0 || countSubject == 0)
        {
            System.out.println("Nhap thong tin sinh vien va mon hoc truoc!");
        }
        else {
            bd = new BangDiem[countStudent];
            for (int i = 0; i < countStudent; i++) {
                boolean check = false;
                HocSinh localStudent = hocSinhs[i];
                System.out.print("Nhap so mon hoc cho sinh vien "+localStudent.getMaHS()+": ");
                int slMonHoc;
                do {
                    slMonHoc = scanner.nextInt();
                    if (slMonHoc > countSubject) {
                        System.out.print("Nhap qua so luong mon hoc!");
                        check = true;
                    } else if (slMonHoc < 1) {
                        System.out.println("Nhap it nhat mot mon hoc");
                        check = true;
                    } else
                        check = false;
                } while (check);
                MonHoc localSub[] = new MonHoc[slMonHoc];
                diem = new int[slMonHoc];
                MonHoc[] subTemps = new MonHoc[slMonHoc];
                boolean check1 = true;
                for (int j = 0; j < slMonHoc; j++) {
                    MonHoc checksub;
                    System.out.println("Nhap ID mon hoc: ");
                    do {
                        int id = scanner.nextInt();
                        checksub = searchForSubject(monHocs,id);
                        if(checksub != null)
                        {
                            subTemps[j] = checksub;
                            if(countSubjects(subTemps,id) >1)
                            {
                                System.out.println("Môn học "+id+" đã có! Nhập môn khác!");
                                check1 = true;
                            }
                            else
                            {
                                check1 = false;
                            }
                        }
                        else {
                            System.out.print("Nhap lai id: ");
                            check1 = true;
                        }
                    }while (check1);
                    System.out.println("Nhap diem:");
                    int checkdiem;
                    do {
                        checkdiem = scanner.nextInt();
                        if(checkdiem < 0 || checkdiem > 10)
                            System.out.println("Vui long nhap diem trong doan [0,10] !");
                    }while (checkdiem < 0 || checkdiem > 10);
                    localSub[j] = checksub;
                    System.out.println("===========");
                    diem[j] = checkdiem;
                }
                bd[i] = new BangDiem(localStudent,localSub,diem);
            }
            showMarks();
        }
    }


    public MonHoc searchForSubject(MonHoc[] monHocs,int name)
    {
        for (int i = 0; i < monHocs.length; i++) {
            if(monHocs[i].getId() == name)
                return monHocs[i];
        }
        return null;
    }
    public int countSubjects(MonHoc[] monHocs,int id)
    {
        int count = 0;
        for (int i = 0; i < monHocs.length; i++) {
            if(monHocs[i] != null)
            {
                if(monHocs[i].getId() == id)
                    count++;
            }

        }
        return count;
    }

    public void showMarks()
    {
        for (int i = 0; i < bd.length; i++) {
            System.out.println(bd[i].toString());
        }
    }
    public void sortByNameStudent()
    {
        for (int i = 0; i < bd.length -1; i++) {
            for (int j = i+1; j < bd.length; j++) {
                if(bd[i].getHocSinh().getTenHS().compareTo(bd[j].getHocSinh().getTenHS()) > 0)
                {
                    BangDiem temp = bd[i];
                    bd[i] = bd[j];
                    bd[j] = temp;
                }
            }
        }
        showMarks();
    }
    public void sortBySubName()
    {
        for (int i = 0; i < bd.length; i++) {
            for (int j = 0; j < bd[i].getMonHocs().length -1; j++) {
                for (int k = j+1   ; k < bd[i].getMonHocs().length; k++) {
                    if(bd[i].getMonHocs()[j].getTenMonhoc().compareTo(bd[i].getMonHocs()[k].getTenMonhoc()) > 0)
                    {
                        MonHoc temp = bd[i].getMonHocs()[j];
                        bd[i].getMonHocs()[j] = bd[i].getMonHocs()[k];
                        bd[i].getMonHocs()[k] = temp;
                    }
                }
            }
        }
        showMarks();
    }



    public HocSinh[] getHS() {
        return hs;
    }

    public void setHs(HocSinh[] hs) {
        this.hs = hs;
    }

    public MonHoc[] getMh() {
        return mh;
    }

    public void setMh(MonHoc[] mh) {
        this.mh = mh;
    }

    public BangDiem[] getBd() {
        return bd;
    }

    public void setBd(BangDiem[] bd) {
        this.bd = bd;
    }
}
