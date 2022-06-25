package wtf.dpt.klikbejt.ai.service;

import model.articles.ArticleTitle;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    public boolean isClickbait(ArticleTitle title) {

        //todo: analyze based on model
        //todo: add to learning set

        return false;
    }
}
