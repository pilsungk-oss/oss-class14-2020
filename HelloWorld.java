public class HelloWorld extends java.lang.Object {
    public static void main(String args[]) {
        System.out.println("Hello World");
        
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.toString());
    }
    
    // override 하고 싶음. 
    @Override
    public String toString(int x) { // 실제로는 overriding 이 안 일어남
        return "xx";
    }
}