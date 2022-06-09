package com.nandalaslun.W3D3Boot.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookDao extends JpaRepository<Book, Long> {
//    public abstract List<Book.Book> getAll();
//    public abstract Book.Book get(int id);
//    public abstract Book.Book add(Book.Book book);
//    public abstract void delete(int id);
//    public abstract void update(Book.Book book);
}
