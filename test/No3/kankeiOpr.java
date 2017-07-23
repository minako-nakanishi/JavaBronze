/** 関係演算子 */
/**
 * 2つの値を比較し、その結果をboolean値であるtrueもしくはfalseを返す.
 * trueは関係演算子による比較が成立したことを示し、falseは成立しなかったことを示す.
 */
class Kankei {

    public static void main(String[] args){
        int a = 10; int b = 20; int c = 10;
        System.out.println("a == b " + (a==b)); //false
        System.out.println("a == c " + (a == c)); //true
        System.out.println("a != b " + (a !=b)); //true
        System.out.println("a !=c " + (a !=c)); //false
        System.out.println("a < b " + (a < b)); //true
        System.out.println("a <= c " + (a <= c)); //true
        System.out.println("a > b " + (a > b)); //false
        System.out.println("a >= c " + (a >=c)); //true
    }
    /** 両辺が等しいかどうかの比較には == を用いる.
     * 代入演算子 = は使わない.
     */
}