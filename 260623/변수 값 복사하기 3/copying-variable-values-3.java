public class Main {
    public static void main(String[] args) {
    
        int a = 1;
        int b = 5;
        int c = 3;

        a = c; // 1
        a = a+c; // 4
        b = b-c; // 2

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}