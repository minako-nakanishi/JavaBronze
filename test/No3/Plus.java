/** 単項演算子まとめ */
class Plus{

    public static void main(String[]args){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println(++a); //11
        System.out.println(b++); //20
        System.out.println(--c); //29
        System.out.println(d--); //40

        a = 10; b = 10; c = 10; d = 10;

        b = ++a;
        System.out.println("a = " + a + " b = " + b); // a = 11, b = 11

        d = c++;
        System.out.println("c = " + c + " d = " + d); // c = 11, d = 10
    }
}