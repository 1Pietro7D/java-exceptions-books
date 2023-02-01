package gen31;

class Book {
	private String title;
	private int numPages;
	private String author;
	private String publisher;

	public Book(String title, String numPages, String author, String publisher) throws Exception {
		if (title.isEmpty()) {
			throw new Exception("Il titolo non può essere vuoto");
		}
		try {
            int numPagesInt = Integer.parseInt(numPages);
            if (numPagesInt <= 0) {
                throw new Exception("Il numero di pagine deve essere maggiore di 0");
            }
            this.numPages = numPagesInt;
        } catch (NumberFormatException e) {
            throw new Exception("Input non valido, inserire un numero INTERO");
        }
		if (author.isEmpty()) {
			throw new Exception("L'autore non può essere vuoto");
		}
		if (publisher.isEmpty()) {
			throw new Exception("L'editore non può essere vuoto");
		}
		this.title = title;
		this.numPages = Integer.parseInt(numPages);
		this.author = author;
		this.publisher = publisher;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setPublisher(String publisher) {

		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	@Override
	public String toString() {
		return "Informazioni sul prodotto: " + "Title = " + this.getTitle() + ", Author = " + this.getAuthor()
				+ ", n. pages = " + this.getNumPages() + ", Publisher = " + this.getPublisher();
	}

}