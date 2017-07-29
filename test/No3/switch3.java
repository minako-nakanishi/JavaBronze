class Switch3{

    public static void main(String[] args){
        int num =1;

        switch(num){
            //numが1の時、以下の処理実行
            case 1:
            //numが2の時、以下の処理実行
            case 2:
            System.out.println("numは1か2");
            break; //numが1か2の時、switchから抜ける.

            //numが3の時、以下の処理実行
            case 3:
            //numが4の時、以下の処理実行
            case 4:
            System.out.println("numは3か4");
            break;//numが3か4の時、switchから抜ける.

            //numが1~4以外の時の処理
            default:
            System.out.println("numは1から4以外");
        }
    }
}