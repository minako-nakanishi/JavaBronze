/** switch文 */
class Switch{

    /**iが1の時はbreakによりswichから抜ける
     * iが2の時はbreak文が無いため、switch文から抜けない.
     */
    public static void main(String[] args){
        switch(i){ //switchブロックi=byte,char,int,enum,String型でないと駄目
            case 1:
            System.out.println("1");
            break;
            case 2:
            System.out.println("2");
            case 3:
            System.out.println("3");
            default:
            System.out.println("default");
        }
    }
}