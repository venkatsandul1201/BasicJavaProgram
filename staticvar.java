public class staticvar {
    static int x=20;
    public static void main(String[] args) {
        staticvar t= new staticvar();
        staticvar s= new staticvar();
        staticvar y= new staticvar();
        s.x=t.x+5;
        t.x=s.x+5;
        System.out.println(s.x);
        System.out.println(y.x);
        System.out.println(t.x);


    }
    
}
