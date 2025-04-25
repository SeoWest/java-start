package variable;

public class Var3 {
    public static void main(String[] args) {
        int a;

        a = 10;
        System.out.println(a);

        a = 50; // 기존 값(10)이 사라지고 a는 50이 된다.
        System.out.println(a);
    }
}
