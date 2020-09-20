import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class cellfulldata {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Double> li = new LinkedList<Double>();
		double v = 0, a1 = 0;
		int b = 1;
		int t1 = 1, r = 0, t2 = 20, aa = 1;
		int oo = 0;

		System.out.print("Enter your choice ");
		System.out.print("1 : OPEN , 2: HIGH, 3:LOW,  4:CLOSE, 5:ADJUSTED CLOSE, 6: VOLUMN \n");
		int a = sc.nextInt();
		switch (a) {
		case 1: {
			try {
				File file = new File("C:\\Users\\Acer\\Downloads\\pdf\\reliance.xlsx");
				FileInputStream fis = new FileInputStream(file);

				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheetAt(0);
				Iterator<Row> itr = sheet.iterator();
				while (itr.hasNext()) {
					Row row = itr.next();

					Row row1 = sheet.getRow(1);
					Cell cell = row.getCell(1);
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:

						break;
					case Cell.CELL_TYPE_NUMERIC:

						li.add(cell.getNumericCellValue());

						b++;
						break;
					default:
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (li.size() > 20) {

				for (int j = 0; j < 20; j++) {
					a1 = a1 + li.get(j) / 20;
					// System.out.println(li.get(j));
					oo++;
					System.out.println("SAM  of day:" + " " + oo + "  " + a1);

				}

			}

			while (r < li.size()) {

				t2 = 20;
				r = t2 + aa;
				a1 = 0;
				for (int j = t1; j < r; j++) {
					a1 = a1 + li.get(j) / 20;
					// System.out.println(li.get(j));

				}
				oo++;
				System.out.println("SAM  of day:" + "  " + oo + "  " + a1);
				aa++;
				t1++;
			}

			break;
		}
		case 2: {
			try {
				File file = new File("C:\\Users\\Acer\\Downloads\\pdf\\reliance.xlsx");
				FileInputStream fis = new FileInputStream(file);

				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheetAt(0);
				Iterator<Row> itr = sheet.iterator();
				while (itr.hasNext()) {
					Row row = itr.next();

					Row row1 = sheet.getRow(1);
					Cell cell = row.getCell(2);
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:

						break;
					case Cell.CELL_TYPE_NUMERIC:

						li.add(cell.getNumericCellValue());

						b++;
						break;
					default:
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (li.size() > 20) {

				for (int j = 0; j < 20; j++) {
					a1 = a1 + li.get(j) / 20;
					// System.out.println(li.get(j));
					oo++;
					System.out.println("SAM  of day:" + " " + oo + "  " + a1);

				}

			}

			while (r < li.size()) {

				t2 = 20;
				r = t2 + aa;
				a1 = 0;
				for (int j = t1; j < r; j++) {
					a1 = a1 + li.get(j) / 20;
					// System.out.println(li.get(j));

				}
				oo++;
				System.out.println("SAM  of day:" + "  " + oo + "  " + a1);
				aa++;
				t1++;
			}

			break;
		}
		case 3: {
			try {
				File file = new File("C:\\Users\\Acer\\Downloads\\pdf\\reliance.xlsx");
				FileInputStream fis = new FileInputStream(file);

				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheetAt(0);
				Iterator<Row> itr = sheet.iterator();
				while (itr.hasNext()) {
					Row row = itr.next();

					Row row1 = sheet.getRow(1);
					Cell cell = row.getCell(3);
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:

						break;
					case Cell.CELL_TYPE_NUMERIC:

						li.add(cell.getNumericCellValue());

						b++;
						break;
					default:
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (li.size() > 20) {

				for (int j = 0; j < 20; j++) {
					a1 = a1 + li.get(j) / 20;
					// System.out.println(li.get(j));
					oo++;
					System.out.println("SAM  of day:" + " " + oo + "  " + a1);

				}

			}

			while (r < li.size()) {

				t2 = 20;
				r = t2 + aa;
				a1 = 0;
				for (int j = t1; j < r; j++) {
					a1 = a1 + li.get(j) / 20;
					// System.out.println(li.get(j));

				}
				oo++;
				System.out.println("SAM  of day:" + "  " + oo + "  " + a1);
				aa++;
				t1++;
			}

			break;
		}
		case 4: {
			try {
				File file = new File("C:\\Users\\Acer\\Downloads\\pdf\\reliance.xlsx");
				FileInputStream fis = new FileInputStream(file);

				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheetAt(0);
				Iterator<Row> itr = sheet.iterator();
				while (itr.hasNext()) {
					Row row = itr.next();

					Row row1 = sheet.getRow(1);
					Cell cell = row.getCell(4);
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:

						break;
					case Cell.CELL_TYPE_NUMERIC:

						li.add(cell.getNumericCellValue());

						b++;
						break;
					default:
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (li.size() > 20) {

				for (int j = 0; j < 20; j++) {
					a1 = a1 + li.get(j) / 20;
					// System.out.println(li.get(j));
					oo++;
					System.out.println("SAM  of day:" + " " + oo + "  " + a1);

				}

			}

			while (r < li.size()) {

				t2 = 20;
				r = t2 + aa;
				a1 = 0;
				for (int j = t1; j < r; j++) {
					a1 = a1 + li.get(j) / 20;
					// System.out.println(li.get(j));

				}
				oo++;
				System.out.println("SAM  of day:" + "  " + oo + "  " + a1);
				aa++;
				t1++;
			}

			break;
		}
		case 5: {
			try {
				File file = new File("C:\\Users\\Acer\\Downloads\\pdf\\reliance.xlsx");
				FileInputStream fis = new FileInputStream(file);

				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheetAt(0);
				Iterator<Row> itr = sheet.iterator();
				while (itr.hasNext()) {
					Row row = itr.next();

					Row row1 = sheet.getRow(1);
					Cell cell = row.getCell(5);
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:

						break;
					case Cell.CELL_TYPE_NUMERIC:

						li.add(cell.getNumericCellValue());

						b++;
						break;
					default:
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (li.size() > 20) {

				for (int j = 0; j < 20; j++) {
					a1 = a1 + li.get(j) / 20;
					// System.out.println(li.get(j));
					oo++;
					System.out.println("SAM  of day:" + " " + oo + "  " + a1);

				}

			}

			while (r < li.size()) {

				t2 = 20;
				r = t2 + aa;
				a1 = 0;
				for (int j = t1; j < r; j++) {
					a1 = a1 + li.get(j) / 20;
					// System.out.println(li.get(j));

				}
				oo++;
				System.out.println("SAM  of day:" + "  " + oo + "  " + a1);
				aa++;
				t1++;
			}

			break;
		}
		case 6: {
			try {
				File file = new File("C:\\Users\\Acer\\Downloads\\pdf\\reliance.xlsx");
				FileInputStream fis = new FileInputStream(file);

				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheetAt(0);
				Iterator<Row> itr = sheet.iterator();
				while (itr.hasNext()) {
					Row row = itr.next();

					Row row1 = sheet.getRow(1);
					Cell cell = row.getCell(6);
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:

						break;
					case Cell.CELL_TYPE_NUMERIC:

						li.add(cell.getNumericCellValue());

						break;
					default:
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (li.size() > 20) {

				for (int j = 0; j < 20; j++) {
					a1 = a1 + li.get(j) / 20;
					// System.out.println(li.get(j));
					oo++;
					BigDecimal a2 = new BigDecimal(a1);
					System.out.println("SAM  of day:" + " " + oo + "  " + a2);

				}

			}

			while (r < li.size()) {

				t2 = 20;
				r = t2 + aa;
				a1 = 0;
				for (int j = t1; j < r; j++) {
					a1 = a1 + li.get(j) / 20;

					// System.out.println(li.get(j));

				}
				oo++;
				BigDecimal a2 = new BigDecimal(a1);
				System.out.println("SAM  of day:" + "  " + oo + "  " + a2);
				aa++;
				t1++;
			}

			break;
		}
		default:
			System.out.print("no entry");
		}

	}
}