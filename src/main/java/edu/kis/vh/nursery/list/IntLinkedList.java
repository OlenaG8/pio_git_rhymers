package edu.kis.vh.nursery.list;

/**
 * Klasa implementująca dwukierunkową listę powiązaną przechowującą liczby całkowite.
 */
public class IntLinkedList {

    private Node last;

    /**
     * Dodaje nową wartość na koniec listy.
     * * @param i Wartość całkowita, która ma zostać dodana do listy.
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Sprawdza, czy lista jest obecnie pusta.
     * * @return true, jeśli lista nie zawiera żadnych elementów; false w przeciwnym razie.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza, czy lista jest pełna.
     * * @return Zawsze zwraca false, ponieważ lista powiązana ma dynamiczny rozmiar.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartość ostatnio dodanego elementu bez usuwania go z listy.
     * * @return Wartość ostatniego elementu lub -1, jeśli lista jest pusta.
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    /**
     * Pobiera wartość ostatniego elementu i usuwa go z listy (zdejmuje ze stosu).
     * * @return Wartość usuniętego elementu lub -1, jeśli lista była pusta.
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Wewnętrzna klasa reprezentująca pojedynczy węzeł w strukturze listy powiązanej.
     */
    private static class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Tworzy nowy węzeł o zadanej wartości.
         * @param i Wartość węzła.
         */
        public Node(int i) {
            this.value = i;
        }

        /**
         * @return Wartość przechowywana w węźle.
         */
        public int getValue() {
            return value;
        }

        /**
         * @return Referencja do poprzedniego węzła na liście.
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Ustawia referencję do poprzedniego węzła.
         * @param prev Poprzedni węzeł.
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * @return Referencja do następnego węzła na liście.
         */
        public Node getNext() {
            return next;
        }

        /**
         * Ustawia referencję do następnego węzła.
         * @param next Następny węzeł.
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }

}