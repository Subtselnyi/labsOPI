/**
 * Created by subtselnyi on 12.04.16.
 */
public class Narodniy extends Composition {
   // public String style;
    public void setstyle(String style){
        this.style = style;
    }
    public void narodniysong(String title,double length,String style){
        settitle(title);
        setlength(length);
        setstyle(style);
    }
}

