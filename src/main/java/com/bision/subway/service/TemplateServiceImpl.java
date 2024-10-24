package com.bision.subway.service;

import com.bision.subway.mapper.TemplateMapper;
import com.bision.subway.model.TemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TemplateServiceImpl implements TemplateService {

    private final SqlSession sqlSession;

    public TemplateServiceImpl(SqlSession ss) {
        this.sqlSession = ss;
    }


    @Transactional(readOnly = true)
    public List<TemplateVO> selectTempList() {
        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return tm.selectTempList();
    }

    @Transactional(readOnly = true)
    public TemplateVO selectTempById(Integer templateId) {
        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return tm.selectTempById(templateId);
    }

    @Transactional
    public int insertTemp(TemplateVO templateVO) {
        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return tm.insertTemp(templateVO);
    }

    @Transactional
    public int updateTemp(TemplateVO templateVO) {
        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return tm.updateTemp(templateVO);
    }

    @Transactional
    public int deleteTempById(Integer templateId) {
        TemplateMapper tm = sqlSession.getMapper(TemplateMapper.class);
        return tm.deleteTempById(templateId);
    }
}
