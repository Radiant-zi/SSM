package cn.edu.cxtc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.cxtc.po.City;
import cn.edu.cxtc.service.CityService;

@Controller
public class CityController {
	@Autowired
	private CityService cityService;//注入service层的对象，便于后面使用
	@RequestMapping("/all")
	public String all(Model m) {//servlet->request.addAttribute("cities",cities)  Model是springmvc的模型 
		List<City> lists = cityService.findAll();//调用Service层对象的findAll()方法查询所有记录
		m.addAttribute("cities",lists);
		return "all";//      /WEB-INF/JSP/all.jsp
	}
	// 添加 跳转到添加页面
	@RequestMapping("/addCity")
	public ModelAndView addCity() {
		ModelAndView mav = new ModelAndView("add");
		return mav;//存入视图中，跳转到添加界面
	}
	// 添加数据
	@RequestMapping("/add")
	public String add(City city) {
		cityService.add(city);
		return "redirect:all";//重定向到all界面
	}
	// 修改
	@RequestMapping("/updateCity")
	public ModelAndView updateCity(Integer id) {
		City city = cityService.findOne(id);
		ModelAndView mav = new ModelAndView("update");
		mav.addObject("city", city);
		return mav;
	}
	// 修改数据
	@RequestMapping("/update")
	public String update(City city) {
		cityService.update(city);
		return "redirect:all";
	}
	// 删除
	@RequestMapping("/delete")
	public String delete(Integer id) {
		cityService.delete(id);
		return "redirect:all";
	}
}
