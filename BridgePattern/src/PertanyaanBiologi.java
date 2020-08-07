/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Opangs
 */
import java.util.ArrayList;  
import java.util.List;
 
public class PertanyaanBiologi implements Pertanyaan {
    private List <String> pertanyaan = new ArrayList<String>();  
 private int current = 0;  
 public PertanyaanBiologi(){  
    pertanyaan.add("Apa itu Organisme ? ");  
    pertanyaan.add("Apa ciri Organisme ? ");  
    pertanyaan.add("Oragnisme tersusun dari apa ? ");  
    pertanyaan.add("Hormon yang berperan dalam merangsang pertumbuhan dan perkembangan tanaman adalah ? ");  
    pertanyaan.add("Hal yang TIDAK dibutuhkan dalam proses biosintesis adalah ? ");  
    pertanyaan.add("Urutan tingkatan klasifikasi taksonomi dari yang tertinggi sampai yang terendah adalah ? ");  
   
 }  
 public void nextQuestion() {  
    if( current <= pertanyaan.size()-1 )  
    current++;  
    System.out.print(current);  
 }  
  
 public void previousQuestion() {  
    if( current > 0 )  
    current--;  
 }  
  
 public void newQuestion(String quest) {  
    pertanyaan.add(quest);  
 }  
  
 public void deleteQuestion(String quest) {  
    pertanyaan.remove(quest);  
 }  
  
 public void displayQuestion() {  
    System.out.println(pertanyaan.get(current) );  
 }  
 public void displayAllQuestions() {  
    for (String quest : pertanyaan) {  
    System.out.println(quest);  
 }  
    }  
}
