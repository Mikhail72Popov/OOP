package org.example.Seminar05.hw;

/**
 * Реализовать систему работы банковского приложения.
 * - Создать класс пользователь и соответсвующие классы
 * - Реализовать операции зачисления средств пользователю на счет и списания(У пользователя должно быть отдельное
 * поле - его балланс)
 * - Реализовать функции добавления и удаления пользователя
 *
 */
import org.example.Seminar05.hw.view.BankView;

public class Main {
    public static void main(String[] args) {

        BankView bankView = new BankView();
        bankView.BankMenu();
    }
}
