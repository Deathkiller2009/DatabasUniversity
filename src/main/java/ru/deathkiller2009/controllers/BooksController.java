package ru.deathkiller2009.controllers;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.deathkiller2009.dao.BookDao;
import ru.deathkiller2009.models.Book;

@Controller
@RequestMapping("/books")
public class BooksController {
    private final BookDao bookDao;

    public BooksController(JdbcTemplate jdbcTemplate, BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @GetMapping()
    public String getSearchPage() {
        return "/book/searchPage";
    }

    @GetMapping("/author")
    public String getSearchByAuthor(@RequestParam("author") String author, Model model) {
        model.addAttribute("books", bookDao.getBooksByAuthor(author));
        return "/book/searchResult";
    }

    @GetMapping("/title")
    public String getSearchByTitle(@RequestParam("title") String title, Model model) {
        model.addAttribute("books", bookDao.getBookByTitle(title));
        return "/book/searchResult";
    }

    @GetMapping("/publisher")
    public String getSearchByPublisher(@RequestParam("publisher") String publisher, Model model) {
        model.addAttribute("books", bookDao.getBookByPublisher(publisher));
        return "/book/searchResult";
    }

    @GetMapping("/year")
    public String getSearchByYear(@RequestParam("year") String year, Model model) {
        model.addAttribute("books", bookDao.getBookByYear(year));
        return "/book/searchResult";
    }

    @GetMapping("/annotation")
    public String getSearchByAnnotation(@RequestParam("annotation") String annotation, Model model) {
        model.addAttribute("books", bookDao.getBookByAnnotation(annotation));
        return "/book/searchResult";
    }

}
