class parent{
    public void hello(){
        System.out.println("hello from parent");
    }
}
class child extends parent{
@Override
public void hello(){
    System.out.println("hello from child");
}
}
class main{
    public static void main(String[] args){
        parent p=new child();
        p.hello();
        parent p1 = new parent();
        p1.hello();
    }
}