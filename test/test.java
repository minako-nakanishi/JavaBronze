/** リテラル */
class Test{

    public static void main(String[] args){
        System.out.println("Hello World");
        /** 整数リテラル */
        System.out.println(398); // 10進数
        System.out.println(0222); // 8進数(0スタート))
        System.out.println(0xbb); // 16進数(0xスタート)
        System.out.println(0b101); // 2進数(0bスタート)

        /** 浮動小数リテラル */
        System.out.println(19.87); //10進数の小数点有り表記
        System.out.println(3e6); //指数を表すe(またはE)を使う

        /** 文字リテラル */
        System.out.println('田'); //1つの文字を表現
        System.out.println('\u3012'); //Unicode(特殊文字)

        /** 文字リテラル */
        System.out.println("Hello"); //複数の文字列を扱うときは""を使用する

        /** 論理値リテラル */
        System.out.println(true); //真
        System.out.println(false);//偽
    }
}