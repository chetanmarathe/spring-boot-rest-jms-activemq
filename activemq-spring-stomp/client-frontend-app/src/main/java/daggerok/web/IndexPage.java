package daggerok.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPage {

  @GetMapping("/stomp/")
  public String stomp() {
    return "stomp";
  }

  @GetMapping("/")
  public String index() {
    return "/index.html";
  }

  @GetMapping({ "", "/404" })
  public String redirect() {
    return "redirect:/";
  }
}
