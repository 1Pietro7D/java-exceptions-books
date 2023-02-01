package gen31;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.print("Inserire il numero di libri: ");
				int n = Integer.parseInt(sc.nextLine());
				Book[] books = new Book[n];

				for (int i = 0; i < n; i++) {
					try {
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
						System.out.println("Errore: " + e.getMessage());
						// e.printStackTrace();
						i--;
					}
				}

				System.out.println("your's list books:");
				for (Object book : books) {
					System.out.println(book.toString());
				}

			} catch (NumberFormatException e) {
				System.out.println("Errore: Il numero di libri deve essere un numero intero");
			} catch (NegativeArraySizeException e) {
				System.out.println("Errore: Il numero di libri deve essere un numero intero POSITIVO");
			} finally {
				sc.close();
			}
			;
			;
		} while (true);

	}
}


/*Possibile soluzione per visualizzare tutti gli array
List<String> errorList = new ArrayList<>();
for (int i = 0; i < n; i++) {
  try {
    ...
  } catch (Exception e) {
    errorList.add("Errore nell'input del libro " + (i + 1) + ": " + e.getMessage());
    i--;
  }
}

if (!errorList.isEmpty()) {
  System.out.println("Errori:");
  for (String error : errorList) {
    System.out.println(error);
  }
}*/
