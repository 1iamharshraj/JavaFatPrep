class mathOperations{
    public void add(int a ,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

}

public class FunctionOverloading {
    public static void main(String[] args){
        mathOperations m = new mathOperations();
        m.add(1,2);
        m.add(1,2,3);
    }
}
