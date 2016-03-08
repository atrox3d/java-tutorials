package io.github.ingloriouscoderz.facade;

import java.sql.Connection;

import io.github.ingloriouscoderz.factory.HelperFactory;
import io.github.ingloriouscoderz.helpers.IHelper;

public class HelperFacade {
	public static enum DBTypes {MYSQL, ORACLE}
	public static enum ReportTypes {PDF,HTML}

	public static void generateReport(DBTypes dbType,  ReportTypes reportType, String tableName) {
		IHelper helper = HelperFactory.getHelper(dbType);
		Connection conn = helper.getConnection();
		
		switch(reportType) {
			case PDF:
				helper.generatePdfReport(tableName, conn);
			break;
			case HTML:
				helper.generateHtmlReport(tableName, conn);
			break;
		}
	}
}
