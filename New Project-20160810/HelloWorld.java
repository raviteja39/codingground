public class HelloWorld{

     public static void main(String []args){
        Integer i3 = 300;
        Integer i4 = i3;
        if(i3 == i4) System.out.println("same object");
        if(i3.equals(i4)) System.out.println("meaningfully equal");
     }
}
