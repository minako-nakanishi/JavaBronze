class test3_1 {

    public static void main(String[] args){
        int num1 = 5;
        int num2 = 7;

        System.out.print((5+3*8)+" "); //普通の計算と同様に掛け算から処理される.よって29.
        System.out.print(++num1 * num2++); //6✖7
        System.out.println("");
    }
}