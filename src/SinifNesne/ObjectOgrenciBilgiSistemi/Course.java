package SinifNesne.ObjectOgrenciBilgiSistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    //Constructor
    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    // Methods
    public void addTeacher(Teacher x) {
        if (this.prefix.equals(x.branch)) {
            this.courseTeacher = x;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(x.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
