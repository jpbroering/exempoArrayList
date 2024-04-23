/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 10724112106
 */
public class Aluno extends Pessoa {
    private String curso;
    private int fase;
    public Aluno() {
        this("",0,0,"",0);
    }
    public Aluno(String curso, int fase, int id, String nome, int idade) {
    super(id, nome, idade);
    this.curso = curso;
    this.fase = fase;
    }
    public String getCurso() {
    return curso;
    }
    public void setCurso(String curso) {
    this.curso = curso;
    }
    public int getFase() {
    return fase;
    }
    public void setFase(int fase) {
    this.fase = fase;
    }
    @Override
    public String toString() {
    return super.toString()
    + "\n Curso: " + this.getCurso()
    + "\n Fase: " + this.getFase()
    + "\n -----------";
    }
}
