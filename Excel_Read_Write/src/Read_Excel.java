
public class Read_Excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Xls_Reader xls = new Xls_Reader("D:\\JANBASK\\NOV WEEKDAY BATCH\\Excel_Read_Write\\src\\TEST_SUITE\\TESTSUITE.xlsx");
		
		int row_count=xls.getRowCount("GMAIL");
		
		
		System.out.println("Row count in gmail sheet is ==> "+row_count);

		
		String value =xls.getCellData("GMAIL", "TESTCASE", 4);
		
		//System.out.println(value);
		
		
		for(int row=1;row<=row_count;row++)
		
		{
			
			String col1 =xls.getCellData("GMAIL", "TCID", row);
			
			String col2 =xls.getCellData("GMAIL", "TESTCASE", row);
			
			String col3 =xls.getCellData("GMAIL", "STATUS", row);
			
			//System.out.print(col1+" | "+col2+" | "+col3);
			//System.out.println();
			
			
			
		}
		
		
		xls.addColumn("GMAIL", "COMMENTS");
		
		
		
	}

}
