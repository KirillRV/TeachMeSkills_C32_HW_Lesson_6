package lesson_6.task_1;
/**
 * This is the class that describes a student.
 *
 */
public class Student {
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    String course;

    public Student(String firstName, String lastName, String phoneNumber, String email, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.course = course;
    }
    @Override
        public String toString() {
            return "First name: " + firstName +
                    "\nLast name: " + lastName +
                    "\nphoneNumber " + phoneNumber +
                    "\nemail: " + email +
                    "\ncourse: " + course +
                    '\n';
        }
    }