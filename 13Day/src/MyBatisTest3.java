import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.exception.MyException;
import com.service.MyBatisService;

public class MyBatisTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyBatisService service = new MyBatisService();
		
		try {
			service.updateDept(new Dept(80, null, "강원"));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		try {
			List<Dept> allList = service.selectByMultiDeptno(list);
			for (Dept dept : allList) {
				System.out.println(">>" + dept);
			}
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// multi insert
		ArrayList<Dept> multi = new ArrayList<>();
		multi.add(new Dept(70,"개발1","부산1"));
		multi.add(new Dept(71,"개발2","부산2"));
		multi.add(new Dept(72,"개발3","부산3"));

	/*	try {
			service.multiInsert(multi);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			service.multiDelete(multi);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}//end main
}//end class


