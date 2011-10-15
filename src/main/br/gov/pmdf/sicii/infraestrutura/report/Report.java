package br.gov.pmdf.sicii.infraestrutura.report;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.sql.DataSource;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;

import org.jboss.seam.annotations.Name;

@Name("report")
public class Report {    
	
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;	
	
	private void generateReport(String query, String fileName) throws JRException {
		
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
	public void populateDataReport(String query, String fileName) throws SQLException, JRException {		
		statement = connection.createStatement();		
		resultSet = statement.executeQuery(query);
		generateReport(query, fileName);
	}
	public Report() throws NamingException, SQLException {
		InitialContext initialContext = new InitialContext();
		DataSource datasource = (DataSource) initialContext.lookup("java:/siciiDatasource");
		connection = datasource.getConnection();
	}
}
