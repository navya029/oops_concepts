class Bird {
    public void info(){
        System.out.println("I am a Bird!");
    }
}
class FlyingBird extends Bird{
    public void fly(){
        System.out.println("I am a flying bird!");
    }
}
class Sparrow extends FlyingBird{

}
class Ostrich extends FlyingBird{

}
public class lsv{
    public static void main(String args[])
    {
        Ostrich bird=new Ostrich();
        bird.fly();
    }
}