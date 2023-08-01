/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.com;

/**
 *
 * @author Azim S63190
 */
public class Register {

    //Define instance variables
    private String ic;
    private String name;
    private int pax;
    private int trainingType;
    private int stud;

    //Define default connstructor
    public Register() {

    }

    //Getter & setter method
    public String getIC() {
        return ic;
    }

    public void setIC(String ic) {
        this.ic = ic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public int getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(int trainingType) {
        this.trainingType = trainingType;
    }

    public int getStudent() {
        return stud;
    }

    public void setStudent(int stud) {
        this.stud = stud;
    }
}
