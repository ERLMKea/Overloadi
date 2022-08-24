public class MainInteger {

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


    public static void main(String[] args) {
        out("just hej");
        out(5);
        Integer i = 6;
        out(i);
        out(Integer.parseInt("22"));
        int i1 = Integer.parseInt("22");
        var i2 = Integer.valueOf("122");
        out(i2);

    }
}
