/** 演算子 */
class strAdd {

    public static void main(String[] args){

        String str = "Hello";
        int a = 10;
        int b = 20;

        System.out.println(str + a); // Hello10
        /** 
         * ①左から加算される.
         * ②str+aが成されるため、Hello10が生成される.
         * ③Hello10に20が加算されるためHello1020となる.
         */
        System.out.println(str + a + b); // Hello1020
        /**
         * ①(a + b)から計算される.
         * ②Hello + 30となる
         * ③Hello30となる
         */
        System.out.println(str + (a + b));

        /**
         * ①左側から加算されるため、a+bが計算される.
         * ②30にHelloが足される.
         * ③30Hello
         */
        System.out.println(a + b + str);
    }
}