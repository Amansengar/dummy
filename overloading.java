class overloading
{
public void f1(int x)
{
System.out.println("PARENT");
}
}
class child extends overloading
{
public void f1(int x,int y)
{
System.out.println("Pchild");
}
}
public class example
{
public static void main(String []args)
{
child obj =new child();
obj.f1(5);
obj.f1(3,4);
}
}