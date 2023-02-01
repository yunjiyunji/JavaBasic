package overloading;

public class OverloadingDemo2 extends OverloadingDemo{
    void A (String arg1, String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}
    void A (){System.out.println("sub class : void A ()");}  //overloading - 여러 개의 같은 이름 메소드 정의
    public static void main(String[] args) {  //overriding - 부모클래스와 시그니처가 같은 메소드를 자식클래스에서 새롭게 정의 
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody");
         
    }
}