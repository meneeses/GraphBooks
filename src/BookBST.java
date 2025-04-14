// Class to represent a binary search tree for books
public class BookBST {
    private BookNode root;

    // Insert method
    public void insert(Book book) {
        root = insertRec(root, book);
    }

    // Recursive insert method
    private BookNode insertRec(BookNode node, Book book) {
        if (node == null) {
            return new BookNode(book);
        }
        if (book.getTitle().compareToIgnoreCase(node.book.getTitle()) < 0) {
            node.left = insertRec(node.left, book);
        } else {
            node.right = insertRec(node.right, book);
        }
        return node;
    }

    // In-order traversal method
    public void inOrderTraversal() {
        System.out.println("\n📚 Livros em ordem alfabética:");
        inOrderRec(root);
    }

    // Recursive in-order traversal method
    private void inOrderRec(BookNode node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.println("➤ " + node.book);
            inOrderRec(node.right);
        }
    }

    // Search method
    public Book search(String title) {
        return searchRec(root, title);
    }

    // Recursive search method
    private Book searchRec(BookNode node, String title) {
        if (node == null || node.book.getTitle().equalsIgnoreCase(title)) {
            return node != null ? node.book : null;
        }
        if (title.compareToIgnoreCase(node.book.getTitle()) < 0) {
            return searchRec(node.left, title);
        }
        return searchRec(node.right, title);
    }
}