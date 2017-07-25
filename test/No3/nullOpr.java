class nullOpr {

    public static void main(String[] args){

        String str1 = null;
        String str2 = "";
        int array1[] = null;
        int array2[] = new int[1];

        System.out.println(str1 == null); //nullが直接代入されているため、true
        System.out.println(str2 == null); //str2は空文字が代入されている（メモリ領域が確保されている）ためnullではない.false
        System.out.println(array1 != null); //array1は配列名の宣言のみでメモリ領域が確保されていない.よってnull.つまりfalse.
        System.out.println(array2 !=null); // 配列の領域が確保されているためnullではない。つまりtrue
    }
}