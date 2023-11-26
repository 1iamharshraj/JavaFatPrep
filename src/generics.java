import java.io.*;
import java.util.*;
class math<T>{
    T obj;
    math(T obj){this.obj = obj;}
    public T getObject(){return this.obj;}
}
public class generics {
    //wildcard argument
    public static void add(ArrayList<?> lst){
        System.out.println(lst.toString());

    }
    public static void main(String[] args) {
        math<Integer> obj = new math<Integer>(1);
        System.out.println(obj.getObject());
        math<String> obj1 = new math<String>("harsh");
        System.out.println(obj1.getObject());
        math<Double> obj2 = new math<Double>(1.2);
        System.out.println(obj2.getObject());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        add(arr);
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("Harsh");
        arr1.add("Pranav");
        arr1.add("Anirudh");
        add(arr1);
    }
}
