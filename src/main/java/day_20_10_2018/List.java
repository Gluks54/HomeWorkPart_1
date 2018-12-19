package day_20_10_2018;

import com.sun.javaws.exceptions.InvalidArgumentException;
import day_20_10_2018.SdaList;

public class List implements SdaList {

    Node head;
    public List(){
        head = null;
    }

    @Override
    public boolean isEmpty() {
        if (head != null ){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int size() {
        if (head == null){
            return 0;
        } else {
            Node temp = head;
            int c = 0;
            while ( temp != null){
               temp = temp.next;
               c++;
            }
            return c;
        }
    }

    @Override
    public int getFirst() {
        return head.value;
    }

    @Override
    public int getLast() {

        return get(size() - 1);
    }

    @Override
    public int get(int index) {
        Node temp = head;
        if (temp != null){
            for(int i = 0;i < index; i++){
                temp = temp.next;
            }
            return temp.value;
        } else {
            return head.value;
            //throw new InvalidArgumentException(new String[]{"Lista jest pusta"});

        }

    }
    @Override
    public void clear() {
        for (int i = size(); i > 0;i--){
            head = head.next;
        }
    }

    @Override
    public void addFirst(int element) {

        if (head == null){
            head = new Node();
            head.value = element;
        } else {
         //   System.out.println("jest w addFirst");
            Node temp = new Node();
            temp.next = head;
            head = temp;
            head.value = element;
        }
    }

    @Override
    public void addLast(int element) {
       // System.out.println("jest w addLast");
        if(head == null) {
           // System.out.println("dodaje pierwszy");
            head = new Node();
            head.value = element;
        } else {
           // System.out.println("dodaje kolejny");
            Node current = head;
            while (current.next != null) {
               // System.out.println("\tcurrent: " + current.value);
                current = current.next;
            }
            Node newNode = new Node();
            newNode.value = element;
            current.next = newNode;
        }
    }

    @Override
    public void removeFirst() {
        head = head.next;
    }

    @Override
    public void removeLast() {
       /* Node temp = head;
        while (temp != null){
            temp = temp.next;
        }*/
       Node temp = head;
       if(size() == 1){
           head = null;
       } else {
           int m = size();
           for (int i = 2; i < m; i++) {
               temp = temp.next;
           }
           temp.next = null;
       }
    }

    @Override
    public void setAt(int index, int element) {
        if (index == 0){
            Node temp = new Node();
            temp.next = head.next;
            temp = head;
            head.value = element;
        } else {
            Node temp = new Node();
            Node corrent = head;
            Node number1;
            Node number2;
            Node number3;
            for (int i = 1; i < index; i++) {
                corrent = corrent.next;
            }
            number1 = corrent;
            number2 = corrent.next;
            number3 = corrent.next.next;
            number1.next = temp;
            temp.next = number3;
            number2 = null;
            temp.value = element;
        }
    }

    @Override
    public void addAt(int index, int element) {
        Node temp = new Node();
        Node corrent = head;
        Node corren2;
        if(index >=1){
            for (int i = 1; i < index; i++) {
                corrent = corrent.next;
            }
            corren2 = corrent.next;
            corrent.next = temp;
            temp.next = corren2;
            temp.value = element;
        } else {
            Node temp2 = new Node();
            temp2.next = head;
            head = temp2;
            head.value = element;
        }
    }

    @Override
    public void removeAt(int index) {

        Node temp = head;
        if (index == 1){
            removeFirst();
        } else{
            for (int i = 2; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    class Node {
        int value;
        Node next;

    }
}
