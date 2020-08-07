/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Opangs
 */
public class PertanyaanManager {
    protected Pertanyaan pertanyaan;  
    public String catalog;  
    public PertanyaanManager(String catalog) {  
    this.catalog=catalog;  
    }  
    public void next() {  
    pertanyaan.nextQuestion();  
    }  
    public void previous() {  
    pertanyaan.previousQuestion();  
    }  
    public void newOne(String quest) {  
    pertanyaan.newQuestion(quest);  
    }  
    public void delete(String quest) {  
    pertanyaan.deleteQuestion(quest);  
    }  
    public void display() {  
    pertanyaan.displayQuestion();  
    }  
    public void displayAll() {  
        System.out.println("Pertanyaan : " + catalog);  
    pertanyaan.displayAllQuestions();  
    }  
}
