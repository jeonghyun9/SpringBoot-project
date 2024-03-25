package com.study.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title;   // 제목
    private String content; // 본문
    private String hashtag; // 해시태그
    private LocalDateTime createAt; // 작성일
    private String createBy;    // 작성자
    private LocalDateTime modifiedAt;   // 수정일
    private String modifiedBy;  // 수정자
}
