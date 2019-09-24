package quiz;

import javax.swing.*;

public class Question {
    private String text;
    private String answer;

    public Void Display(){
        JOptionPane.showInputDialog(text,JOptionPane.PLAIN_MESSAGE);
    }

    public boolean CheckAnswer(String str){
        return str.equalsIgnoreCase(answer);
    }

    public Question() {
        text = "";
        answer = "";
    }

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

