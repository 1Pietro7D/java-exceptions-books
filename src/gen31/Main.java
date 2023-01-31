package gen31;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserire il numero di libri: ");
		int n = Integer.parseInt(sc.nextLine());
		Book[] books = new Book[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Inserire i dati del libro " + (i + 1));
			System.out.print("Titolo: ");
			String title = sc.nextLine();

			System.out.print("Numero di pagine: ");
			int numPages = sc.nextInt();
			sc.nextLine();

			System.out.print("Autore: ");
			String author = sc.nextLine();

			System.out.print("Editore: ");
			String publisher = sc.nextLine();

			try {
				books[i] = new Book(title, numPages, author, publisher);
			} catch (Exception e) {
				System.out.println("Errore: " + e.getMessage());
				i--;
			}
		}

		sc.close();
		System.out.println("libro 1 title -> " + books[0].getTitle());
	}
}
