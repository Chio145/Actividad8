/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Triangulo {
public int resultadoA;
    public int resultadoP;

    public void AREA(String BaseT, String AlturaT){
        int area= Integer.parseInt(BaseT)*Integer.parseInt(AlturaT)/2;
        this.setResultadoA(area);
    }
    
    public void PERIMETRO(String BaseT){
        int perimetro= Integer.parseInt(BaseT)*3;
        this.setResultadoP(perimetro);
    }
    
    public int getResultadoA() {
        return resultadoA;
    }

    public void setResultadoA(int resultadoA) {
        this.resultadoA = resultadoA;
    }

    public int getResultadoP() {
        return resultadoP;
    }

    public void setResultadoP(int resultadoP) {
        this.resultadoP = resultadoP;
    }
}

