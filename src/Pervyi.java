
class Factorial {
    int fact(int a) {
        int res;
        if(a==1) return 1;
        res=fact(a-1)*a;
        return res;
    }
}
public class Pervyi {
    public static void main(String args[]) {
        Factorial mybox = new Factorial();
        System.out.println("Факториал 3 равен " + mybox.fact(3));
        System.out.println("Факториал 3 равен " + mybox.fact(4));
        System.out.println("Факториал 3 равен " + mybox.fact(5));
    }
}