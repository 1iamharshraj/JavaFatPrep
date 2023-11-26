interface Human
{
    int a = 10;
    void male();
    void female();

}

class Cmale implements Human{
    public void male(){
        System.out.println("this is male");
    }
    public void female(){
        System.out.println("male part");
    }
}

class Cfemale implements Human{
    public void female(){
        System.out.println("this is female");
    }
    public void male(){
        System.out.println("female part");
    }
}

public class Interface {
    public static void main(String[] args){
        Cmale c = new Cmale();
        c.female();
        c.male();
        Cfemale f = new Cfemale();
        f.female();
        f.male();
    }
}
