/** 定数 */
class Final {

    public static void main(String[] args){

        /**定数宣言には final データ型　定数名 = 初期値 */

        int mnk1 = 10; // 変数宣言
        mnk1 = 20; // 変数は再代入が可能
        System.out.println(mnk1);

        final int teisuu = 30; //定数宣言
        // teisuu = 40; //再代入不可。ここでコンパイルエラーとなる

    }
}