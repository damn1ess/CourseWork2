package com.skypro.coursework2;

import java.util.List;

public interface QuestionService {
    void addQuestion(Question question);
    void removeQuestion(Question question);
    List<Question> getAllQuestions();
    Question getRandomQuestion();
}