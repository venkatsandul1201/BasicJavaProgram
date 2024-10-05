public class ArrayDemo {
    public void Add(int x,int y){
        int r= x+y;
        System.out.println("addition is"+" "+r);
    }
    public void Sub(int a,int b){
        int c=a-b;
        System.out.println("Substraction is"+" "+c);
    }
    public void Multiply(int d,int e){
        int f=d*e;
        System.out.println("multiplication is"+" "+f);
    }
    public void Divide(int g ,int h){
        float i=g/h;
        System.out.println("division is"+" "+i);
    }
    public void Mod(int j,int k){
        int l=j%k;
        System.out.println("modul is"+" "+l);
    }
    public static void main(String[] args) {
        ArrayDemo a=new ArrayDemo();
        ArrayDemo s=new ArrayDemo();
        ArrayDemo m=new ArrayDemo();
        ArrayDemo d=new ArrayDemo();
        ArrayDemo mo=new ArrayDemo();
        a.Add(5, 6);
        s.Sub(5, 6);
        m.Multiply(5, 6);
        d.Divide(5, 6);
        mo.Mod(5, 6);
    }
    
}
    