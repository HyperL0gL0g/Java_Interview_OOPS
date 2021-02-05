public class final_keyword  extends  second{
    //final variable
    final int i=10; //initialised final  instance variable
    final int j; //uninitialised final instance variable

    public final_keyword() { // uninitialised  final global variable had to be initialsed through constructor
       j=10;
    }


    public static void main(String[] args) {
        //i=220; //error
        final_keyword ob  =new final_keyword();
        ob.meth();
    }
   /* public void meth() not possible to override the final method
    {

    }*/
    public void meth(int i)
    {
        System.out.println("overloaded method overriden here");
    }

}
class second
{
    public final void meth()
    {
        System.out.println("final method");
    }
//overloaded final method
    public void meth(int i)
    {
        System.out.println("overloaded final method");
    }


}
