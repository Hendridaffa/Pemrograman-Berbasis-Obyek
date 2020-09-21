package pertemuan.pkg3;

/**
 *
 * @author ASUS ROG
 */
public class EncapDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {;
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void status() {
        System.out.println("Name : " + getName());
        if (age > 18 && age < 30) {
            System.out.println("age : " + getAge());
        } else {
            System.out.println("Age bernilai minimal 18 dan maksimal 30");;
        }
        System.out.println();
    }
}
