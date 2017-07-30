/** ifと論理演算子のコンボ */
class test3_5{

    public static void main(String[] args){
        boolean b = false;
        int i = 0;
        if(i++ > 6 && !b){ //この時点でiは0なのでifの中へは入らない.
            System.out.println(i);
            i++;
            System.out.println(i);
        }
        if(i > 0){ //この時点でi++が発動され、i=1となりtrueとなるためifの中へ入る.
            System.out.println(i);
            b = true;
            System.out.println("b=" +b + " i="+i);
        }
    }
}