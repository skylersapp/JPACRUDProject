package com.skilldistillery.jpacrudmacbookboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.jpacrudmacbook.entities.Macbook;
import com.skilldistillery.jpacrudmacbookboot.data.MacbookDAO;

@Controller
public class MacbookController {

	@Autowired
	private MacbookDAO dao;

	@RequestMapping({ "/", "index.do" })
	public String index(Model model) {
		List<Macbook> macbook = new ArrayList<>();
		macbook = dao.findAll();
		model.addAttribute("macbook", macbook);

		return "index";
	}

	@RequestMapping(path = "getMacbookById.do", method = RequestMethod.GET)
	public String showMacbook(@RequestParam Integer id, Model model) {
		Macbook macbook = dao.findMacbookById(id);
		model.addAttribute("macbook", macbook);
		return "show";
	}

	@RequestMapping(path = "create.do", method = RequestMethod.POST)
	public String postMacbook(Model model, Macbook macbook) {
		macbook = dao.create(macbook);
		model.addAttribute("macbook", macbook);
		return "create";
	}

	@RequestMapping(path = "create.do", method = RequestMethod.GET)
	public String createMacbook() {
		return "create";
	}

	@RequestMapping(path = "update.do")
	public String updateMacbook(Model model, Macbook macbook, @RequestParam("macbookId") Integer id) {
		macbook = dao.findMacbookById(id);
		model.addAttribute("macbook", macbook);
		return "update";
	}

	@RequestMapping(path = "delete.do", method = RequestMethod.GET)
	public String deleteMacbook(@RequestParam("macbookId") int id) {
		dao.delete(id);
		return "redirect:index.do";
	}

	@RequestMapping(path = "edit.do")
	public String editMacbook(Model model, Macbook macbook, @RequestParam("macbookId") Integer id) {

		dao.update(id, macbook);
		if (macbook == null) {
			return "redirect:index.do";

		} else {
			return "redirect:index.do";
		}
	}

}
