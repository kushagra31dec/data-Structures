class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int data) {
        this.data = data;
    }

    public static int length(Node head) {
        Node temp = head;
        int l = 0;
        while (temp != null) {
            l++;
            temp = temp.next;
        }
        return l;
    }

    public static Node insertAtHead(Node head, int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        return head;
    }

    public static Node insertAtTail(Node head, int data) {
        if (head == null) {
            head = insertAtHead(head, data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node node = new Node(data);
            temp.next = node;
        }
        return head;
    }

    public static Node insertAtPos(Node head, int data, int pos) {
        Node temp = head;
        int l = length(head);
        if (pos == 1) {
            head = insertAtHead(head, data);
        } else if (pos > l) {
            head = insertAtTail(head, data);
        } else {
            int c = 1;
            while (c < pos) {
                temp = temp.next;
                c++;
            }
            Node node = new Node(data);
            node.next = temp.next;
            temp.next = node;
        }
        return head;
    }

    public static Node deleteAtHead(Node head) {
        if (head != null) {
            head = head.next;
        }
        return head;
    }

    public static Node deleteAtTail(Node head) {
        if (head == null || head.next == null) {
            head = deleteAtHead(head);
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }

    public static Node deleteAtPos(Node head, int pos) {
        Node temp = head;
        int c = 1;
        int l = length(head);
        if (pos == 1) {
            head = deleteAtHead(head);
        } else if (pos >= l) {
            head = deleteAtTail(head);
        } else {
            while (c < pos) {
                temp = temp.next;
                c++;
            }
            temp.next = temp.next.next;
        }
        return head;
    }

    public static boolean searchItr(Node head, int key) {
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            return false;
        }
        return true;
    }

    public static boolean searchRec(Node head, int key) {
        if (head == null) {
            return false;
        } else if (head.data == key) {
            return true;
        } else if (searchRec(head, key)) {
            return true;
        }
        return false;
    }

    public static Node reverseList(Node head) {

        if (head == null || head.next == null) {
            return head;
        } else {
            Node prev = null;
            while (head.next != null) {
                Node temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
            }
            head.next = prev;
            return head;
        }
    }

    public static Node reverseListRec(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node newHeadNode = reverseListRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHeadNode;
    }
    public static void knodefromend(Node head,int k) {
        
        int len = length(head);
        len = len-k+1;
        int curr=1;
        Node temp = head;
        while (temp != null&&curr<len) {
            temp = temp.next;
            curr++;
        }
        System.out.println(temp.data);
    }
    public static Node midpoint(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

public class linked_lesson_1 {
    public static void main(String[] args) {
        Node head = null;
        head = Node.insertAtTail(head, 1);
        Node.insertAtTail(head, 2);
        Node.insertAtTail(head, 3);
        Node.insertAtTail(head, 4);
        Node.insertAtTail(head, 5);
        Node.insertAtTail(head, 6);
        Node.insertAtTail(head, 7);
        // Node.insertAtTail(head, 6);
        // head = Node.deleteAtHead(head);

        // head = Node.reverseListRec(head);
        // Node.print(head);
        // Node.knodefromend(head, 4);
        Node x =Node.midpoint(head);
        System.out.println(x.data);

    }
}