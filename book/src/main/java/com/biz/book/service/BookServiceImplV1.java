package com.biz.book.service;

import com.biz.book.domain.BookVO;
import com.biz.book.persistance.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("bookServiceV1")
public class BookServiceImplV1 implements BookService {

    private final BookRepository bookDao;

    public BookServiceImplV1(BookRepository bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<BookVO> selectAll() {
        List<BookVO> bookList = bookDao.findAll();
        return bookList;
    }

    // optional
    // 데이터가 없음을 null이아닌 어떤 명확한 근거를 바탕으로 ㅇ라고싶다라는 취지에서 새로 생성한 wrapper 클라스
    // VO클래스를 감싸는 wrapper 클래스

    // findbyid(Long id)일반적으로 DB핸들링에서 findbyid수행 후 id에 해당하는 데이터가 없을 경우
    // 리턴값이 null이었다.
    // if(vo==null){
    //      log.debug("데이터가 없음")
    // }
    // optional 은 어떤 객체의 저장된 값이 null 인가를 비교하는 것을 사용하지 않기 위해 새롭게 등장한 클래스이다.

    @Override
    public BookVO findById(Long id) {
       Optional<BookVO>bookVO= bookDao.findById(id);

       // 만약 findbyid() 수행하여 데이터가 없으면 새로운 vo를 만들고 id값을 -1로 세팅하여 리턴하라
        // null값을 비교하는 것보다 연산비용이 많이 든다.
        // 아직은 논란의 여지가 많다.
        return bookVO.orElse(BookVO.builder().id(-1L).build());
    }

    @Override
    public int insert(BookVO bookVO) {
        bookDao.save(bookVO);
        return 0;
    }

    @Override
    public int update(BookVO bookVO) {
        bookDao.save(bookVO);
        return 0;
    }

    @Override
    public int delete(Long id) {
        bookDao.deleteById(id);
        return 0;
    }
}