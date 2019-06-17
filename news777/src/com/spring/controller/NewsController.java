package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.biz.NewsBiz;
import com.spring.entity.News;

@Controller
@RequestMapping("/news")
public class NewsController {
	@Autowired
	private NewsBiz newsBiz;
	
	@RequestMapping("/all")
	public String selectAll(Model model) {
		List<News> newsList = newsBiz.selectAll();
		model.addAttribute("newsList", newsList);
		return "news-list";
	}
	
	@RequestMapping("/page")
	public ModelAndView selectByPage
		(@RequestParam(value="pageNo",defaultValue="1")
		int pageNo) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("news-list-page");
		mv.addObject("page", newsBiz.selectAllByPage(pageNo));
		return mv;
	}
}
