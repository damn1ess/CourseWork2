package com.skypro.coursework2;

import java.util.List;

public interface ExaminerService {
    List<Question> getQuestions(int amount) throws BadRequestException;
}