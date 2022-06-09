package com.nandalaslun.W3D3Boot.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private IBookDao iBookDao;


    public List<Book> getAll(){
        return iBookDao.findAll();
    }

    public Book get(Long id){
        return iBookDao.findById(id).get();
    }

    public Book add(Book book){
        return iBookDao.save(book);
    }

    public void delete(Long id){
         iBookDao.deleteById(id);
    }

    public Book update(Book book, Long id){
        Book upbook = get(id);
        upbook = book;
        return iBookDao.save(upbook);
    }
}
