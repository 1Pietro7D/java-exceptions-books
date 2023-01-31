package gen31;

class Book {
	private String title;
	private int numPages;
	private String author;
	private String publisher;

	public Book(String title, int numPages, String author, String publisher) throws Exception {
		setTitle(title);
		setNumPages(numPages);
		setAuthor(author);
		setPublisher(publisher);
	}

	public void setTitle(String title) throws Exception {
		if (title.isEmpty()) {
			throw new Exception("Il titolo non può essere vuoto");
		}
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setNumPages(int numPages) throws Exception {
		if (numPages <= 0) {
			throw new Exception("Il numero di pagine deve essere maggiore di 0");
		}
		this.numPages = numPages;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setAuthor(String author) throws Exception {
		if (author.isEmpty()) {
			throw new Exception("L'autore non può essere vuoto");
		}
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setPublisher(String publisher) throws Exception {
		if (publisher.isEmpty()) {
			throw new Exception("L'editore non può essere vuoto");
		}
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

}