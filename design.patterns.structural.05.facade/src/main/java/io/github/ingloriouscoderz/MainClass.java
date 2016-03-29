package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.facade.HelperFacade;
import io.github.ingloriouscoderz.facade.HelperFacade.DBTypes;
import io.github.ingloriouscoderz.facade.HelperFacade.ReportTypes;

public class MainClass {
 
    public static void main(String[] args) {
    	HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, "customers");
    }
}
