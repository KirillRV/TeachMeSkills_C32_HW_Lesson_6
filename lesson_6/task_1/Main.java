package lesson_6.task_1;

/** Создать класс для описания студента нашей группы.
 * Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию - например, возраст).
 * Создать объекты этого класса для каждого из студента нашей группы.
 * Поместить все эти обеъекты в массив.
 * Пройти по массиву циклом for и вывести информацию на консоль.
 */
public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[4];
        student[0] = new Student("Kirill", "Reges", "+37529xxxx", "kirillreges@gmail.com", "java");
        student[1] = new Student("Ilya", "Rymtsov", "+37529xxxx", "IlyaRymtsov@gmail.com", "java");
        student[2] = new Student("Kate", "Rublevskaya", "+37529xxxx", "Katerublevskaya@gmail.com", "java");
        student[3] = new Student("Sultan", "Samedov", "+37529xxxx", "Sultansamedov@gmail.com", "java");

        for (Student students: student) {
            System.out.println("\n" + students.toString());
        }
    }
}
