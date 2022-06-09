package com.nandalaslun.W3D3Boot.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRestController {
    @Autowired
    private BookService bookService;

    @GetMapping(value = "/books", produces = "application/json")
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @GetMapping(value = "/hello", produces = "application/json")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping(value = "/books/{id}", produces = "application/json")
    public Book get(@PathVariable Long id){
        return this.bookService.get(id);
    }

    @PostMapping(value = "/books", consumes = "application/json")
    public Book add(@RequestBody Book book){
        return bookService.add(book);
    }

    @PutMapping(value = "/books/{id}", consumes = "application/json")
    public Book update(@PathVariable Long id, @RequestBody Book book){
        return bookService.update(book, id);
    }

    @DeleteMapping(value = "/books/{id}")
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }

}
