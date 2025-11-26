import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    StudentDAO dao = new StudentDAO();
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
      System.out.println("\n--- Student Management System ---");
      System.out.println("1. Add Student");
      System.out.println("2. View Students");
      System.out.println("3. Update Student");
      System.out.println("4. Delete Student");
      System.out.println("5. Exit");
      System.out.print("Enter choice: ");
      choice = sc.nextInt();
      sc.nextLine(); // consume newline

      switch (choice) {
        case 1 -> {
          System.out.print("Name: ");
          String name = sc.nextLine();
          System.out.print("Age: ");
          int age = sc.nextInt();
          sc.nextLine();
          System.out.print("Email: ");
          String email = sc.nextLine();
          System.out.print("Course: ");
          String course = sc.nextLine();
          dao.addStudent(new Student(name, age, email, course));
        }
        case 2 -> {
          List<Student> list = dao.getAllStudents();
          System.out.println("\nID | Name | Age | Email | Course");
          for (Student s : list) {
            System.out.printf("%d | %s | %d | %s | %s\n",
                s.getId(), s.getName(), s.getAge(), s.getEmail(), s.getCourse());
          }
        }
        case 3 -> {
          System.out.print("Enter ID to update: ");
          int id = sc.nextInt();
          sc.nextLine();
          System.out.print("Name: ");
          String name = sc.nextLine();
          System.out.print("Age: ");
          int age = sc.nextInt();
          sc.nextLine();
          System.out.print("Email: ");
          String email = sc.nextLine();
          System.out.print("Course: ");
          String course = sc.nextLine();
          Student s = new Student(name, age, email, course);
          s.setId(id);
          dao.updateStudent(s);
        }
        case 4 -> {
          System.out.print("Enter ID to delete: ");
          int id = sc.nextInt();
          sc.nextLine();
          dao.deleteStudent(id);
        }
        case 5 -> System.out.println("Exiting...");
        default -> System.out.println("Invalid choice.");
      }

    } while (choice != 5);

    sc.close();
  }
}
