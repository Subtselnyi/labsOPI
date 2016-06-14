/**
 * Created by subtselnyi on 11.04.16.
 */

import java.util.Scanner;

public class Album {
    /*
    public static int n = 7;
    Composition obj = new Composition();
    public void start(boolean l,boolean p,boolean d){

    Rock[] r = new Rock[5];
        for(int i=0;i<2;i++)
            r[i]=new Rock();
    r[0].rocksong("Liebe",4.08,"rock");
    r[1].rocksong("Lust",3.24,"rock") ;

    Jazz[] j = new Jazz[5];
        for(int i=0;i<1;i++)
            j[i]=new Jazz();
    j[0].jazzsong("BlueSuedeShoes",5.26,"jazz");

    Narodniy[] nar = new Narodniy[5];
        for(int i=0;i<2;i++)
            nar[i]=new Narodniy();
    nar[0].narodniysong("narodnaya",3.42,"folk");
    nar[1].narodniysong("RusskieBabki",3.42,"folk");

    Composition[] album = new Composition[10];
        album[0]=r[0];
        album[1]=r[1];
        album[2]=j[0];
        album[3]=nar[0];
        album[4]=nar[1];


        System.out.println("add songs?[true/false]");
        Scanner sc = new Scanner(System.in);
        boolean y = sc.nextBoolean();
        if (y) {
            System.out.println("Enter n");
            int n = sc.nextInt();


            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);
            String temp;
            for (int i = 0; i < n; i++) {
                int rindex=2;
                int jindex=1;
                int narindex = 2;
                System.out.println("Enter style of comp " + (i + 1));
                temp = sc2.nextLine();
                if (temp.equals("rock")) {
                    r[rindex] = new Rock();
                    System.out.println("Enter title of comp " + (i + 1));
                    r[rindex].title = sc3.nextLine();
                    System.out.println("Enter length of comp " + (i + 1));
                    r[rindex].length = sc1.nextDouble();
                    r[rindex].style = temp;
                    album[5+i] = r[rindex];
                    rindex++;
                }
                if (temp.equals("jazz")) {
                    j[jindex] = new Jazz();
                    System.out.println("Enter title of comp " + (i + 1));
                    j[jindex].title = sc3.nextLine();
                    System.out.println("Enter length of comp " + (i + 1));
                    j[jindex].length = sc1.nextDouble();
                    j[jindex].style = temp;
                    album[5+i] = j[jindex];
                    jindex++;
                }
                if (temp.equals("folk")) {
                    nar[narindex] = new Narodniy();
                    System.out.println("Enter title of comp " + (i + 1));
                    nar[narindex].title = sc3.nextLine();
                    System.out.println("Enter length of comp " + (i + 1));
                    nar[narindex].length = sc1.nextDouble();
                    nar[narindex].style = temp;
                    album[5+i] = nar[narindex];
                    narindex++;
                }

            }

        }
/*
     if (l) {
         obj.whatLength(album);
     }
     if (p){
         obj.sortByStyle(album);
     }
    if (d){
        obj.findSongs(album);
    }*/
  }


   /* public void album() {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter title of comp "+ (i+1));
            album[i].title = sc.nextLine();
            System.out.println("Enter length of comp "+ (i+1));
            album[i].length = sc1.nextInt();
            System.out.println("Enter style of comp "  + (i+1));
            album[i].style = sc2.nextLine();

        }
    }*/
