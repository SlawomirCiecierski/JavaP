package start;

public class cw17 {
    public static void main(String[] args) {
        //char line[]={' ',' ',' '};
        //char kik[][]={line, line, line};
        char kik2 [][]= {{'_', '_','_'},{'_', '_','_'},{'_','_','_'}};
        System.out.printf("%c %c %c\n", kik2[0][0], kik2 [0][1], kik2 [0][2]);
        System.out.printf("%c %c %c\n", kik2[1][0], kik2 [1][1], kik2 [1][2]);
        System.out.printf("%c %c %c\n", kik2[2][0], kik2 [2][1], kik2 [2][2]);

        kik2[1][2]='*';
        System.out.printf("%c %c %c\n", kik2[0][0], kik2 [0][1], kik2 [0][2]);
        System.out.printf("%c %c %c\n", kik2[1][0], kik2 [1][1], kik2 [1][2]);
        System.out.printf("%c %c %c\n", kik2[2][0], kik2 [2][1], kik2 [2][2]);
        kik2[2][0]='o';
        System.out.printf("%c %c %c\n", kik2[0][0], kik2 [0][1], kik2 [0][2]);
        System.out.printf("%c %c %c\n", kik2[1][0], kik2 [1][1], kik2 [1][2]);
        System.out.printf("%c %c %c\n", kik2[2][0], kik2 [2][1], kik2 [2][2]);
    }
}
