package com.service;

import com.mapper.BookMapper;
import com.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService
{
    private BookMapper bookMapper;

    @Override
    public List<Books> queryAll()
    {
        return bookMapper.queryAll();
    }

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
}
