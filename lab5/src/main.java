/**
 * Created by subtselnyi on 11.04.16.
 */
import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.io.*;
import java.util.Scanner;
public class main {

    public static void main(String[] arg) {
       /* boolean l,p,d;
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
        create.start(l,p,d);*/

        //  Rock r = new Rock();
        // r.rocksong("rocky",4,"rock");
        NewSet arr = new NewSet();
        // arr.add(r);

        /*
        boolean y;
            Scanner sc = new Scanner(System.in);
        System.out.println("Add some elements?");
        y = sc.nextBoolean();
        while (y) {

            if (y) {
                System.out.println("Enter style of comp ");
                String line = sc.next();
                r.setstyle(line);
                System.out.println("Enter title of comp ");
                line = sc.next();
                r.settitle(line);
                System.out.println("Enter length of comp ");
                double l = sc.nextDouble();
                r.setlength(l);
            }
            arr.add(r);
            System.out.println("Add some elements?");
            y = sc.nextBoolean();
        }*/

        Rock[] r = new Rock[5];
        for (int i = 0; i < 2; i++)
            r[i] = new Rock();
        r[0].rocksong("Liebe", 4.08, "rock");
        r[1].rocksong("Lust", 3.24, "rock");

        Jazz[] j = new Jazz[5];
        for (int i = 0; i < 1; i++)
            j[i] = new Jazz();
        j[0].jazzsong("BlueSuedeShoes", 5.26, "jazz");

        Narodniy[] nar = new Narodniy[5];
        for (int i = 0; i < 2; i++)
            nar[i] = new Narodniy();
        nar[0].narodniysong("narodnaya", 3.42, "folk");
        nar[1].narodniysong("RusskieBabki", 3.42, "folk");

        // Composition[] album = new Composition[10];
        arr.add(r[0]);
        arr.add(r[1]);
        arr.add(j[0]);
        arr.add(nar[0]);
        arr.add(nar[1]);


        System.out.println("We have");
        arr.toArray();
        Scanner case1 = new Scanner(System.in);

        while (true) {
            System.out.println("what to do\n" +
                    "1: add\n" +
                    "2:show all\n" +
                    "3:remove\n" +
                    "4:clear\n" +
                    "5:size\n" +
                    "6:contain\n" + "7:isempty?\n" + "8:readfrom input.txt\n"+ "9:write into output.txt\n");
            int case2 = case1.nextInt();
            int rindex = 2;
            int jindex = 1;
            int narindex = 2;
            switch (case2) {
                case 1: {
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

                            System.out.println("Enter style of comp " + (i + 1));
                            temp = sc2.nextLine();
                            if (temp.equals("rock")) {
                                r[rindex] = new Rock();
                                System.out.println("Enter title of comp " + (i + 1));
                                r[rindex].title = sc3.nextLine();
                                System.out.println("Enter length of comp " + (i + 1));
                                r[rindex].length = sc1.nextDouble();
                                r[rindex].style = temp;
                                arr.add(r[rindex]);
                                rindex++;
                            }
                            if (temp.equals("jazz")) {
                                j[jindex] = new Jazz();
                                System.out.println("Enter title of comp " + (i + 1));
                                j[jindex].title = sc3.nextLine();
                                System.out.println("Enter length of comp " + (i + 1));
                                j[jindex].length = sc1.nextDouble();
                                j[jindex].style = temp;
                                arr.add(r[jindex]);
                                jindex++;
                            }
                            if (temp.equals("folk")) {
                                nar[narindex] = new Narodniy();
                                System.out.println("Enter title of comp " + (i + 1));
                                nar[narindex].title = sc3.nextLine();
                                System.out.println("Enter length of comp " + (i + 1));
                                nar[narindex].length = sc1.nextDouble();
                                nar[narindex].style = temp;
                                arr.add(nar[narindex]);
                                narindex++;
                            }

                        }

                    }
                    break;
                }
                case 2: {
                    arr.toArray();
                    break;
                }
                case 3: {
                    Scanner styl = new Scanner(System.in);
                    int styl1 = styl.nextInt();
                    try {
                        arr.remove(styl1);
                    } catch (Except ex) {
                    }
                    break;
                }

                case 4: {
                    arr.clear();
                    break;
                }
                case 5: {
                    arr.size();
                    //arr.SortByStyle("rock");
                    break;
                }
                case 6: {
                    boolean f = arr.contains(r[1]);
                    System.out.println(f);
                    break;
                }
                case 7: {
                    boolean f = arr.isEmpty();
                    System.out.println(f);
                    break;
                }
                case 8:{

                    try (BufferedReader reader = new BufferedReader(new FileReader(new File("/home/subtselnyi/IdeaProjects/lab5/src/input.txt")))) {

                            String line = reader.readLine();
                            String temp[] = line.split(" ");
                            if (temp[0].equals("rock")) {
                                r[rindex] = new Rock();
                                r[rindex].style = temp[0];
                                r[rindex].length = Double.parseDouble(temp[2]);
                                r[rindex].title = temp[1];

                                arr.add(r[rindex]);
                                rindex++;
                            }
                            if (temp.equals("jazz")) {
                                j[jindex] = new Jazz();
                                j[jindex].style = temp[0];
                                j[jindex].length = Double.parseDouble(temp[2]);
                                j[jindex].title = temp[1];

                                arr.add(j[jindex]);
                                jindex++;
                            }
                            if (temp.equals("folk")) {
                                nar[narindex] = new Narodniy();

                                nar[narindex].title = temp[1];
                                nar[narindex].length = Double.parseDouble(temp[2]);
                                nar[narindex].style = temp[0];
                                arr.add(nar[narindex]);
                                narindex++;
                            }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                case 9:{
                    arr.write();
                }
                }


            }

        }
    }

