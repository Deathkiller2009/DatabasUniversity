package ru.deathkiller2009.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.deathkiller2009.models.Book;

import java.util.List;

@Component
public class BookDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> getBooksByAuthor(String author){
        return jdbcTemplate.query("call author_select(?)", new Object[]{author}, new BeanPropertyRowMapper<>(Book.class));
    }
    public List<Book> getBookByTitle(String title){
        return jdbcTemplate.query("call title_select(?)", new Object[]{title}, new BeanPropertyRowMapper<>(Book.class));
    }
    public List<Book> getBookByPublisher(String publisher){
        return jdbcTemplate.query("call publisher_select(?)", new Object[]{publisher}, new BeanPropertyRowMapper<>(Book.class));
    }
    public List<Book> getBookByYear(String year){
        return jdbcTemplate.query("call year_select(?)", new Object[]{year}, new BeanPropertyRowMapper<>(Book.class));
    }
    public List<Book> getBookByAnnotation(String annotation){
        return jdbcTemplate.query("call annotation_select(?)", new Object[]{annotation}, new BeanPropertyRowMapper<>(Book.class));
    }
}
