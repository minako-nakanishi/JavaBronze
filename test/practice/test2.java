class Test2 {

public static void main(String[] args){
// 1. Javaの基本型は？
    /** Javaの基本型は
     * 　byte, short, int, long, float, double, char, booleanの8種類.
     *   stringという型は無い.
     *   Booleanは参照型.
     */

// 2. 各基本型の格納可能範囲
    System.out.println(Byte.MAX_VALUE); //byteの格納可能最大値127
    System.out.println(Short.MAX_VALUE); // shortの格納可能最大値32767
    System.out.println(Integer.MAX_VALUE); //intの格納可能最大値2147483647
    System.out.println(Long.MAX_VALUE); // longの格納可能最大値9223372036854775807

// 3. 変数宣言
    // booleanはtrueかfalse
    boolean a = true;
    boolean b = false;
    // boolean c = "0";// 不適合な型: Stringをbooleanに変換できません(コンパイルエラー)
    //boolean i = "true"; //不適合な型: Stringをbooleanに変換できません(コンパイルエラー)
    System.out.println(a+" "+b);

    // float
    float d = 3.14F;
    float e = 3F;
    // float f = 3.14; //不適合な型: 精度が失われる可能性があるdoubleからfloatへの変換(コンパイルエラー)
    System.out.println(d + "" + e + "");

    // double
    double g = 1000; //1000.0で出力
    System.out.println(g);

    // char
    char h = '\u0078'; // Unicodeで表現できる１文字
    char j = '田'; // 1文字
    System.out.println(h+""+j);

    char array1[] = {'a','b','c','d','e'};
    char array2[] = new char[10];
    array2[0] = 'f';
    array2[1] = 'g';
    System.out.println(array1.length + "" + array2.length);

    int x[] = new int[3];
    boolean y[] = new boolean[3];
    System.out.println("x[0]=" +x[0]+" y[0]=" + y[0]); //初期化して入れば初期値が入る。booleanの初期値はfalse.

    
}
}