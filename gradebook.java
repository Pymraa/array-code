import java.util.Scanner;

public class gradebook {
    static int[] roll = new int[50];
    static String[] name = new String[50];
    static int[] marks = new int[50];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Student Gradebook Manager ====");
            System.out.println("1) Add Student");
            System.out.println("2) Display All");
            System.out.println("3) Search Student (by Roll / by Name)");
            System.out.println("4) Class Average & Topper");
            System.out.println("5) Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    if (count < 50) {
                        System.out.print("Enter Roll: ");
                        int r = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String n = sc.nextLine();
                        int m;
                        while (true) {
                            System.out.print("Enter Marks (0-100): ");
                            m = sc.nextInt();
                            if (m >= 0 && m <= 100) {
                                break;
                            } else {
                                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                                continue;
                            }
                        }
                        addStudent(r, n, m);
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Gradebook full!");
                    }
                    break;

                case 2:
                    displayAll();
                    break;

                case 3:
                    System.out.println("Search by: 1) Roll  2) Name");
                    int opt = sc.nextInt();
                    sc.nextLine();
                    if (opt == 1) {
                        System.out.print("Enter Roll to search: ");
                        int r = sc.nextInt();
                        search(r);
                    } else if (opt == 2) {
                        System.out.print("Enter Name to search: ");
                        String n = sc.nextLine();
                        search(n);
                    }
                    break;

                case 4:
                    if (count > 0) {
                        double avg = computeAverage(marks, count);
                        System.out.println("Class Average: " + String.format("%.2f", avg));
                        int top = 0;
                        for (int i = 1; i < count; i++) {
                            if (marks[i] > marks[top]) {
                                top = i;
                            }
                        }
                        System.out.println("Topper:");
                        System.out.println("Roll: " + roll[top]);
                        System.out.println("Name: " + name[top]);
                        System.out.println("Marks: " + marks[top]);
                        System.out.println("Grade: " + grade(marks[top]));
                    } else {
                        System.out.println("No students yet.");
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option! Try again.");
                    continue;
            }
        }
    }

    public static void addStudent(int r, String n, int m) {
        roll[count] = r;
        name[count] = n;
        marks[count] = m;
        count++;
    }

    public static void displayAll() {
        if (count == 0) {
            System.out.println("No records.");
            return;
        }
        System.out.println("Roll   Name     Marks   Grade");
        for (int i = 0; i < count; i++) {
            System.out.println(roll[i] + "   " + name[i] + "   " + marks[i] + "   " + grade(marks[i]));
        }
        System.out.println("Total Students: " + count);
    }

    public static void search(int r) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.println("Found:");
                System.out.println("Roll: " + roll[i]);
                System.out.println("Name: " + name[i]);
                System.out.println("Marks: " + marks[i]);
                System.out.println("Grade: " + grade(marks[i]));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No record found.");
        }
    }

    public static void search(String n) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (name[i].equalsIgnoreCase(n)) {
                System.out.println("Found:");
                System.out.println("Roll: " + roll[i]);
                System.out.println("Name: " + name[i]);
                System.out.println("Marks: " + marks[i]);
                System.out.println("Grade: " + grade(marks[i]));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No record found.");
        }
    }

    public static double computeAverage(int[] m, int c) {
        int sum = 0;
        for (int i = 0; i < c; i++) {
            sum += m[i];
        }
        return (double) sum / c;
    }

    public static String grade(int m) {
        if (m >= 85) return "A";
        else if (m >= 70) return "B";
        else if (m >= 50) return "C";
        else return "F";
    }
}

