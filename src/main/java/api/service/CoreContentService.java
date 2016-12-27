package api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.entity.CoreContent;
import api.repository.CoreContentRepository;

@Service
public class CoreContentService {
	@Autowired
	private CoreContentRepository contentRepository;
	
	@Transactional
	public List<CoreContent> list(){
		return contentRepository.list();
	}
}
