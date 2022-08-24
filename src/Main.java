import java.util.ArrayList;
import java.util.List;

public class Main {

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
        System.out.println("I am List size=" + lst.size());
        System.out.println(lst);
    }

    public static void out23(Object std) {

        System.out.println(std);
    }

    public static void out(Class cls) {
        System.out.println("I am class name =" + cls.getName());
        System.out.println(cls);
    }

    public static void main(String[] args) {
        Student std = new Student();
        std.setAge(23);
        std.setName("kurt");
        Class cls = std.getClass();
        out(cls);
        var supcls = cls.getClass();
        out(supcls);


    }


}
