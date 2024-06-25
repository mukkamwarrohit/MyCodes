import java.util.Scanner;

class GradeCalculator {
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        int count = 0;

        for (int grade : grades) {
            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Grades must be between 0 and 100");
            }

            sum += grade;
            count++;
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of grades: ");
            int n = scanner.nextInt();

            int[] grades = new int[n];

            System.out.println("Enter the grades:");
            for (int i = 0; i < n; i++) {
                System.out.print("Grade " + (i + 1) + ": ");
                grades[i] = scanner.nextInt();
		if(grades[i]>100 || grades[i]<0){
                throw new IllegalArgumentException("Grade must be between 0 and 100");
		}
            }

            double average = calculateAverage(grades);
            System.out.println("Average grade: " + average);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
