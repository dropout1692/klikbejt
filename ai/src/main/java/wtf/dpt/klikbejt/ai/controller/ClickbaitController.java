package wtf.dpt.klikbejt.ai.controller;

import model.articles.ArticleTitle;
import model.sites.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wtf.dpt.klikbejt.ai.service.ArticleService;

@RestController
@RequestMapping("/ai/analyze")
public class ClickbaitController {

    @Autowired
    ArticleService articleService;

    @PostMapping("/title")
    public boolean isClickbait(
            @RequestParam Site site,
            @RequestParam ArticleTitle title
    ) {
        return articleService.isClickbait(title);
    }
}
