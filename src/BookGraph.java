import java.util.*;

//
public class BookGraph {
    private final Map<Book, Set<Book>> graph;

    public BookGraph() {
        this.graph = new HashMap<>();
    }

    public void addBook(Book book) {
        if (!graph.containsKey(book)) {
            graph.put(book, new HashSet<>());
        }
    }

    public void addRecommendation(Book from, Book to) {
        addBook(from);
        addBook(to);
        graph.get(from).add(to);
    }

    // Print the graph of books in a good format
    public void printGraph() {
        System.out.println("=== 📚 Biblioteca de Recomendações PUCPR === \n");

        for (Book book : graph.keySet()) {
            System.out.println("📚 Livro: " + book.getTitle());
            System.out.println("✍️ Autor: " + book.getAuthor());
            System.out.println("📅 Ano: " + book.getPublicationYear());

            Set<Book> recommendations = graph.get(book);
            if (recommendations != null && !recommendations.isEmpty()) {
                System.out.println("\n 📚 Recomendações: ");
                for (Book rec : recommendations) {
                    System.out.println("      ➤ " + rec.getTitle() + " — " + rec.getAuthor() + " (" + rec.getPublicationYear() + ")");
                }
            } else {
                System.out.println("\n Sem recomendações");
            }

            System.out.println("------------------------------------------------------------");
        }
    }


    public void recommendBooks(Book baseBook) {
        System.out.println("📖 Recomendações baseadas em: " + baseBook.getTitle() + "\n");

        Set<Book> recommendations = graph.get(baseBook);
        if (recommendations == null || recommendations.isEmpty()) {
            System.out.println("Nenhuma recomendação encontrada para este livro.");
            return;
        }

        for (Book rec : recommendations) {
            System.out.println("➤ " + rec.getTitle() + " — " + rec.getAuthor() + " (" + rec.getPublicationYear() + ")");
        }

        System.out.println("------------------------------------------------------------");
    }

}

