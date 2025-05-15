public class main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insertAtEnd("Budi");
        List.insertAtBeginning("Andi");
        List.insertAtEnd("Citra");
        List.insertAtEnd("Dewi");

        // Print the list
        System.out.println("Linked List after insertions");
        list.println(); //Expected: Andi -> Budi -> Citra -> Dewi -> null

        // Insert after a specific node
        node nodeBudi = list.getNode("Budi");
        if (nodeBudi != null) {
            list.insertAfter(nodeBudi, "Eka");
        }

        // Print the list after insertAfter
        System.out.println("\nLinked list after inserting Eka after Budi:");
        list.printList(); //Expected: Andi -> Budi -> Eka -> Citra -> Dewi -> null

        //Delete a node
        list.deleteNode("Citra");

        // Print the list after deletion
        System.out.println("\nLinked list after deleting Citra:");
        list.printList(); //Expected: Andi -> Budi -> Eka -> Dewi -> null

        // Delete a non-existent node
        list.deleteNode("Fajar");

        // Print the list after trying to delete non-existent node
        System.out.println("\nLinked list after trying to delete Fajar:");
        list.printList(); //Expected: Andi -> Budi -> Eka -> Dewi -> null
    }
}