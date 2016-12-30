package cz.cvut.fel.ksy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.context.WebContext;

/**
 * Created by Martin on 25.12.2016.
 */
@Controller
public class GreetingController {

    @RequestMapping("/digitSpan")
    public String playDigitSpan(Model model) {
        return "digitSpan";
    }

    @RequestMapping("/doubleTrouble")
    public String playDoubleTrouble(Model model) {
        return "doubleTrouble";
    }
}
