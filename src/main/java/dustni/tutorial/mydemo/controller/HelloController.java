package dustni.tutorial.mydemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/")
    public String hello() {
        return "Hello Docker,change,from proxy,welcome";
    }
}
