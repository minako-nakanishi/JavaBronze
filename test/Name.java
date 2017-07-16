/**文字列 */
class Names {

    public static void main(String[] args){
      
    //文字列は参照型
    String name = "スカリン";
    System.out.println(name);

    int nameNum = name.length(); //name内の値の文字数
    System.out.println(nameNum);

    char c = name.charAt(2); //charAtメソッドの引数番目の文字を抜き出す.
    System.out.println(c);
    }
}