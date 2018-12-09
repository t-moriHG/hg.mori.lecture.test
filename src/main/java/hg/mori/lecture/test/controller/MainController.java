package hg.mori.lecture.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hg.mori.lecture.test.bean.TopFormBean;
import hg.mori.lecture.test.model.MainModel;


/**
 * Mainコントローラークラス.
 */
@Controller
public class MainController {
	
	/** Mainモデル */
	@Autowired
	private MainModel mainModel;
	
	/**
	 * トップ画面表示コントローラー
	 * @return top.html
	 */
	@RequestMapping(path = "/top", method = RequestMethod.GET)
	public String getLogin() {
		return "top";
	}
	
	/**
	 * POSTテスト画面表示コントローラー
	 * @return top.html
	 */
	@RequestMapping(path = "/rest", method = RequestMethod.POST)
	public String postRest(Model model, @ModelAttribute TopFormBean form) {
		String postText = form.getPostText();
		String count = mainModel.getCount(postText);
		
		model.addAttribute("postText", postText);
		model.addAttribute("count", count);
		return "post_test";
	}
	
	/**
	 * GETテスト画面表示コントローラー
	 * @return top.html
	 */
	@RequestMapping(path = "/rest", method = RequestMethod.GET)
	public String getRest(Model model, @RequestParam String getText) {
		String count = mainModel.getCount(getText);
		
		model.addAttribute("getText", getText);
		model.addAttribute("count", count);
		return "get_test";
	}
	
	

}
