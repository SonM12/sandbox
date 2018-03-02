public class Methods {
    public static void main(String[] args){
        printWhateverInfo();

        getAndPrintAverage(2,5);
    }

    static void getAndPrintAverage(int a, int b){
        double average = getAverage(a,b);
        System.out.println("average = " + average);

    }

    private static void printWhateverInfo() {
        // print whatever info
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    private static double getAverage(int a, int b){

        return (a+b)/2.0;
    }
}
