/** 論理演算子によるtrue,false */
class test3_2{
    public static void main(String[] args){
    int a = 20; int b = 65; int c = 0; int d = 45; int e = 15; int f = 48;
    boolean num = true;

    System.out.println((b>f)||num); //(b>f)→true, num→true.よってtrue
    System.out.println((!num)&&(a<=d)); //!numはfalse, a<=dはtrue. よってfalse.
    System.out.println((b<f)&&(d>=a)); //b<f→false.d>=aはtrue.よってfalse.
    System.out.println((c<e)||(b<=a)); //c<e→true, b<=a→false.よってtrue.
    System.out.println(!(a<c)&&(e !=d)); //!(a<c)→true, e !=d→true.よってtrue.
    }
}