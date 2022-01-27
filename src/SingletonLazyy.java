class Maruti  
   {  
     //Static variable reference of Maruti of type Singleton
       private static Maruti obj;  
       String s;
       //Constructor
       // creating private constructor restricted to this class itsel
       private Maruti()  
       {  
      s="this constructor prevents instantiating singleton class from outside";
       }  

       //static method creating instance of singleton class
       public static Maruti GetInstance()  
       {  
           if(obj==null)  
           {  
               obj = new Maruti();  
  
           }  
           return obj;  
  
       }  
       public String getDetails()  
       {  
           return "Manufactured in India"; 
       } 
}  
public class SingletonLazyy 
    {  
  
        public static void main(String[] args)  
        {  
            Maruti toy = Maruti.GetInstance();
            Maruti toy1 = Maruti.GetInstance();  
           String x= toy.getDetails(); 
           String y= toy1.getDetails();  
        System.out.println(x); 
        System.out.println(y);   
        }  
    }  