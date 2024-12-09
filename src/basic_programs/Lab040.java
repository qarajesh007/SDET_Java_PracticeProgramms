package basic_programs;

public class Lab040
{
    public static void main(String[] args)
    {
        // > Greater than
        // < Less than
        // >= Greater than or equal to
        // <= Less than or equal to
        // == Equal to
        //!= Not equal to

        // Relational operators always returns boolean value true or false

        int a=10;
         int b=30;
         boolean c=a>b;
         boolean d=a<b;
        System.out.println(c);
        System.out.println(d);

        int age_of_rajesh=29;
        int age_of_amit=29;
        boolean result= age_of_rajesh > age_of_amit;
        boolean age=age_of_rajesh != age_of_amit;
        System.out.println(result);
        System.out.println(age);
        boolean age_comparison= age_of_rajesh >= age_of_amit;
        // here we are checking two conditions 1 greater than    2 equals to which is true
        System.out.println(age_comparison);
     int y=10;
     y +=30;
        System.out.println(y);

     int t=20;
        System.out.println(--t + t++ + t--);
    }
}
