/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1angelikguatemala;

import javax.swing.JOptionPane;

/**
 *
 * @author angeg
 */
public class Caso1AngelikGuatemala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int op = 1;

        Agente agent1 = new Agente();
        Usuario client1 = new Usuario();
        Factura fact1 = new Factura();

        while (op == 1) {

            client1.setNom(JOptionPane.showInputDialog("Ingrese el nombre del cliente: "));
            client1.setID(JOptionPane.showInputDialog("Ingrese la cedula del cliente: "));

            fact1.setMonto(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura:")));
            fact1.setCode(JOptionPane.showInputDialog("Ingrese el codigo de la factura:"));
            fact1.setMes(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura en numeros")));
            fact1.setElectronico(Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos electronicos contiene la factura ")));
            fact1.setAutomotrices(Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos automotrices contiene la factura ")));
            fact1.setConstruccción(Integer.parseInt(JOptionPane.showInputDialog("Cantos productos de construcción contiene la factura: ")));

            op = Integer.parseInt(JOptionPane.showInputDialog("¿Dese ingresar otra factura? \n 1.Sí / 2.No"));

        }

        agent1.setNom(JOptionPane.showInputDialog("Ingrese su nombre"));
        agent1.setID(JOptionPane.showInputDialog("Ingrese su cedula: "));
        agent1.setCode(JOptionPane.showInputDialog("Ingrese su codigo"));
        agent1.setSucursal(JOptionPane.showInputDialog("Ingrese el nombre de su sucursal:  "));
        agent1.setCarro(JOptionPane.showInputDialog("¿Tiene carro propio \n Sí o No"));
        JOptionPane.showMessageDialog(null, "El agente vendedor: " + agent1.getNom() + " codigo " + agent1.getCode() + " en el mes " + fact1.getMonth());

        JOptionPane.showMessageDialog(null, "vendió un total de:  " + fact1.getTotal() + "\nEl vendedor obtuvo en comisiiones: " + fact1.getBonos() + "\nPuntos obtenidos por el vendedor:  " + fact1.getI() + "\n" + "El vendedor "+agent1.getCarro() +"tiene carro propio" + "\n" +"sucursal" + agent1.getSucursal());
    }

}
