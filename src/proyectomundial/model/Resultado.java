/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomundial.model;

/**
 *
 * @author miguelropero
 */
public class Resultado {

    String grupo;
    String localE;
    String visitante;
    String continente_local;
    String continente_visitante;
    String goles_local;
    String goles_visitante;
    
    public Resultado() {
    }

    public Resultado(String grupo, String localE, String visitante, String continente_local,String continente_visitante, String goles_local, String goles_visitante) {
        this.grupo = grupo;
        this.localE = localE;
        this.visitante = visitante;
        this.continente_local = continente_local;
        this.continente_visitante = continente_visitante;
        this.goles_local = goles_local;
        this.goles_visitante = goles_visitante;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getLocalE() {
        return localE;
    }

    public void setLocalE(String localE) {
        this.localE = localE;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public String getContinente_local() {
        return continente_local;
    }

    public void setContinente_local(String continente_local) {
        this.continente_local = continente_local;
    }

    public String getContinente_visitante() {
        return continente_visitante;
    }

    public void setContinente_visitante(String continente_visitante) {
        this.continente_visitante = continente_visitante;
    }

    public String getGoles_local() {
        return goles_local;
    }

    public void setGoles_local(String goles_local) {
        this.goles_local = goles_local;
    }

    public String getGoles_visitante() {
        return goles_visitante;
    }

    public void setGoles_visitante(String goles_visitante) {
        this.goles_visitante = goles_visitante;
    }

    
}
