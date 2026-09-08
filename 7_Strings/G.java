import java.util.ArrayList;

class G {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");

        System.out.println('a' + 3);
        System.out.println("a" + 3);

        System.out.println("Krishna" + new ArrayList<>());
        System.out.println("Krishna" + Integer.valueOf(37));

        System.out.println(true + "8");

        Integer a = 89;
        Integer b = 67;

        // Integer c = a + b;
        System.out.println(a + b);

        // System.out.println(Integer.valueOf(6) + new ArrayList());
        System.out.println(Integer.valueOf(6) + "" +  new ArrayList());

    }
}