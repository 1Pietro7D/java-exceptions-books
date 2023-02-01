package gen31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		List<String> errorList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		do {
			
			try {
				System.out.print("Inserire il numero di libri: ");
				int n = Integer.parseInt(sc.nextLine());
				Book[] books = new Book[n];

				for (int i = 0; i < n; i++) {
					try {
						if (errorList.size() > 0) {
			                System.out.print("Errori:");
			                System.out.println(errorList.size()); // da solo un errore anche se ce ne sono più 
			                for (String error : errorList) {
			                    System.out.println(error);
			                }
			                errorList.clear();
			            }
						System.out.println("Inserire i dati del libro " + (i + 1));
						System.out.print("Titolo: ");
						String title = sc.nextLine();

						System.out.print("Numero di pagine: ");
						String numPages = sc.nextLine(); // Errore: For input string: "qwe"???

						System.out.print("Autore: ");
						String author = sc.nextLine();

						System.out.print("Editore: ");
						String publisher = sc.nextLine();

						books[i] = new Book(title, numPages, author, publisher);
						
						
					} catch (Exception e) {
						errorList.add("Errore nell'inserimento dei dati del libro " + (i + 1) + ": " + e.getMessage());
						i--;
					}
					
				}
				if(books.length>=0)
					sc.close();
				System.out.println("your's list books:");
				for (Object book : books) {
					System.out.println(book.toString());
				}

			} catch (NumberFormatException e) {
				System.out.println("Errore: Il numero di libri deve essere un numero intero");
			} catch (NegativeArraySizeException e) {
				System.out.println("Errore: Il numero di libri deve essere un numero intero POSITIVO");
			}
			
			
			
		} while (true);
		
	}
}

