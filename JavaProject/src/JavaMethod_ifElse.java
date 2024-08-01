public class JavaMethod_ifElse{
    static void checkAge(int age){
        if(age<18){
            System.out.println("A-Minorrrrrr");
        } else{
            System.out.println("Valid age");
        }

    }

    public static void main(String[] args) {
        checkAge(17);
    }
}