package model.articles;

import jdk.vm.ci.code.site.Site;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ArticlesInputDTO {

    private Site site;
    private List<ArticleTitle> articleTitles;
}
