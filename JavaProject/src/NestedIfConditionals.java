public class NestedIfConditionals {
    public static void main(String[] args) {
        int bodyweight= 70;
        int inclinedumbellpress = 35;
        //applying condition on strength to bodyweight ratio
        if(inclinedumbellpress<=35){
            if(bodyweight>=70){
                System.out.println("You're a beginner at the gym");
            }
        }
    }
}
