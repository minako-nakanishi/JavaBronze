/** 論理演算子
 * 　2つ以上の条件を元に評価を行う際に使用
 */
class Ronri {

    public static void main(String[] args){
        int a = 10; int b = 10; int c = 10; int d = 10; int e = 10; int f = 10;
        int g = 10; int h = 10;

        /** 条件1 & 条件2
         * 条件2は必ず評価される(++が働く)
         */
        boolean result1 = a++ > 10 & ++b > 10;
        System.out.println("result1: "+result1);
        System.out.println("a: " + a); //2回目に参照されたこの時点でa=11となる.
        System.out.println("b: " + b); //11(評価される)

        /** 条件1 && 条件2
         * 条件1がfalseの時、条件2は評価されない(++が働かず無視される)
         */
        boolean result2 = c++ > 10 && ++d > 10;
        System.out.println("result2: " + result2); //false
        System.out.println("c: " + c); //2回目に参照されたこの時点でc=11
        System.out.println("d: " + d); //10(評価されない)

        /** 条件1 | 条件2
         * 条件2は必ず評価される(++が働く)
         */
        boolean result3 = e++ > 10 | ++f > 10;
        System.out.println("result3: " + result3); //true
        System.out.println("e: " + e); //2回目に参照されたこの時点でe=11
        System.out.println("f: " + f); //11(評価される)

        /** 条件1 || 条件2
         * 条件1がtrueなら条件2は評価されない.(++が無視される)
         */
        boolean result4 = g++ > 10 || ++h > 10;
        System.out.println("result4: " + result4); // true
        System.out.println("g: " + g); //11
        System.out.println("h: " + h); //11


        

    }
}