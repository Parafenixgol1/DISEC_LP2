/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.almacendisec.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
        
        JasperReport reporteToolUse = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/almacendisec/reports/ToolUse2.jasper").getFile());
        HashMap hm = new HashMap();
        //String codigo =  JOptionPane.showInputDialog(null,"Ingrese un código de cliente:");
       // String fechaInicial =  JOptionPane.showInputDialog(null,"Para la generación del reporte ingrese una fecha inicial:");
        //String fechaFinal =  JOptionPane.showInputDialog(null,"Ingrese una fecha final:");
       
      //  hm.put("Fecha_ inicial","01/01/2019");
      //  hm.put("Fecha_final","04/30/2019");
               
      //  JasperPrint impresion = JasperFillManager.fillReport(reporteToolUse, hm, con);
        
        //JasperViewer visor = new JasperViewer(impresion);
        
      //  visor.setVisible(true);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    
}
}