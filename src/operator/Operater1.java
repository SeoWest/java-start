package operator;

public class Operater1 {

    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a+b;
        System.out.println(sum);

        //뺄셈
        int diff = a-b;
        System.out.println(diff);

        //곱셈
        int multi = a*b;
        System.out.println(multi);

        //나눗셈
        int div = a/b; //int끼리 계산해서 int가 나옴
        System.out.println(div);

        //나머지
        int mod = a % b;
        System.out.println(mod);
    }
}
