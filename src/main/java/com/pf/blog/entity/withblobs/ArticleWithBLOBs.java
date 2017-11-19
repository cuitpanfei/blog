package com.pf.blog.entity.withblobs;

import com.pf.blog.entity.Article;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ArticleWithBLOBs extends Article {
    private String articleTitle;

    private String articleContent;

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}
