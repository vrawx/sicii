package br.gov.pmdf.sicii.infraestrutura.report;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;

import org.jboss.seam.annotations.Name;

@Name("report")
public class Report {    
	
	private void generateReport(ResultSet resultSet, String fileName) throws JRException {
		/* implementação da interface JRDataSource para DataSource ResultSet */
		JRResultSetDataSource resultSetDataSource = new JRResultSetDataSource(resultSet);
		
		/* HashMap de parametros utilizados no relatório. Sempre instanciados */
		Map parameters = new HashMap();

	    // parameters.put("COLUNA", valor);
	    /* Preenche o relatório com os dados. Gera o arquivo BibliotecaPessoal.jrprint */
		JasperFillManager.fillReportToFile(fileName+".jasper", parameters, resultSetDataSource);
		
		/* Exporta para o formato PDF */
		JasperExportManager.exportReportToPdfFile(fileName+".jrprint");
		
		 /* Visualiza o relatório em formato PDF */
		JasperViewer.viewReport("", false);
	}
}
