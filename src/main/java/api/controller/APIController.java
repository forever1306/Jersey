package api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.entity.CoreContent;
import api.service.CoreContentService;

@RestController
public class APIController {
	@Autowired
	private CoreContentService contentService;
	
	@RequestMapping("/api")
	public List<CoreContent> getStudent(){
		
		return contentService.list();
	}
}
