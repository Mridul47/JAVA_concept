public class JavaVariableTypes {
    static int m= 10; //Static variables
     // Static block to print static variable
    static {
        System.out.println(m);
    }
    void method()  
    {    
        int n = 30;//local variable   
        System.out.println(n); 
    } 
    public static void main(String[] args) {
        int data = 50;//instance variable
        System.out.println(data);

        // Creating an instance to call non-static method
        JavaVariableTypes obj = new JavaVariableTypes();
        obj.method();
    }
}

//explanation
/*
 * 1) Static Variables: Belong to the class and can be accessed by static methods and blocks.
2) Instance Variables: Should be declared inside a class but outside any method (not used here). For example, you could declare int data; outside methods.
3) Local Variables: Declared inside methods or blocks and can only be used within those methods or blocks.
 */

 // explanation of the given code
 /*
  * JavaVariableTypes obj = new JavaVariableTypes();
        obj.method();
  */

  /*
   * Object Creation: JavaVariableTypes obj = new JavaVariableTypes(); creates a new instance of JavaVariableTypes and assigns it to the obj reference variable.

    Method Invocation: obj.method(); calls the method() instance method on the object referenced by obj. This method prints the value of the local variable n which is 30
   */
