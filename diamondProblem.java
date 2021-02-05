public class diamondProblem implements I1,I2  {
    public static void main(String[] args) {
        diamondProblem ob = new diamondProblem();
        ob.fun();


    }

    @Override
    public void fun() {
        I2.super.fun();
    }
}
/*interface I1
{
    public default void fun()
    {
        System.out.println("Hi from I1");
    }
}
interface I2 extends I1
{
    public default  void fun()
    {
        System.out.println("Hi form I2");
    }
}*/
interface I1 {

    public default void fun()
    {
        System.out.println("hi from I1");
    }
}
interface I2 {

    public default void fun()
    {
        System.out.println("hi from I2");
    }
}