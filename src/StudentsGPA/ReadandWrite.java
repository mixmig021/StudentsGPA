package StudentsGPA;

import java.io.*;

public class ReadandWrite {
    public static void writeFileStudent(HocSinh[] hocSinhs){
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("StudentList.txt", true))) {
            outputStream.writeObject(hocSinhs);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readFileStudent(){
        HocSinh[] hs = new HocSinh[0];
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("StudentList.txt"))) {
            hs = (HocSinh[]) inputStream.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        for (HocSinh hocSinh : hs) {
            System.out.println(hs);
        }
    }

    public void writeFileMarkSheet(BangDiem[] bangDiems){
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("GPATableList.txt", true))) {
            outputStream.writeObject(bangDiems);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readFileMarkSheet(){
        BangDiem[] bd = new BangDiem[0];
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("GPATableList.txt"))) {
            bd = (BangDiem[]) inputStream.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        for (BangDiem bangDiem : bd) {
            System.out.println(bd);
        }
    }

    public static void writeFileSubject(MonHoc[] monHocs){
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("SubjectList.txt", true))) {
            outputStream.writeObject(monHocs);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readFileSubject(){
        MonHoc[] mh = new MonHoc[0];
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("SubjectList.txt"))) {
            mh = (MonHoc[]) inputStream.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        for (MonHoc monHoc : mh) {
            System.out.println(mh);
        }
    }
}