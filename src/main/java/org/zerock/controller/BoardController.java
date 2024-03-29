package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller		// 이 자바 클래스는 컨트롤러 역할을 하는 클래스라는 것을 알려줌.
@Log4j			// lombok 이용하여 콘솔에 logger를 남기겠다. 
@RequestMapping("/board/")
@AllArgsConstructor
public class BoardController {
	
	private BoardService service;
	
	@GetMapping("list")
	public void list(Model model, Criteria cri) {
		
		log.info("@@@@@@@@@@ list good @@@@@@@@@@");
		model.addAttribute("list", service.getList(cri));
		
		int total=service.getTotalCount(cri);	
		model.addAttribute("pageMaker", new PageDTO(cri, total));
		
	}
	@GetMapping("read")
	public void read(int bno, Model model) {
		
		log.info("@@@@@@@@@@ read : " + bno + " @@@@@@@@@@");
		model.addAttribute("read", service.get(bno));
	}
	@GetMapping("register")
	public void registerGet() {
		
		log.info("@@@@@@@@@@ register good @@@@@@@@@@");
	}
	@PostMapping("register")
	public String registerPost(BoardVO board, RedirectAttributes rttr) {
		
		log.info("registerPost insert 전 : " + board + " @@@@@@@@@@");
		service.register(board);
		log.info("registerPost insert 후 : " + board + " @@@@@@@@@@");
		rttr.addAttribute("bno", board.getBno());
		return "redirect:/board/read";
	}
	@GetMapping("modify")
	public void modifyGet(int bno, Model model) {
		log.info("@@@@@@@@@@ modify good bno : " + bno +" @@@@@@@@@@");
		model.addAttribute("modify", service.get(bno));
	}
	@PostMapping("modify")
	public String modifyPost(BoardVO board, RedirectAttributes rttr, Model model) {
		model.addAttribute("result", service.modify(board));
		rttr.addAttribute("bno", board.getBno());
		return "redirect:/board/read";
	}
	@GetMapping("remove")
	public String remove(int bno) {
		log.info("@@@@@@@@@@ remove good bno : " + bno + " @@@@@@@@@@");
		service.remove(bno);
		return "redirect:/board/list";
	}


	
	
	

}