/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "sumaBean") 
@SessionScoped 

public class sumaBean {

    public double opeA;
    public double opeB;
    public double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String sumar() {
        total = opeA + opeB;
        return "resultado";
    }

    public double getOpeA() {
        return opeA;
    }

    public void setOpeA(double opeA) {
        this.opeA = opeA;
    }

    public double getOpeB() {
        return opeB;
    }

    public void setOpeB(double opeB) {
        this.opeB = opeB;
    }
}
