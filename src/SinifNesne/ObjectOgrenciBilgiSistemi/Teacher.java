package SinifNesne.ObjectOgrenciBilgiSistemi;

public class Teacher {
    String name;
    String mpno;
    String branch;

    //Constuctor aşağısı
    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Tel : " + this.mpno);
        System.out.println("Bölümü : " + this.branch);
    }
}
