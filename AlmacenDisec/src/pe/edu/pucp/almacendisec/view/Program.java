/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.almacendisec.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import pe.edu.pucp.almacendisec.config.DBManager;

public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        try {
            DBManager dbManager = DBManager.getdbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(),dbManager.getPassword());
           
            try {
                /*
                //ENTRADAS
                JasperReport inventario = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/almacendisec/reports/EntradasdelKardex.jasper").getFile());
                JasperPrint impresion = JasperFillManager.fillReport(inventario, null, con);
                JasperViewer visor = new JasperViewer(impresion);
                visor.setVisible(true);*/
                
                JasperReport critico = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/almacendisec/reports/StockCritico.jasper").getFile());
                JasperPrint impresion = JasperFillManager.fillReport(critico, null, con);
                JasperViewer visor = new JasperViewer(impresion);
                visor.setVisible(true);
                
                /*
                //KARDEX
                JasperReport kardex = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/almacendisec/reports/Kardex.jasper").getFile());
                JasperPrint impresion = JasperFillManager.fillReport(kardex, null, con);
                JasperViewer visor = new JasperViewer(impresion);
                visor.setVisible(true);
                */
                
                
               /* 
                SALIDAS
                
                JasperReport salida = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/almacendisec/reports/GuiadeSalida.jasper").getFile());
                HashMap<String, Object> hm = new HashMap <String, Object>();
                hm.put("CODIGO_WORK_ORDER","PROY0001"); 
                JasperPrint impresion = JasperFillManager.fillReport(salida, hm, con);
                JasperViewer visor = new JasperViewer(impresion);
                visor.setVisible(true);*/
               
               
               
                /*
                //USO DE HERRAMIENTAS
                
                JasperReport reporteToolUse = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/almacendisec/reports/ToolUse2.jasper").getFile());
                 HashMap<String, Object> hm = new HashMap <String, Object>();
            
                //SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                
                Date date1 = new GregorianCalendar(2019, 1, 1).getTime();
                hm.put("fecha_inicial",date1);
                Date date2 = new GregorianCalendar(2020, 4, 29).getTime();
                
                hm.put("fecha_final",date2);
            
                JasperPrint impresion = JasperFillManager.fillReport(reporteToolUse, hm, con);
            
                JasperViewer visor = new JasperViewer(impresion);
            
                visor.setVisible(true);
               */
                
                
                /*
                //INVENTARIO VALORIZADO
                JasperReport inventario = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/almacendisec/reports/InventarioValorizado.jasper").getFile());
                JasperPrint impresion = JasperFillManager.fillReport(inventario, null, con);
                JasperViewer visor = new JasperViewer(impresion);
                visor.setVisible(true);
                */
                
                
               /* 
               // OITXCLIENTE
                
                JasperReport reporteCustomerReport = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/almacendisec/reports/OITCustomerReport.jasper").getFile());
                JasperReport reporteCustomerReport_IW = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/almacendisec/reports/OITCustomerReport_InformationWorker.jasper").getFile());
                JasperReport reporteCustomerReport_IW_IWO = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/almacendisec/reports/OITCustomerReport_InformationWorker_InformationWorkOrder.jasper").getFile());     

                HashMap hm = new HashMap();
                //String codigo =  JOptionPane.showInputDialog(null,"Ingrese un código de cliente:");
                //String fechaInicial =  JOptionPane.showInputDialog(null,"Para la generación del reporte ingrese una fecha inicial:");
                //String fechaFinal =  JOptionPane.showInputDialog(null,"Ingrese una fecha final:");
                hm.put("CODIGOCLIENTE","CUST0001");
                Date date1 = new GregorianCalendar(2000, 01, 01).getTime();
                Date date2 = new GregorianCalendar(2019, 12, 12).getTime();
                hm.put("FECHAINICIO",date1);
                hm.put("FECHAFIN", date2);

                //HashMap hm3 = new HashMap();
                //hm3.put("CODIGOCLIENTE",codigo);
                //hm3.put("FECHAINICIO",fechaInicial);
                //hm3.put("FECHAFINAL",fechaFinal);

                //HashMap hm2 = new HashMap();
                //hm2.put("CODIGOCLIENTE",codigo);
                //hm2.put("FECHAINICIO",fechaInicial);
                //hm2.put("FECHAFINAL",fechaFinal);
                //hm2.put("SUBREPORT_DIR",reporteCustomerReport_IW);

                hm.put("SUBREPORT_DIR","D:\\LP2\\Trabajo\\DISEC_LP2\\AlmacenDisec\\src\\pe\\edu\\pucp\\almacendisec\\reports\\");

                JasperPrint impresion = JasperFillManager.fillReport(reporteCustomerReport, hm, con);

                JasperViewer visor = new JasperViewer(impresion);

                visor.setVisible(true);*/
            
            } catch (Exception ex) {
                 Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            //}
            ///catch(Exception ex){
            //  System.out.println(ex.getMessage());
            //}
        } catch (SQLException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}