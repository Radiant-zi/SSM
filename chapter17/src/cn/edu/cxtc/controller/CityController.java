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
	private CityService cityService;//ע��service��Ķ��󣬱��ں���ʹ��
	@RequestMapping("/all")
	public String all(Model m) {//servlet->request.addAttribute("cities",cities)  Model��springmvc��ģ�� 
		List<City> lists = cityService.findAll();//����Service������findAll()������ѯ���м�¼
		m.addAttribute("cities",lists);
		return "all";//      /WEB-INF/JSP/all.jsp
	}
	// ��� ��ת�����ҳ��
	@RequestMapping("/addCity")
	public ModelAndView addCity() {
		ModelAndView mav = new ModelAndView("add");
		return mav;//������ͼ�У���ת����ӽ���
	}
	// �������
	@RequestMapping("/add")
	public String add(City city) {
		cityService.add(city);
		return "redirect:all";//�ض���all����
	}
	// �޸�
	@RequestMapping("/updateCity")
	public ModelAndView updateCity(Integer id) {
		City city = cityService.findOne(id);
		ModelAndView mav = new ModelAndView("update");
		mav.addObject("city", city);
		return mav;
	}
	// �޸�����
	@RequestMapping("/update")
	public String update(City city) {
		cityService.update(city);
		return "redirect:all";
	}
	// ɾ��
	@RequestMapping("/delete")
	public String delete(Integer id) {
		cityService.delete(id);
		return "redirect:all";
	}
}
