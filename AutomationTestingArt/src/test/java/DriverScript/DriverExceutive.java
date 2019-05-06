package DriverScript;

import java.io.IOException;

import Utility.ExcelUtils;
import confic.UIActionKeywords;

public class DriverExceutive 
{
	public static void main(String[] args) throws Exception
	{
	
	String sPath="C:\\Users\\HP\\Documents\\KeywordDrivenFramework.xlsx";
	ExcelUtils.setExcelFile(sPath,"Sheet1");
	for(int iRow=1;iRow<=7;iRow++)
	{
		String sActionKeyword=ExcelUtils.getCellData(iRow,3);
		
		if(sActionKeyword.equals("openbrowser"))
		{
	UIActionKeywords.openbrowser();
	}
	else if(sActionKeyword.equals("navigate"))
	{		
		UIActionKeywords.openApp();
     }
	else if(sActionKeyword.equals("enterEmail"))
	{		
		UIActionKeywords.enterEmail();
}
	else if(sActionKeyword.equals("enterpassword"))
	{
		
		UIActionKeywords.enterpassword();
	
}
	else if(sActionKeyword.equals("clicklogin"))
	{
		
		UIActionKeywords.clicklogin();
	}
	

	else if(sActionKeyword.equals("applywait"))
	{
		
		UIActionKeywords.applywait();
	
}
	else if(sActionKeyword.equals("closeBrowser"))
	{
		
		UIActionKeywords.closeBrowser();
	
}
	}
	
	
	}
}
