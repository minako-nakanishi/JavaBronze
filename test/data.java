
/** Javaデータ型 */
class Data{

    public static void main(String[] args){
        /** 8ビット(-128~127)*/
        byte num1 = 127;
        System.out.println(num1);

        /**16ビット(-32768~32767) */
        short num2 = 32767;
        System.out.println(num2);

    
        /**32ビット -2147483648 ~ 2147483647 */
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        int num3 = 2147483647;
        System.out.println(num3);

        /** 64ビット -9223372036854775808 ~ 9223372036854775807*/
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(Long.MIN_VALUE);
        long num4 = 9223372036854775807L;
        System.out.println(num4);
    
    }
}