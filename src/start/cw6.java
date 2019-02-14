package start;

import java.util.Random;


public class cw6 {

    public static void main(String[] args) {

        Random rnd=new Random();
        int var1=rnd.nextInt(10)+1;
        System.out.println("var1 = " + var1);
        int var2=rnd.nextInt(10)+1;
        System.out.println("var2 = " + var2);
        System.out.println("czy va1 jest większe od var2? "+ (var1>var2));
        System.out.println("czy va1 x 2 jest większe od var2? "+ (((var1*2)>(var2))));
        System.out.println("(czy var2 + 3) jest mniejsze  od (var1 - 2)? "+ ((var2+3)<(var1-2)));
        System.out.println("Iloczyn var1 i var2 jest parzysty "+ (((var1*var2)%2)==0));



        


    }
}
