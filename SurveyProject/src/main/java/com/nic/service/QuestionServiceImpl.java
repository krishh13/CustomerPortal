package com.nic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nic.dto.QuestionDto;
import com.nic.model.Question;
import com.nic.repository.QuestionRepository;

@Service
public class QuestionServiceImpl extends AbstractService<QuestionDto, Question>
    implements QuestionService {

  @Autowired
  private QuestionRepository questionRepo;

  public QuestionServiceImpl() {
    super(Question.class, QuestionDto.class);
  }

  @Override
  protected QuestionRepository getDao() {
    return questionRepo;
  }
}
