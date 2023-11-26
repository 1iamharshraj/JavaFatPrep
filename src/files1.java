
import java.io.*;

public class files1{
    public static void main(String[] args) throws IOException {
        //File Output/Input stream
//        FileOutputStream F1 = new FileOutputStream("File1.txt");
//        F1.write("this is me".getBytes());
//        F1.close();
//        FileInputStream F2 = new FileInputStream("File1.txt");
//        byte[] arr = F2.readAllBytes();
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.printf("%c",(char)arr[i]);
//        }
        //Data Output/Input Stream
        DataOutputStream Dos = new DataOutputStream(new FileOutputStream("File1.txt"));
        Dos.writeUTF("hello world");
        Dos.close();
        DataInputStream Dis = new DataInputStream(new FileInputStream("File1.txt"));
        Dis.readUTF();
    }
}
