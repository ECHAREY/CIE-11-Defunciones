package cemece.cie11.cie11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("admin")
public class adminController{




    @GetMapping
    public String index(){
        return "admin/index.html";
    }

    @GetMapping
    public String add(){
        return "admin/create.html";
    }



}