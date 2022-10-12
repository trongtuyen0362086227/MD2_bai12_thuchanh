package thuchanh2;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAssress() {
        return address;
    }

    public void setAssress(String assress) {
        this.address = assress;
    }

    @Override
    public String toString() {
        return "StudentName=" + name + ",age=" + age + ",address=" + address;
    }
}