public class NhanVien {
    private int idNV;
    private String name;
    private int age;

    public NhanVien() {
    }

    public NhanVien(int id, String name, int age) {
        this.idNV = id;
        this.name = name;
        this.age = age;
    }

    public int getIdNV() {
        return idNV;
    }

    public void setIdNV(int idNV) {
        this.idNV = idNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  idNV +
                "," + name + "," + age;
    }
}
