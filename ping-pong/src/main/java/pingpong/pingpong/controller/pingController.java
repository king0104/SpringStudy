package pingpong.pingpong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pingController {

    @GetMapping("/ping")
    public String ping_pong(){
        return "ping.html";
    }

}
