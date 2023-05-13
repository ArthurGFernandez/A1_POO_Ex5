package program;

import java.util.ArrayList;
import java.util.Scanner;
import entities.Editora;
import entities.Livros;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Editora> listEditora = new ArrayList<>();
        ArrayList<Livros> listLivros = new ArrayList<>();

        System.out.print("Quantos Editores deseja adicionar? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i ++){
            System.out.print("\nDigite o Id da Editora: ");
            int idEditora = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o nome: ");
            String nomeEditora = sc.nextLine();
            System.out.print("Digite o email: ");
            String emailEditora = sc.nextLine();

            listEditora.add(new Editora(idEditora, nomeEditora, emailEditora));
        }

        int i = 0;
        for (Editora editora1: listEditora) {
            System.out.println("\nEsta é a " + (i+1) + "º Editora.");
            System.out.println("Id: " + editora1.getId());
            System.out.println("Nome: " + editora1.getName());
            System.out.println("Email: " + editora1.getEmail());
            i++;
        }


        System.out.print("Quantos livros deseja adicionar? ");
        n = sc.nextInt();
        sc.nextLine();

        for(i = 0; i < n; i ++){
            System.out.print("\nDigite o titulo do livro: ");
            String tituloLivro = sc.nextLine();
            System.out.print("Digite o Autor: ");
            String nomeAutor = sc.nextLine();
            System.out.print("Digite o ano: ");
            int anoLivro = sc.nextInt();
            System.out.println("Digite o ID de uma Editora Existente.");
            int idEditoraLivro = sc.nextInt();
            sc.nextLine();

            boolean editoraEncotrada = false;
            for (Editora editora1: listEditora) {
                if (editora1.getId() == idEditoraLivro) {
                    System.out.println("Editora encontrada! ");
                    editoraEncotrada = true;
                    break;
                }
            }
            if (!editoraEncotrada) {
                System.out.println("Editora não encontrada.");
            }else listLivros.add(new Livros(tituloLivro, nomeAutor, anoLivro, idEditoraLivro));
        }

        i = 0;
        for(Livros livros1 : listLivros){
            System.out.println("\nEsta é o " + (i+1) + "º livro da lista.");
            System.out.println("Titulo: " + livros1.getTitulo());
            System.out.println("Autor: " + livros1.getAutor());
            System.out.println("Ano do livro: " + livros1.getAno());
            i++;

        }
    }
}