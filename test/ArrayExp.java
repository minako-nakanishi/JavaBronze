
class ArrayExp {

    public static void main(String[] args){

        int i; // iの宣言

        //System.out.println("iの値 "+i);//エラー: 変数iは初期化されていない可能性があります(コンパイルエラー)

        int array[] = new int[5]; // 変数arratの宣言と配列の生成（同時に初期化）
        System.out.println("0番目の要素　"+array[0]);
        // System.out.println("6番目の要素　"+array[5]); //java.lang.ArrayIndexOutOfBoundsException(配列は5番目までしかない)実行時エラー

    }
}