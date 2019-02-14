package start;

public class Variables {

    public static void main(String[] args) {
//        int x = 0;
//        System.out.println(x);
//        int y;
//        y = x + 11;
// itd. operacje na zmiennych..
//        napisy
        String word= "Lorem ipsum Lorem ipsum";
        System.out.println(word.charAt(8));
        System.out.println(word.indexOf("s"));
//        porównanie
        String word2="Header";
        System.out.println(word.equals(word2));
        System.out.println(word2.equals("header"));
        System.out.println(!word2.equals(word)); //! - NOT
        System.out.println(word.substring(6, 11)); //ipsum
        System.out.println(word.substring(6, 11).length()); // długośćipsum
        String words[]= word.split (" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        //System.out.println(word.split(" ").);



    }
}
