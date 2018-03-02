import java.util.Scanner;

/**
 * main method
 */
public class introToMethod {
    public static void main(String[] args) {

        // Get marks from user
        int[] marks = getMarksFromUser();


        // print marks
        printMarks(marks);

        // modify marks
        bumpMarks(marks, 10);

        // print marks
        printMarks(marks);


    }

    /**
     * getting marks
     * @return
     */
    static int[] getMarksFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the class: ");
        int size = scan.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the mark for student " + (i + 1) + ": ");
            marks[i] = scan.nextInt();
        }
        return marks;
    }

    /**
     * printing marks
     * @param marks
     */
    static void printMarks(int[] marks) {
        System.out.println("\nPrinting marks");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }
    }

    /**
     * bumping marks by value bumpBy
     * @param marks
     * @param bumpBy
     */
    static void bumpMarks(int[] marks, int bumpBy) {
        System.out.println("\nModifying marks");
        for (int i = 0; i < marks.length; i++) {
            marks[i] += bumpBy;
        }
    }
}