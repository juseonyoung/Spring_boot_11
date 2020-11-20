package com.biz.book.domain;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

@Entity
@Table(name="tbl_book")
public class BookVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //유일한 값으로 자동 생성해라
    @Column(name="id",columnDefinition = "BIGINT") //int 11자리보다 더 큰 데이터 수용 가능
    // 이걸 넣어서 long id가 int형으로 설정될 수 있는 사고를 방지
    private Long id; //너는 이 테이블에서 pk이다 라고 알려주는 @Id 붙이기 세줄 세트

    @Column(name="str_name")
    private String strName;

    @Column(columnDefinition = "VARCHAR(125)")
    private String title;

    @Column(length = 30)
    private String author;

    @Column(length = 125)
    private String comp;

    @Column(nullable = true)
    private int price;

}

