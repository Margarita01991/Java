/**+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 30. 
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. */

public class Task04 {
    public static void main(String[] args) {
        final int CONST = 30;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((10 + i) + ((j * 10) + 5) == CONST) {
                    System.out.printf("Равенство верно, если i = %d, j = %d\n", i, j);
                    System.out.printf("1%d + %d5 = "+CONST+"\n", i, j);
                    break;
                }
            }
        }
    }
}
