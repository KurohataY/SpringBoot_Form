package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {
	
    @RequestMapping("/")
//  初期画面
    public String input1() {
        return "index";
    }

    @Autowired 
    private UserRepository userRepository;
    
	@RequestMapping(value = "formaction", method = RequestMethod.GET)
	public String output1(
//		フォームデータの取得
		@RequestParam(name = "name") String name,
		@RequestParam(name = "mail") String mail,
		@RequestParam(name = "message") String message,
		Model model) {
		
//		完了画面表示ように格納
		model.addAttribute("name", name);
		model.addAttribute("mail", mail);
		model.addAttribute("message", message);
		
//		MySQLにデータを保存
		User n = new User();
	    n.setName(name);
	    n.setMail(mail);
	    n.setMessage(message);
	    userRepository.save(n);

//	    応募完了画面
		return "endview";
	}
}
