public class StringBuilderBuffer{
    public static void main(String[] args){
        StringBuilder str = new StringBuilder();
        str.append("H");
        str.append("a");
        str.append("r");
        str.append("s");
        str.append("h");
        System.out.println(str.toString());
        str.setCharAt(1,'A');
        str.setCharAt(3,'S');
        System.out.println(str.toString());
        System.out.println(str.reverse());

    // every method in string buffer is synchornized so at a time only one thread is able to operate at this
        // disadavantage is until completion of first thread all the other would have to wait till it is completed

        StringBuffer strbf = new StringBuffer();
        strbf.append("Harsh");
        System.out.println(strbf.toString());
        strbf.replace(0,2,"HA");
        System.out.println(strbf.toString());
        strbf.delete(4,5);
        System.out.println(strbf.toString());
        strbf.insert(4,"h");
        System.out.println(strbf.reverse().toString());

        //https://www.geeksforgeeks.org/string-class-in-java/ - check out methods of string here
    }
}
