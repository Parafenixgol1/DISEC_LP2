/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.lp2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Victor Alonso Vergara 20141826
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            
        JasperReport reporteCustomerReport = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/inf/lp2/reports/OITCustomerReport.jasper").getFile());
        JasperReport reporteCustomerReport_IW = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/inf/lp2/reports/OITCustomerReport_InformationWorker.jasper").getFile());
        JasperReport reporteCustomerReport_IW_IWO = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/inf/lp2/reports/OITCustomerReport_InformationWorker_InformationWorkOrder.jasper").getFile());     
        
        HashMap hm = new HashMap();
        String codigo =  JOptionPane.showInputDialog(null,"Ingrese un código de cliente:");
        String fechaInicial =  JOptionPane.showInputDialog(null,"Para la generación del reporte ingrese una fecha inicial:");
        String fechaFinal =  JOptionPane.showInputDialog(null,"Ingrese una fecha final:");
        hm.put("CODIGOCLIENTE",codigo);
        hm.put("FECHAINICIO",fechaInicial);
        hm.put("FECHAFINAL",fechaFinal);
        
        HashMap hm3 = new HashMap();
        hm3.put("CODIGOCLIENTE",codigo);
        hm3.put("FECHAINICIO",fechaInicial);
        hm3.put("FECHAFINAL",fechaFinal);
        
        HashMap hm2 = new HashMap();
        hm2.put("CODIGOCLIENTE",codigo);
        hm2.put("FECHAINICIO",fechaInicial);
        hm2.put("FECHAFINAL",fechaFinal);
        hm2.put("SUBREPORT_DIR",reporteCustomerReport_IW);
        
        hm.put("SUBREPORT_DIR",reporteCustomerReport_IW_IWO);
        
        JasperPrint impresion = JasperFillManager.fillReport(reporteCustomerReport, hm, con);
        
        JasperViewer visor = new JasperViewer(impresion);
        
        visor.setVisible(true);
      
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    
    }
    
}
