/**
 * Created by subtselnyi on 11.04.16.
 */
import java.util.Scanner;
public class Composition {
    public String title;
    public double length;
    public String style;

    public void settitle(String title){
        this.title = title;
    }

    public void setlength(double length){
        this.length = length;
    }

    /*public double whatLength(Composition[] m){
        double len = 0;
        for (int i = 0; i<m.length;i++){
            try {
                len = len + m[i].length;
            } catch (Exception e) {
                break;
            }

        }
        System.out.println("The total length of compositions : " + len);

        System.out.println();
        return len;
    }

    public void findSongs(Composition[] m){

        System.out.println("enter the min length");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int len1 = sc1.nextInt();
        System.out.println("enter the max length");
        int len2 = sc2.nextInt();
        for (int i = 0; i<m.length;i++){
            try {
                if ((m[i].length >= len1) && (m[i].length <= len2)) {
                    System.out.println(m[i].title);
                }
            }
            catch (Exception e){
               break;
            }
        }
        System.out.println();

    }

    public void sortByStyle(Composition[] m){
        System.out.println("Rock compositions: ");
        for (int i = 0; i<m.length;i++){
            try {
                if (m[i].style.equals("rock")) {
                    System.out.println("---" + m[i].title);
                }
            }
            catch (Exception e){
                break;
            }
        }
        System.out.println("Jazz compositions: ");
        for (int i = 0; i<m.length;i++){
            try {
                if (m[i].style.equals("jazz")) {
                    System.out.println("---" + m[i].title);
                }
            }
            catch(Exception e){
                break;
            }
        }
        System.out.println("Folk compositions: ");
        for (int i = 0; i<m.length;i++){
            try {
                if (m[i].style.equals("folk")) {
                    System.out.println("---" + m[i].title);
                }
            }
            catch (Exception e){
                break;
            }
        }
        System.out.println();
    }*/



}
