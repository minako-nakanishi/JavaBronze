
/** Javaデータ型 */
class Data{

    public static void main(String[] args){
        /** 符号付き整数 8ビット(-128~127)*/
        byte num1 = 127;
        System.out.println(num1);

        /**符号付き整数 16ビット(-32768~32767) */
        short num2 = 32767;
        System.out.println(num2);

    
        /**符号付き整数 32ビット -2147483648 ~ 2147483647 */
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        int num3 = 2147483647;
        System.out.println(num3);

        /** 符号付き整数 64ビット -9223372036854775808 ~ 9223372036854775807*/
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(Long.MIN_VALUE);
        long num4 = 9223372036854775807L; // long型の変数にlong値を代入する時は数にLかlを付ける.
        System.out.println(num4);
    
        /** 浮動小数点 32ビット */
        // System.out.println(Float.MAX_VALUE);
        float num5 = 3.4028235E38F; // Float型の変数にfloat値を代入する時はFかfを付ける.
        System.out.println(num5);

        /** 浮動小数点 64ビット */
        // System.out.println(Double.MAX_VALUE);
        double num6 = 1.7976931348623157E308;
        System.out.println(num6);

        /** Unicodeで表現される１文字 */
        char code1 = '\uFFFF';
        System.out.println(code1);

        /** 理論値 true or false */
        boolean riron = true;
        System.out.println(riron);
    }

}