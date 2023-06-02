/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomundial.model;

/**
 *
 * @author User
 */
public class Auditoria {
    String pagina;
    String contador;

    public Auditoria() {
    }

    public Auditoria(String menu, String contador) {
        this.pagina = menu;
        this.contador = contador;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String menu) {
        this.pagina = menu;
    }

    public String getContador() {
        return contador;
    }

    public void setContador(String contador) {
        this.contador = contador;
    }
    
    
    
    
}
