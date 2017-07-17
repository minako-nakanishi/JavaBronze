/**配列 */
class Array1 {

    public static void main(String[] args){

        int[] id;//データ型 配列名 → 配列の宣言
        id = new int[50]; // id配列に50個分の値を格納するための領域確保

        int[] number = new int[50]; // 配列の宣言と領域確保を一度に記述.
        
        /**宣言方法 */
        /**
         * int[] id;
         * int id[];
         * int []id;
         * どれでも良い.
         */

        int[] id2 = {100,101,102,103};
        int size = id2.length;
        System.out.println(size); //4が格納される.

        Array2();
        Array3();
        Array4();

    }

    public static void Array2(){
        char[] c; // 配列の宣言
        c = new char[3]; // 配列の作成

        /** 各要素に値を代入 */
        c[0] = 'A';
        c[1] = 'B';
        c[2] = 'C';
        System.out.println("cの長さ：　" + c.length); // 要素数
    }

    public static void Array3(){
        int[] i = new int[5]; //配列の宣言と作成
        i[0] = 100;
        i[1] = 200;
        i[2] = 300;
        i[3] = 400;
        i[4] = 500;
        System.out.println("iの長さ　"+ i.length);

    }

    public static void Array4(){
        String[] str = {"Welcome","to","Java"}; //配列の宣言と初期化
        System.out.println("strの要素数　"+ str.length);

    }

}