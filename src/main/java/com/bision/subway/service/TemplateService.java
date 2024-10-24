package com.bision.subway.service;

import com.bision.subway.model.TemplateVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TemplateService {
    List<TemplateVO> selectTempList();
    TemplateVO selectTempById(Integer templateId);
    int insertTemp(TemplateVO templateVO);
    int updateTemp(TemplateVO templateVO);
    int deleteTempById(Integer templateId);


}
