package model.articles;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleTitle {

    private String title;
    private boolean clickbait;
    private boolean confirmed;
    private long articleDate;
}
