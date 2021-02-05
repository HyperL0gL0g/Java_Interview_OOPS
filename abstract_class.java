public class abstract_class extends abs {
    public static void main(String[] args) {
        abstract_class ob =new abstract_class();
        ob.abs0();
        abs.abs1();
        ob.abs2();

    }

    @Override
    void abs0() {
        System.out.println("abstract method implemented");
    }
}
abstract class abs
{
    abstract  void abs0();
    static  void abs1()
    {
        System.out.println("abstract method - static ");
    }
    void abs2()
    {
        System.out.println("normal method in abstract class");
    }

}
