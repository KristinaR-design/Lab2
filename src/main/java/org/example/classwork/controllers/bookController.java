package org.example.classwork.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class bookController {

    public static class Book {
        private String title;
        private String author;
        private String status;

        // Getters and Setters
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        book.setStatus("received");
        return book;
    }


}