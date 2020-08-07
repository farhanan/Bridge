/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Opangs
 */
public class BridgePatternDemo {
    public static void main(String[] args) {  
    FormatPertanyaan questions = new FormatPertanyaan("Pelajaran Biologi");  
    questions.pertanyaan = new PertanyaanBiologi();  
        questions.delete("Apa itu Organisme ?");  
        questions.display();  
    questions.newOne("Apa ciri Organisme ? ");   
    questions.newOne("Oragnisme tersusun dari apa?");  
    questions.displayAll();  
    }  
}
