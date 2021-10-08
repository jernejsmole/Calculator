public class ArithmetischeOperationen {
    public static void main(String[] args) {
        int a = 22;
        int b = 23;

        float f = (float) (a/(b * 1.0));

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(f);
        System.out.println(a%b);

        int x = add(5,6);
        System.out.println(x);

    }

    public static int add (int a, int b) {
        return a + b;

    }
}
