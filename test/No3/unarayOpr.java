/** 単項演算子 */
class unOpr {

    public static void main(String[] args){

        int a = 10;
        int b = ++a;
        
        System.out.println("b " + b); // 11
        System.out.println("a " + a); // 11

        int c = 10;
        int d = c++;
        System.out.println("d " + d); // 10
        
        unSub();
    }

    public static void unSub(){

        int e = 10;
        int f = --e;
        System.out.println("f " + f); //9

        int g = 10;
        int h = g--;
        System.out.println("h " + h); //10
    }
}