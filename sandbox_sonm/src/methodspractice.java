public class methodspractice {
    public static void main(String[] args){
        printStuff();
        printSum(3,5);

        printAverage(4.5,5.0);
        printName("roy", "son");
    }
    static void printStuff(){
        System.out.println("Hello");
    }
    private static int sum(int a, int b){
        return a+b;
    }
    static void printSum(int a, int b){
        int result = sum(a,b);
        System.out.println(result);
    }
    private static double average(double x, double y){
        return (x+y)/2.0;
    }
    static void printAverage(double x, double y){
        double resultt = average(x,y);
        System.out.println(resultt);
    }
    private static String name(String firstName, String lastName){
        return lastName + firstName;
    }
    static void printName(String firstName, String lastName){
        String fullName = name(firstName, lastName);
        System.out.println(fullName);
    }
    // private static
}
