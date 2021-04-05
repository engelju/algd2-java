package cc.engelju;
import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {

    private static class Element<T> {
        T data;
        Element<T> next;
    }

    private Element<E> head;
    private int size = 0;

    SinglyLinkedList() {
        this.head = null;
    }

    void insertFirst(E data)
    {
        // create new element
        Element<E> newElement = new Element<E>();

        newElement.data = data;
        newElement.next = this.head;

        this.head = newElement;
        this.size++;
    }

    void insertAfter(E data, int index)
    {
        if (index > this.size-1 || index < 0) {
            throw new IndexOutOfBoundsException("invalid list index");
        }

        Element<E> newElement = new Element<E>();
        newElement.data = data;

        Element<E> iterator = head;
        for (int i = 0; i < index; ++i){
            iterator = iterator.next;
        }

        newElement.next = iterator.next;
        iterator.next = newElement;

        this.size++;
    }

    void removeFirst() {}
    void removeAt(int index) {}
    void removeAll() {}

    E getFirst() 
    {
        if (head == null) {
            throw new NoSuchElementException("list is empty");
        }
        
        return head.data;
    }

    E getAt(int index)
    {
        if (index > this.size-1  || index < 0){
            throw new IndexOutOfBoundsException("invalid list index");
        }

        Element<E> iterator = head;
        for (int i = 0; i < index; ++i){
            iterator = iterator.next;
        }
        return iterator.data;
    }

    int size() {
        return this.size;
    }

    @Override
    public String toString(){
        String result = "";
        Element<E> r = head;
        while (r!=null){
            result += (r.data.toString() + "  ");
            r = r.next;
        }
        return result;
    }
}
