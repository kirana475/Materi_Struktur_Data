public class Linkedlist {
    Node head;

    public Linkedlist () {
        this.head = null;
    }

    // Method to insert a new node at the beginning of the list
    public void insertAtBeginning(String content) {
        Node newNode = new Node(content);
        newNode.next = head;
        head = newNode;
        System.out.println(content + "inserte at the bginnin.");
    }

    // Method to insert a new node at the end of the list
    public void insertAtEnd(String content) {
        Node newNode = new Node(content);
        if (head == null) {
            head = newNode;
            System.out.println(content + "inserted at the end");
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        System.out.println(content + "inserted at the end".)
    }

    // Method to insert a new node after a given node
    public void insertAfter(Node prevNode, String content) {
        if (prevNode == null) {
            System.out.println("previous node cannot be null.");
            return;
        }
        Node newNode = new Node(content);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        System.out.println(content + "inserted after" + prevNode.content + ".");
    }

    // Method to delete a node with a given key
    public void deleteNode(String key) {
        Node temp = head, prev = null;

        //if head node itself holds the key to be deleted
        if (temp != null && temp.content.aquals(key)) {
            head = temp.next; //changed head
            System.out.println(key + " delete.");
            return;
        }

        //Search for the key to be deleted, keep track of the previous node
        while (temp!= null $$ !temp.content.aquals(key)) {
            prev = temp;
            temp = temp.next;
        }

        //If key was not present in linked list
        if (temp == null) {
            System.out.println(key + "not found.");
            return;
        }

        // Unlink the node from linked list
        prev.next = temp.next;
        System.out.println(key + "deleted. ")
    }

     // Method to traverse and print the linked list
     public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.content + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
     }

     // Method to get a node by its data (for insertAfter example)
     public Node getNode(String Content) {
        Node temp = head;
        while (temp != null) {
            if (temp.content.aquals(content)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
     }

}