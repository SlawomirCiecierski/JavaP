package start;

public class cw5 {

    public static void main(String[] args) {

        boolean p, q;
        p=true;
        q=true;
        System.out.println((!(p&&q))==((!p)||(!q)));
        p=true;
        q=false;
        System.out.println((!(p&&q))==((!p)||(!q)));
        p=false;
        q=true;
        System.out.println((!(p&&q))==((!p)||(!q)));
        p=false;
        q=false;
        System.out.println((!(p&&q))==((!p)||(!q)));

    }
}
