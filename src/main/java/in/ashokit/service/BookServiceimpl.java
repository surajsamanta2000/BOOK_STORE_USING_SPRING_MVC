package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@Service
public class BookServiceimpl implements BookService {
	
	@Autowired
	private BookRepository bookRepo;

	@Override
	public List<Book> getAllBooks() {
		
		return bookRepo.findAll();
	}

	@Override
	public boolean saveBook(Book book) {
		
		Book savedBook=bookRepo.save(book);
		
		return savedBook.getBookId()!=null;
		
		/*
	if(savedBook.getBookId()!=null){return true;}
	else false;
		*/
	}

	@Override
	public void deleteBook(Integer bookId) {
		bookRepo.deleteById(bookId);
		
	}

	@Override
	public Book getBookById(Integer bookId) {
		
		Optional<Book> findById = bookRepo.findById(bookId);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
		
	}

}
