package com.awt;

import java.awt.*;

public class StudentForm {

    Frame frame;
    Label label;
    TextField textField;
    Button button;

    StudentForm(){

        frame = new Frame("Student form");
        label = new Label("Student Name");
        textField = new TextField();
        button = new Button("don't Click");

    }


    public static void main(String[] args){
        new StudentForm();
    }
}
