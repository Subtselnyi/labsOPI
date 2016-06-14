/**
 * Created by subtselnyi on 11.04.16.
 */
import java.util.Scanner;
public class main {

    public static void main(String[] arg) {
        boolean l,p,d;
        Album create = new Album();
        System.out.println("do you wish to calc length of comps[false/true]");
        Scanner sc = new Scanner(System.in);
        l = sc.nextBoolean();
        System.out.println("do you wish to sort comps by style[false/true]");
        Scanner sc1 = new Scanner(System.in);
        p = sc1.nextBoolean();
        System.out.println("do you wish to find comps by length[false/true]");
        Scanner sc2 = new Scanner(System.in);
        d = sc2.nextBoolean();
        create.start(l,p,d);

    }

}
