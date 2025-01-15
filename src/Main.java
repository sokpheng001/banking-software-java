import java.time.Instant;
import java.util.Date;

class OuterClass{
    private static int id;
    private static Date date;
    public OuterClass(){}
    public OuterClass(int id, Date date){
        OuterClass.id = id;
        OuterClass.date = date;
    }
    class InnerClass{
        void get(){
            System.out.println(id);
            System.out.println(date);
        }
    }
    static class NestedClass{
        void get(){
            System.out.println(id);
            System.out.println(date);
        }
    }
}

public class Main {
    public static void main(String[] args){
        OuterClass outerClass = new OuterClass(1, Date.from(Instant.now()));
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.get();
        //
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        nestedClass.get();
    }
}
