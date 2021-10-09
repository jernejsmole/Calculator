import javax.swing.*;

public class find_even {
    public static void main(String[] args) {
        int x = 0;

        while (x < 11){
            if (x % 2 == 0){
                System.out.println( x);
                x ++;
            }
            else {
                x ++;
            }
        }
    }
}
