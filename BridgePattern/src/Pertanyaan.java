/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Opangs
 */
public interface Pertanyaan {
    public void nextQuestion();  
    public void previousQuestion();  
    public void newQuestion(String pertanyaanbaru);  
    public void deleteQuestion(String hapuspertanyaan);  
    public void displayQuestion();  
    public void displayAllQuestions();  
}
