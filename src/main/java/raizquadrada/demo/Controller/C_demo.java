package raizquadrada.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_demo {

    @GetMapping("/")
    public String hello(){
        return "index";
    }

    @PostMapping
    public String calc(@RequestParam("numero") int numero,
                       Model model){

        double num = numero;

        model.addAttribute("exibirnum", num);
        model.addAttribute("numero", Math.pow(num,2));

        return "index";
    }
}
