public class interfaceJava8 implements I{
    public static void main(String[] args) {
        interfaceJava8 ob = new interfaceJava8();
        ob.fun(); // object needed for abstract method
        ob.def(); // object needed for default method
        I.stat(); // no object needed for static methods use Interface.method()
    }

    @Override
    public void fun() {
        System.out.println("hi from fun abstract method");

    }
}
interface I
{
    public abstract void fun();
    public default void def()
    {
        System.out.println("hi from default method");
    }
    public static void stat()
    {
        System.out.println("hi from static methods");
    }
}
