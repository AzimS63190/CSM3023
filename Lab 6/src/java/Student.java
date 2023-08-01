/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lab6.com;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


/**
 *
 * @author Azim S63190
 */
public class Student {
    
    private String stuno;
    private String name;
    private String program;
    private String valid;
    private String invalid;

    public String getStuno() {
        Pattern pt = Pattern.compile("[A-Z0-9]*");
        Matcher mt = pt.matcher(stuno);
        boolean bl = mt.matches();
        if (bl == true){
            valid = stuno;
        } else{
            valid = invalid;
        }    
        return valid;
    }
    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    
}