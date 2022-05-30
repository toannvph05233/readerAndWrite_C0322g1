import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<NhanVien> nhanViens = reader();
    }

    public static List<NhanVien> reader() {
        File file = new File("nhanvien.csv");
        List<NhanVien> newNVs = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();

            while (str != null) {
                String[] arr = str.split(",");
                int id = Integer.parseInt(arr[0]);
                int age = Integer.parseInt(arr[2]);
                NhanVien nhanVien = new NhanVien(id, arr[1], age);
                newNVs.add(nhanVien);
                str = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error");
        }
        return newNVs;
    }

    public static void write(List<NhanVien> list) {
        File file = new File("nhanvien.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (NhanVien nv : list) {
                bufferedWriter.write(nv.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
