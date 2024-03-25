package com.study.projectboard.domain;

public class ArticleComment {
    private Long id;
    private Article articleId;  // 게시글 번호(ID)
    private String content; // 내용
    private String createBy;    // 작성자
    private String modifiedBy;  // 수정자
    private String createAt;    // 작성일
    private String modifiedAt;  // 수정일
}
