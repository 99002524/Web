package com.bookapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookRepository;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		Book newBook=bookRepository.save(book);
		return newBook;
	}

	@Override
	public boolean deleteBook(Integer bookid) throws BookNotFoundException{
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookid);
		return true;
		
	}

	@Override
	public Book getBookById(Integer bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return bookRepository.findById(bookid).orElseThrow(()-> new BookNotFoundException("Id not avilable"));
	
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public List<Book> getBookByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> bookList= bookRepository.findByAuthor(author);
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("Author not available");
	}
		return bookList;
	
	}
	@Override
	public List<Book> getBookByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> bookList=bookRepository.findByCategoryOrderByTitleAsc(category);
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("Category not available");
	}
		return bookList;
	}

	@Override
	public List<Book> findByTitleAndAuthor(String title, String author) {
		// TODO Auto-generated method stub
		return bookRepository.findByTitleAndAuthor(title, author);
	}

	@Override
	public List<Book> findBooksByTitleAndPrice(String title, Double price) {
		// TODO Auto-generated method stub
		return bookRepository.findBooksByTitleAndPrice(title, price);
	}

}
