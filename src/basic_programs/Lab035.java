package basic_programs;

public class Lab035
{
    public static void main(String[] args)
    {  char c1='a';
        char c2='A';
        char c3='@';
        char c4='#';

        //Escape characters
       char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char car_r= '\r';
        System.out.println("Rajesh" + new_line + "Patil" );
        System.out.println("Rajesh"+ tab_line+ "Patil");
        System.out.println("Rajesh"+ back_space+"Patil");
        System.out.println("Rajesh"+ car_r+"Patil");

    }
}
