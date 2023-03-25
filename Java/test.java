import java.util.Scanner;

class test {
    public static void main(String[] args) {

    public boolean isHappy(int n) {
        int fnl = 0;
        while (n != 1) {
            if (fnl == 1) {
                System.out.println("happy");
            } else if (n == 0) {
                System.out.println("not happy");
            }
            if (n < 10) {
                n = n * n;
            }
            int rem = n % 10;
            int fnlTemp = rem * rem;
            fnl = fnl + fnlTemp;
            n = n / 10;

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ; ");
        int num = sc.nextInt();
        isHappy(num);

    }
}
}