import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.exception.MyException;
import com.service.MyBatisService;

public class MyBatisTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. insert
		MyBatisService service = new MyBatisService();
    String dname = null;
		try {
			List<Dept> list = service.selectByDname(dname);
			for (Dept dept : list) {
				System.out.println(dept);
			}
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String dname2 = null; // "SALES" "RESEARCH"  null
		try {
			List<Dept> list = service.selectByDnameChoose(dname2);
			for (Dept dept : list) {
				System.out.println(">>>"+dept);
			}
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String dname3 = "SALES";
		try {
			List<Dept> list = service.selectByDnameWhere(dname3);
			for (Dept dept : list) {
				System.out.println("*****"+dept);
			}
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		String dname4 = "SALES";
		String loc = "BOSTON";
		try {
			List<Dept> list = service.selectByDnameWhere2(dname4,loc);
			for (Dept dept : list) {
				System.out.println("@@@@"+dept);
			}
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end main
}//end class


