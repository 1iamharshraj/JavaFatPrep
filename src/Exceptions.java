import java.io.IOException;
import java.util.Scanner;


///user defined
class myfault extends Exception{
    public myfault(String message){
        super(message);
    }

}

public class Exceptions {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //pre defined
        try{
            int a[] = new int[2];
            System.out.println(a[3]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            if(n == 1){
                throw new myfault("this is user based exception");

            }

        }
        catch(myfault f){
            System.out.println(f.getMessage());
        }
    }

}
