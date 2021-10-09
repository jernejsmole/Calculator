import org.w3c.dom.ls.LSOutput;

public class Calculator {

    public static int addieren(int a, int b) {
        return a + b;

    }

    public static int substrahieren(int a, int b) {
        return a - b;

    }

    public static int multiplizieren (int a, int b) {
        return a * b;

    }

    public static int Dividieren(int a, int b) {
        return a / b;

    }

    public static int Rest(int a, int b) {
        return a % b;

    }
    public static void main(String[] args) {
        int a = 1;
        double b = 22;
        boolean c = false;
        char d = 'f';
        String f = "hes";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);

        int cc = 5;
        int cd = 26;
        System.out.println(cd%cc);

        int x = addieren(5,7);
        System.out.println(x);
        System.out.println("x = " + x);

        System.out.println(printInvoiceAmount(5));


    }
    // Methode =>
    public static double printInvoiceAmount (double amount){
        return amount;
    }
}
