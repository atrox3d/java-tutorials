package io.github.ingloriouscoderz.factory;

import io.github.ingloriouscoderz.facade.HelperFacade.DBTypes;
import io.github.ingloriouscoderz.helpers.IHelper;
import io.github.ingloriouscoderz.helpers.MySqlHelper;
import io.github.ingloriouscoderz.helpers.OracleHelper;

public class HelperFactory {
	public static IHelper getHelper(DBTypes dbType) {
		switch(dbType) {
			case MYSQL:
				return new MySqlHelper();
			case ORACLE:
				return new OracleHelper();
			default:
				return null;
		}
	}
}
