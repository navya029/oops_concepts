class Honda
   {  
     //Static variable reference of Maruti of type Singleton
       private static Honda obj=new Honda();  
       String s;
       //Constructor
       // creating private constructor restricted to this class itsel
       private Honda()  
       {  
      s="this constructor prevents instantiating singleton class from outside";
       }  

       //static method creating instance of singleton class
       public static Honda GetInstance()  
       {  
        
           return obj;  
  
       }  
       public String getDetails()  
       {  
           return "Manufactured India"; 
       } 
}  
public class SingletonEarly 
    {  
  
        public static void main(String[] args)  
        {  
            Honda toy = Honda.GetInstance();
            Honda toy1 = Honda.GetInstance();  
           String x= toy.getDetails(); 
           String y= toy1.getDetails();  
        System.out.println(x); 
        System.out.println(y);   
        }  
    }  
