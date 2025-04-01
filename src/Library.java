/*
INICIO DO CÓDIGO - LIVRARIA PUCPR
CRIADO EM: 31/03/24
FEITO POR: João Meneses
DISCIPLINA: Métodos de Pesquisa e Ordenação em Estruturas de Dados
DESCRIÇÃO: HashMap para representar grafos de livros em uma biblioteca
Turma: 01
ÚLTIMA ATUALIZAÇÃO: 31/03/24

OBS: Usando código e comentários em inglês para se adequar ao padrão internacional e treinar o idioma

FINALIZAÇÃO DO CÓDIGO EM:

*/

public class Library {
    public static void main(String[] args) {

        BookGraph library = new BookGraph();

        // Creating some books
        Book b1 = new Book("Grande Sertão: Veredas", "João Guimarães Rosa", 1956);
        Book b2 = new Book("Dom Casmurro", "Machado de Assis", 1899);
        Book b3 = new Book("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        Book b4 = new Book("O Cortiço", "Aluísio Azevedo", 1890);
        Book b5 = new Book("Vidas Secas", "Graciliano Ramos", 1938);
        Book b6 = new Book("A Hora da Estrela", "Clarice Lispector", 1977);
        Book b7 = new Book("Capitães da Areia", "Jorge Amado", 1937);
        Book b8 = new Book("Iracema", "José de Alencar", 1865);
        Book b9 = new Book("Senhora", "José de Alencar", 1875);
        Book b10 = new Book("Quincas Borba", "Machado de Assis", 1891);

        // Adding the books to the library
        Book[] books = {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10};
        for (Book book : books) {
            library.addBook(book);
        }

        // Adding two recommendations for each book
        library.addRecommendation(b1, b2);
        library.addRecommendation(b1, b3);
        library.addRecommendation(b2, b4);
        library.addRecommendation(b2, b1);
        library.addRecommendation(b3, b10);
        library.addRecommendation(b3, b5);
        library.addRecommendation(b4, b6);
        library.addRecommendation(b4, b7);
        library.addRecommendation(b5, b1);
        library.addRecommendation(b5, b6);
        library.addRecommendation(b6, b2);
        library.addRecommendation(b6, b8);
        library.addRecommendation(b7, b3);
        library.addRecommendation(b7, b9);
        library.addRecommendation(b8, b1);
        library.addRecommendation(b8, b10);
        library.addRecommendation(b9, b6);
        library.addRecommendation(b9, b4);
        library.addRecommendation(b10, b2);
        library.addRecommendation(b10, b5);

        // Printing the graph of recommendations
        library.printGraph();

        // Recommendations for a specific book
        System.out.println("\n=== 📚 Recomendações para um livro específico ===\n");
        library.recommendBooks(b3);
        library.recommendBooks(b8);
        library.recommendBooks(b10);
        library.recommendBooks(b5);
    }
}