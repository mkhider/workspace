package co.simplon.videomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideoController {
	@RequestMapping("/category")
    public String index() {
        return "index.html";
    }

}