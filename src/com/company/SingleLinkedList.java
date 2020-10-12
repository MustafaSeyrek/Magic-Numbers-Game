package com.company;

public class SingleLinkedList {

    Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int insert(Object data) {
        if (head == null) {
            Node newNode = new Node(data);
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getLink() != null) {
                temp = temp.getLink();
            }
            Node newNode = new Node(data);
            temp.setLink(newNode);
        }
        return 0;
    }

    public int size() {
        if (head == null)
            return 0;
        else {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.getLink();
                count++;
            }
            return count;
        }
    }

    public void display() {
        if (head == null)
            System.out.print("");
        else {
            Node temp = head;
            //System.out.print("Randomly generated single linked list:");
            while (temp != null) {
                System.out.print(temp.getData() + " ");
                temp = temp.getLink();
            }
        }
    }


}
