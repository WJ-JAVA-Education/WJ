package com.wooj.hongpak.repository;

import com.wooj.hongpak.entity.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
    // Entity의 ID를 받아온다.
}
