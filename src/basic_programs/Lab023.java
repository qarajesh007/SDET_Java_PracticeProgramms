package basic_programs;

public class Lab023
{
    int a=10; // instance variable
    static int b=20; //static variable

    public void show()
    {
        System.out.println("The value of a="+ a);
    }

    public static void main(String[] args)
    {  int c=30;

       // because of non static method we have to create object
        Lab023 obj=new Lab023();
        obj.show();
        System.out.println("The value of b="+ b);
        System.out.println("The value of c="+ c);

    }
}
