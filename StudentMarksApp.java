import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarksApp {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

ArrayList<String> names = new ArrayList<>();
ArrayList<Double> marks = new ArrayList<>();

// Enter number of students
System.out.print("Enter number of students: ");
int n = input.nextInt();
input.nextLine();

// Store student names and marks
for (int i = 0; i < n; i++) {

System.out.print("Enter student name: ");
String name = input.nextLine();

System.out.print("Enter student mark: ");
double mark = input.nextDouble();
input.nextLine();

names.add(name);
marks.add(mark);
}

// Display student records
System.out.println("\n--- STUDENT RECORDS ---");

double total = 0;
double highest = marks.get(0);
String highestStudent = names.get(0);

for (int i = 0; i < n; i++) {

System.out.println("Name: " + names.get(i)
+ " | Mark: " + marks.get(i));

total += marks.get(i);

// Identify highest mark
if (marks.get(i) > highest) {
highest = marks.get(i);
highestStudent = names.get(i);
}
}

// Calculate average
double average = total / n;

System.out.println("\nAverage mark: " + average);

// Display highest mark
System.out.println("Highest mark: " + highest);
System.out.println("Student with highest mark: "
+ highestStudent);

// Count students above threshold
System.out.print("\nEnter threshold mark: ");
double threshold = input.nextDouble();

int count = 0;

for (int i = 0; i < n; i++) {

if (marks.get(i) > threshold) {
count++;
}
}

System.out.println("Students above threshold: " + count);

input.close();
}
}