
/** 条件演算子 */
class Joken4 {

    /** 条件式 ? 式1 : 式2 
     * 条件式がtrueなら式1が、falseなら式2が実行される.
    */
    public static void main(String[] args){
        int num = 20;
        String str = "numの値は";
        str += num < 10 ? "10未満" : "10以上";
        System.out.println(str);
    }
}