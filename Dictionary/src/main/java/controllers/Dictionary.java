package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/dic")
public class Dictionary {
    @GetMapping
    public String dicForm(){
        return "dicForm";
    }

    @PostMapping
    public ModelAndView resultTranslate(HttpServletRequest request){
        Map<String,String> dic = new HashMap<>();
        dic.put("Computer", "May tinh");
        dic.put("Television","Ti vi");
        dic.put("MobilePhone","Dien thoai di dong");
        dic.put("Laptop" , "may tinh lap top");

        String word = request.getParameter("word");
        String result = dic.get(word);
        String message = "Not Found";
        ModelAndView modelAndView = new ModelAndView("result");
        if(result != null){
            modelAndView.addObject("result",result);
        }else {
            modelAndView.addObject("message",message);
        }
        return modelAndView;
    }
}
