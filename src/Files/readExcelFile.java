package Files;

public class readExcelFile {

	public static void main(String[] args) {
		String sFile = System.getProperty("user.dir"+"/testExcel.xls");
		try {
		HSSFWorkbook myExcelBook = new HSSHFWorkbook(new FileInputStreem(sFile));
			
		}
		

	}

}
