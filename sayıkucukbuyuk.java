import java.util.Scanner;
import java.util.SortedMap;

public class sayýkucukbuyuk {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input =new Scanner(System.in) ;

        System.out.print("1.sayý :");
        a =input.nextInt();
        System.out.print("2.sayý :");
        b = input.nextInt();
        System.out.print("3.sayý :");
        c=input.nextInt() ;

        if ((a<b) && (a<c) && (b<c)) {
            System.out.println("a<b<c");}
        else if ((b<c) && (b<a) && (a<c))
        System.out.println("b<a<c");
        else if ((c<a)&& (c<b) && (b<a))
            System.out.println("c<b<a");
        else if ((c<a) && (c<b)&& (a<b))
            System.out.println("c<a<b");
        else if ((a<c) && (a<b) && (c<b))
                System.out.print("a<c<b");
        else
        System.out.println("b<c<a") ;

    }}
