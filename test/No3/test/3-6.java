 
class test3_6{

    public static void main(String[] args){
        boolean b = true;
        /** b=falseの結果はfalse */
        if(b = false)
            System.out.println(b); //if文に{}がない場合、最初の1行がif文に適用される。ここは読まれない。
            System.out.println(b);//b=falseによりbにfalseが代入されている.
        
    }
}