import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void out(String str) {
        System.out.println(str);
    }

    public static void out(int i) {
        System.out.println(i);
    }

    public static void out(Integer ii) {
        if (ii.equals(17)) { out("we got 17"); }
        System.out.println("I am Integer =" + ii);
    }

    public static void out(boolean b) {
        System.out.println(b);
    }
    public static void out(double d) {
        System.out.println(d);
    }

    public static void out23(List<String> lst) {
        System.out.println(lst);
    }

    public static void out2(ArrayList<Object> lst) {
        System.out.println(lst);
    }

    public static <T> void out(List<T> lst) {
        System.out.println(lst);
    }

    public static void out(Object std) {
        System.out.println(std);
    }

    public static void main(String[] args) {
        out("just hej");
        out(3>4);
        out(4.5);
        ArrayList<String> lst = new ArrayList<>();
        lst.add("kurt");
        lst.add("Anne");
        out(lst);
        ArrayList<Student> lststud = new ArrayList<>();
        out(lststud);

        Student std = new Student();
        std.setAge(25);
        std.setName("Kurt");
        out(std);


    }



}
