package wtf.dpt.klikbejt.ai.controller;

import model.articles.ArticlesInputDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ai/learn")
public class LearningController {

    @PostMapping("/unsolved")
    public void addTitlesWithoutAnswers(@RequestBody ArticlesInputDTO titles) {
        //todo: impl
    }

    @PostMapping("/solved")
    public void addTitlesWithAnswers(@RequestBody ArticlesInputDTO titles) {
        //todo: impl
    }
}
