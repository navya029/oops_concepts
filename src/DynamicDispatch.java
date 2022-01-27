class FirstReference
{  void message1()
    {
        System.out.println("Inside A's message1 method");
    }
}
  
class SecondReference extends FirstReference
{
   void message1()
    {
        System.out.println("Inside B's message1 method");
    }
}
  
class DynamicDispatch
{
    public static void main(String args[])
    {
       
        FirstReference a = new FirstReference();
        SecondReference b = new SecondReference();
        FirstReference ref;
        ref = a;
        ref.message1();
        ref = b;
        ref.message1();
  
    }
}

