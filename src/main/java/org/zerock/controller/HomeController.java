package org.zerock.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;

/**
 * Handles requests for the application home page.
 */
@Controller
@AllArgsConstructor
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private BoardService board;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		logger.info("homecontroller"+board.recentBoardNotice());
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("listNotice", board.recentBoardNotice() );
		model.addAttribute("listQna", board.recentBoardQna() );
		
		return "home";
	}
	
	@GetMapping("recommend")
	public void recommend() {
	
	}
	
	@GetMapping("myCard")
	public void myCard() {
		
	}
	
	@GetMapping("login")
	public void login() {
		
	}
	
	@GetMapping("join")
	public void join() {
		
	}
	
	@GetMapping("findId")
	public void findId() {
		
	}
	
	@GetMapping("findPw")
	public void findPw() {
		
	}
	
	
}
