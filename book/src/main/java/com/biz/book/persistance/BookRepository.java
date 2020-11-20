package com.biz.book.persistance;

import com.biz.book.domain.BookVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookVO,Long> {



}