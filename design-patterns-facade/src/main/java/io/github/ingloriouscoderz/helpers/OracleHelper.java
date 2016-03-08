package io.github.ingloriouscoderz.helpers;

import java.sql.Connection;

public class OracleHelper implements IHelper {

	@Override
	public Connection getConnection() {
		System.out.printf("[%s] - returning connection...\n", getClass().getSimpleName());
		return null;
	}

	@Override
	public void generatePdfReport(String tablename, Connection conn) {
		System.out.printf("[%s] - generating PDF report...\n", getClass().getSimpleName());
	}

	@Override
	public void generateHtmlReport(String tablename, Connection conn) {
		System.out.printf("[%s] - generating HTML report...\n", getClass().getSimpleName());
	}

}
