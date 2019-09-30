import java.util.*;
abstract class Inter
    {

          abstract void cal();
          final static Scanner sc=new Scanner(System.in);
          abstract void get();
         final int sbiinterest=7;
      
       final float hdfcinterest=9.8f;
       static String name;
       static int amount=0;
       static float result=0f;
 
    }


class SBI extends Inter
       {
;
            void get()
            {
              System.out.println("Enter the name :");
              name=sc.nextLine();
              System.out.println("Enter the amount  :");
              amount=sc.nextInt();
            }   
             void cal()
          {
          
              result=(float)(amount*sbiinterest)/100;
              System.out.println("Mr "+name+" Interest amount of SBI WLL be "+result+" On "+ amount);

           }


        }

class HDFC extends Inter
            {

                    void get()
            {
              System.out.println("Enter the name :");
              name=sc.nextLine();
              System.out.println("Enter the amount  :");
              amount=sc.nextInt();
            }         
               void cal()
              {
             
               result=(float)(amount*hdfcinterest)/100;
               System.out.println("Mr "+name+" Interest amount of HDFC WLL be "+result+" On "+ amount);
 
             }


              }


class AbstractDemo3
            {

                 public static void main(String ag[])
                 {
                 
                  
                  Inter i=new SBI();
                  i.get();
                  i.cal();
                  Inter i2=new HDFC();
                  i2.get();  
                  i2.cal();




}
}
              
