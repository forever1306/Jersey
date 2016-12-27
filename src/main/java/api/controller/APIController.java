package api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import api.entity.CoreContent;
import api.service.CoreContentService;

@Controller
public class APIController {
	@Autowired
	private CoreContentService contentService;
	
	@RequestMapping("/api")
	@ResponseBody
	public List<CoreContent> getStudent(){
		
		return contentService.list();
	}
}
