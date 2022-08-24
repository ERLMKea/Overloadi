import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainArrayList {

    public static void out(String str) {
        System.out.println(str);
    }

    public static void out(ArrayList<? extends Object> lst) {
        out("I am extends Object");
        System.out.println(lst);
    }

    public static void out(List<String> lst) {
        out("I am List interface size=" + lst.size());
        System.out.println(lst);
    }

    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<>();
        lst.add("kurt");
        out(lst);

        ArrayList<Student> stdlst = new ArrayList<>();
        Student std1 = new Student();
        std1.setAge(22);
        std1.setName("Kurt");
        stdlst.add(std1);
        Student std2 = new Student();
        std2.setAge(28);
        std2.setName("Anne");
        stdlst.add(std2);
        out(stdlst);

        ArrayList<Integer> ilst = new ArrayList<>();
        ilst.add(5);
        ilst.add(10);
        out(ilst);

    }
}

