/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1angelikguatemala;

/**
 *
 * @author angeg
 */
public class Factura {

    //inicializacion de variables
    public String code = "";
    public double monto = 0;
    public int mes = 0;
    public String month = "";
    public int electronico = 0;
    public int automotrices = 0;
    public int construccción = 0;
    public double bonos = 0;
    public double total = 0;
    int i = 0;

//constructor
    public Factura() {
    }
//getter y setter de codem montom mes, month, electronico,automotrices,construcción, bonos

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        switch (mes) {
            case 1:
                month = "Enero";

                break;
            case 2:
                month = "Febrero";
                break;
            case 3:
                month = "Marzo";
                break;
            case 4:
                month = "Abril";
                break;
            case 5:
                month = "Mayo";
                break;
            case 6:
                month = "Junio";
                break;
            case 7:
                month = "Julio";
                break;
            case 8:
                month = "Agosto";
                break;
            case 9:
                month = "Septiembre";
                break;
            case 10:
                month = "Octubre";
                break;
            case 11:
                month = "Noviembre";
                break;
            case 12:
                month = "Diciembre";
                break;

            default:
                month = "Se ingreso un dato incorrecto";

        }
        this.month = month;
    }

    public int getElectronico() {
        return electronico;
    }

    public void setElectronico(int electronico) {
        this.electronico = electronico;
    }

    public int getAutomotrices() {
        return automotrices;
    }

    public void setAutomotrices(int automotrices) {
        this.automotrices = automotrices;
    }

    public int getConstruccción() {
        return construccción;
    }

    public void setConstruccción(int construccción) {
        this.construccción = construccción;
    }

    public double getBonos() {
         if (electronico >= 3) {
            i++;
            bonos = (monto * 0.04) + monto;

        } else {
            bonos = (monto * 0.02) + monto;
            i++;

        }

        if (automotrices >= 4) {
            i++;
            bonos = (monto * 0.04) + bonos;

        } else {
            bonos = (monto * 0.02);
            i++;

        }
        if (construccción > 0) {
            i = i + 2;
            bonos = (monto * 0.08) + bonos;
        }
        if (monto > 5000) {
            bonos = total * 0.05 + bonos;
        }
        return bonos;
    }

    public void setBonos(double bonos) {
        if (electronico >= 3) {
            i++;
            bonos = (monto * 0.04) + monto;

        } else {
            bonos = (monto * 0.02) + monto;
            i++;

        }

        if (automotrices >= 4) {
            i++;
            bonos = (monto * 0.04) + bonos;

        } else {
            bonos = (monto * 0.02);
            i++;

        }
        if (construccción > 0) {
            i = i + 2;
            bonos = (monto * 0.08) + bonos;
        }
        if (monto > 5000) {
            bonos = total * 0.05 + bonos;
        }
        this.bonos = bonos;
    }

    public double getTotal() {
        total=monto+total;
        return total;
    }

    public void setTotal(double total) {
        total = monto + total;
        this.total = total;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }


    }
    

