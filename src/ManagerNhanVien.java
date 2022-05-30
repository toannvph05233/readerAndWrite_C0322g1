import java.util.ArrayList;
import java.util.Scanner;

public class ManagerNhanVien {
    ArrayList<NhanVien> nhanViens = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addNhanVien(NhanVien nv) {
        nhanViens.add(nv);
    }

    public NhanVien createNhanVien() {
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập age");
        int age = Integer.parseInt(scanner.nextLine());

        NhanVien nv = new NhanVien(id, name, age);
        return nv;
    }


}
