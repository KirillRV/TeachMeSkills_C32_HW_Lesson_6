package lesson_6.task_2;
import java.util.Scanner;
import static lesson_6.task_2.TransferService.addMoney;
import static lesson_6.task_2.TransferService.withdrawMoney;
/** Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 * Создайте один конструктор с двумя параметрами.
 * Создайте класс TransferService - сервис переводов.
 * Добавьте метод, который позволяет начислять сумму на кредитную карточку.
 * Метод принимает на вход сумму и карту. Внутри метода создайте код, который добавляет переданную в метод сумму к текущей сумме на переданной в метод карте.
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 * Метод принимает на вход сумму и карту. Внутри метода напишиет код, который отнимает переданную сумму от текущей суммы на переданной карте.
 * Добавьте метод, который выводит на консоль текущую информацию о карточке.
 * Продумайте и реализуйте различные проверки внтури методов по снятию/добавленрю: например, передана отрицательное число, передан 0, запрос на снятие суммы большей, чем сейчас на карте и другие возможные проверки.
 * Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 * Выведите на экран текущее состояние всех трех карточек.
 */

public class Main {
        public static void main(String[] args) {
            CreditCard card1 = new CreditCard("1234567812345678", 170.0);
            CreditCard card2 = new CreditCard("4444444444444444", 25.0);
            CreditCard card3 = new CreditCard("8888888888888888", 111.0);


            System.out.println(card1);
            System.out.println(card2);
            System.out.println(card3);

            withdrawMoney(155, card1);
            addMoney(777, card2);
            withdrawMoney(111, card3);

            System.out.println("\ncurrent balance:");
            card1.displayIfo();
            card2.displayIfo();
            card3.displayIfo();
        }
}
