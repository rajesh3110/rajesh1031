abstract class shape


   {


     abstract void draw();

   }
    

class rajesh extends shape

 {
       void draw()
        {

        System.out.println("From rajesh class");
          }
}


class bhosale extends shape
{

 
  void draw()
   {


   System.out.println("from bhosale class ");

}

}
 class AbstractDemo2 
   {

   public static void main(String ags[])
   {
     shape rt=new bhosale();
     rt.draw();
     //AbstractDemo2 bb=new rajesh();

    // bb.draw();


}
}  
 
   
