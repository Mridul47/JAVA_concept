public class JavaVariableWidening {
    public static void main(String[] args) {
        int a = 10;
        float f =a;
        System.out.println(a); //here it gives answer 10 as its integer
        System.out.println(f); //here it gives answer 10.0 as its a float
    }
}
