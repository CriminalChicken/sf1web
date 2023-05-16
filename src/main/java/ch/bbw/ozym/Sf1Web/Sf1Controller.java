package ch.bbw.ozym.Sf1Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sf1Controller {
    @Autowired
    private UserTable userTable;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("index", new Sf1Model());
        return "index";
    }
    @GetMapping("/erfahrung")
    public String erfahrung() {
        return "erfahrung";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @GetMapping("/geschichte")
    public String geschichte() {
        return "historie";
    }
    @GetMapping("/fahrer")
    public String driver() {
        return "driver";
    }
    @GetMapping("/kalender")
    public String calender() {
        return "calender";
    }
    @GetMapping("/info")
    public String info() {
        return "info";
    }
}

