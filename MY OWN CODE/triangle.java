import java.util.Scanner;

/*
this the code for generating triangle on basis of user inputs...              ----->  [thnkxgod]
 */
public class triangle {

    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.println("Enter the SIZE for pyramid : ");
        int sz = ref.nextInt();

        int p = sz;
        for (int r = 0; r <= sz; r++) {
            for (int i = 0; i <= p; i++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= r * 2; j++) {
                System.out.print(" * ");
            }
            System.out.println();
            p--;
        }
    }
}