package com.stackroute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.Map;

@Controller
public class UserController {
    @RequestMapping("/")
    public String display(Model model) {
        User user=new User();
        user.setName("tejaswini");
        String name=user.getName();
       model.addAttribute("msg", name);
        return "index";
    }





    }



