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
    }
}