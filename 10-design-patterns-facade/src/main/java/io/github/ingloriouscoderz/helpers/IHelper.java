package io.github.ingloriouscoderz.helpers;

import java.sql.Connection;

public interface IHelper {
	public Connection getConnection();
	public void generatePdfReport(String tablename, Connection conn);
	public void generateHtmlReport(String tablename, Connection conn);
}
