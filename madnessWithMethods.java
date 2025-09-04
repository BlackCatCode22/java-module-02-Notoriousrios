//madnessWithMethods.java
// rVE 09/02/25

import java.util.Scanner;
public class madnessWithMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Hello enter number for x ");
        int x = input.nextInt();

        System.out.println(" Hello again enter number for sillynumber ");
        int sillynumber = input.nextInt();

        int z=add(x,sillynumber);
        System.out.println("The return value is"+z);

        // example if defined
        // int x = 3
        // int y = 6

        // int z = add(x,y)
    }
    static int  add(int x, int y) {

        int z = (x + y);
        return z;
    }
}