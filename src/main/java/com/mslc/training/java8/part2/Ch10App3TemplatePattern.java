package com.mslc.training.java8.part2;

import com.mslc.training.java8.ch10.template.Company;
import com.mslc.training.java8.ch10.template.CompanyLoanApplication;
import com.mslc.training.java8.ch10.template.LoanApplication;

public class Ch10App3TemplatePattern {

	
	public static void main(String[] args) {
		
		LoanApplication app1 = new CompanyLoanApplication(new Company());
		
		
		
	}
	
}
