package com.xasnow.springbootthymeleaf.controller;

import com.google.common.collect.Lists;
import com.xasnow.springbootthymeleaf.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    @GetMapping("/books")
    public ModelAndView books(){
//        List<Book> books = new ArrayList<>();
        //体验guava创建集合，推荐使用
        ArrayList<Book> books = Lists.newArrayList();
        Book b1 = new Book();
        b1.setId(1);
        b1.setAuthor("小二");
        b1.setName("上酒");
        Book b2 = new Book();
        b2.setId(2);
        b2.setAuthor("小哥");
        b2.setName("盗墓笔记");
        books.add(b1);
        books.add(b2);
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("books");
        return mv;
    }
}
