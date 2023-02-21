public class Main {
    public static void main(String args[])  //static method
    {
        LL1CFG ll1cfg1 = new LL1CFG("S,zToS,n,e;T,zTo,No;N,n,e#S,z,n,e;T,z,no;N,n,e#S,$;T,o;N,o");
        System.out.print(ll1cfg1.parse("zzznoooon"));
    }
}
