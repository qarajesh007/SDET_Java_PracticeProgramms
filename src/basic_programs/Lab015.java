package basic_programs;

public class Lab015
 {
     public static void main(String[] args)
      {
          byte b=127; // size= 1byte          range -128 to 127
          short s=1246; // size= 2byte        range -32768 to 32767
          int i=268934; //size= 4byte         range -2^31 to 2^31 -1
          long l=976823421L; //size 8byte      range -2^63 to 2^63 -1

          System.out.println(b);
          System.out.println(s);
          System.out.println(i);
          System.out.println(l);
      }
}
