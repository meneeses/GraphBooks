/*
INICIO DO CÓDIGO - LIVRARIA PUCPR
CRIADO EM: 31/03/25
FEITO POR: João Meneses
DISCIPLINA: Métodos de Pesquisa e Ordenação em Estruturas de Dados
DESCRIÇÃO:
    - Implementação de uma biblioteca de livros com recomendações.
    - Utiliza uma estrutura de grafo para armazenar os livros e suas recomendações.
    - Permite adicionar livros, adicionar recomendações e imprimir o grafo de recomendações.
    - Permite recomendar livros com base em um livro específico.

Turma: 01
ÚLTIMA ATUALIZAÇÃO: 14/04/25

OBS: Usando código e comentários em inglês para se adequar ao padrão internacional e treinar o idioma

FINALIZAÇÃO DO CÓDIGO EM:

*/

public class Library {
    public static void main(String[] args) {
        BookBST tree = new BookBST();

        // Adding books
        tree.insert(new Book("Grande Sertão: Veredas", "João Guimarães Rosa", 1956));
        tree.insert(new Book("Dom Casmurro", "Machado de Assis", 1899));
        tree.insert(new Book("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881));
        tree.insert(new Book("O Cortiço", "Aluísio Azevedo", 1890));
        tree.insert(new Book("Vidas Secas", "Graciliano Ramos", 1938));
        tree.insert(new Book("A Hora da Estrela", "Clarice Lispector", 1977));
        tree.insert(new Book("Capitães da Areia", "Jorge Amado", 1937));
        tree.insert(new Book("Iracema", "José de Alencar", 1865));
        tree.insert(new Book("Senhora", "José de Alencar", 1875));
        tree.insert(new Book("Quincas Borba", "Machado de Assis", 1891));

        // Showing the books in Order
        tree.inOrderTraversal();

        // Searching for a book
        System.out.println("\n\uD83D\uDD0DBuscando livro: 'Dom Casmurro':");
        Book found = tree.search("Dom Casmurro");

        // Printing the result of the search
        if (found != null){
            System.out.println("Livro encontrado: " + found.getTitle() + " - " + found.getAuthor() + " - " + found.getPublicationYear());
        } else {
            System.out.println("Livro não encontrado.");
        }


    }
}