/**代入演算子 */
class Dainyu {

    public static void main(String[] args){
        int a;
        int b;
        a = 10;
        b = a;
        System.out.println(b); // aをbに代入

        int c = 10; int d = 20;
        c +=d;
        System.out.println(c); //cにdを加えたものをcに代入する。c=c+d

        int e = 40; int f = 30;
        e -=f;
        System.out.println(e); // eにfからeを引いたものを代入する。e=e-f

        int g = 5; int h = 8;
        g *=h;
        System.out.println(g); // gにgとhを掛けたものを代入する。g = g*h

        int i = 10; int j = 2;
        i /= j;
        System.out.println(i); // iにi/jの答えを代入する.i=i/j

        int k = 7; int l = 2;
        k %=l;
        System.out.println(k); //k/lの余りをkに代入する.

    }
}