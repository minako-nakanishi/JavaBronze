class Switch2{

    public static void main(String[] args){
        int num = 2;
        switch(num){
            // numの値が1の時、以下の処理実行
            case 1:
            System.out.println("numの値は1です");
            break; // numの値が1の時はswitchから抜ける.
            
            //numの値が2の時、以下の処理実行
            case 2:
            System.out.println("numの値は2です");

            default:
            System.out.println("defaultです");

        }
    }
}