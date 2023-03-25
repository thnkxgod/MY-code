
class parent {
    int a = 10;
    int b = 6;
}

public class single__inheritance extends parent {
    public static void main(String args[]) {

        parent p1 = new parent();
        int a = 7;
        System.out.println(p1.a);
        System.out.println(a);
        a = p1.a;
        int sum = p1.a + p1.b;
        System.out.println(sum);
        System.out.println(p1.a);
        System.out.println(a);

    }

}
