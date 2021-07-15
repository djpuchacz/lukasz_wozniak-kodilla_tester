package com.kodilla.rest.controller;
//wybrać optimize import
import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)                   // [1]
public class BookControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;                         // [2]

    @MockBean
    private BookService bookService;                 // [3]

    @Test
    public void shouldFetchBooks() throws Exception { //test MVC zawsze muszą deklarować że mogą rzucać wyjątek
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        //when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/books")                      // [1]
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200))                     // [2]
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }
@Test
    public void shouldAddBook() throws Exception {
        //given

        BookDto result = new BookDto("title 1", "author 1");
        Gson myname = new Gson();
        String gsoncontent = myname.toJson(result);
        //when & then
        mockMvc.perform(MockMvcRequestBuilders.post("/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content(gsoncontent))
                .andExpect(MockMvcResultMatchers.status().is(200));
        Mockito.verify(bookService, Mockito.times(1)).addBook(result);
    }
}

