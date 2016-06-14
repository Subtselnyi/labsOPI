import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.io.IOException;
import java.lang.Throwable;

/**
 * Created by subtselnyi on 19.04.16.
 */
public class NewSet implements Set<Composition>

{
    static int countCompositions=0;
    Composition[] album = new Composition[10];



    @Override
    public int size() {

        System.out.println(countCompositions);
        return countCompositions;
    }

    @Override
    public  boolean isEmpty() {
        return (countCompositions==0);
    }

    @Override
    public boolean contains(Object o) {
        boolean f=true;
        for( int i = 0; i<countCompositions; i++) {
            if (album[i].equals(o)) return true;
            f=false;
        }
       /* if (!f) {
          throw new Exception();
        }*/
        return false;
    }

    @Override
    public Iterator<Composition> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        for (int i = 0; i<countCompositions; i++) {
            System.out.println(album[i].title);
            System.out.println(album[i].length);
            System.out.println(album[i].style);
        }
        return album;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return (T[]) album;
    }

    @Override
    public boolean add(Composition composition) {
        //if (contains(composition)) return false;

        if (countCompositions<album.length) {
            album[countCompositions] = composition;
            countCompositions++;
        } else {

            Composition[] temp = album;
            album = new Composition[(int) (album.length*1.5)];
            for (int i = 0; i<temp.length; i++){
                album[i]=temp[i];
            }
            album[countCompositions] = composition;
            countCompositions++;

        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
                return false;
    }

    public boolean remove(int index) throws Except {
        boolean f=true;
        if (index>countCompositions){
            f=false;
            throw new Except("no index");

        }
       // if (contains(o)) {
            for (int i = index - 1, j = index; i < countCompositions; i++, j++) {

                album[i] = album[j];
                album[countCompositions - 1] = null;
                countCompositions--;
            }


        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {

        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Composition> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i<countCompositions; i++)
            album[i] = null;
            countCompositions=0;

    }
    public void setCompositions(){

    }
    public void setCompositions(Composition o){
        add(o);
    }
    public void setCompositions(Collection<Composition> o){
        for (Composition c : o){
            add(c);
        }
    }

    public void SortByStyle(String style){
        for (int i = 0; i<countCompositions;i++){
            if (album[i].style.equals(style)){
                System.out.println(album[i].title);
            }
        }

    }

    public void write(){
    try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File("/home/subtselnyi/IdeaProjects/lab5/src/output.txt")))) {

        for (int i=0;i<countCompositions;i++) {
            writer.write(album[i].title);
            writer.write(" ");
            writer.write(album[i].style);
            writer.write(" ");
            writer.write(String.valueOf(album[i].length));
            writer.write("\n");
        }
    } catch (IOException e) {
        e.printStackTrace();
    } ;
}
}
