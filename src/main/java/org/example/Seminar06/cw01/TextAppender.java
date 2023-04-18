package org.example.Seminar06.cw01;

public class TextAppender {
    public Text appendText(Text currentText, Text newText){
        return new Text(currentText.getText() + newText.getText());
    }
}
