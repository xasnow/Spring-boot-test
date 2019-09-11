package com.xasnow.baseconfig02.controller;

import com.xasnow.baseconfig02.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private Book book;

    public BookController(Book book) {
        this.book = book;
    }

    @GetMapping("/book")
    public String getBook(){
        System.out.println(book.toString());
        return book.toString();
    }
}
