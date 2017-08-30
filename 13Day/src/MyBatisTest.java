import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.exception.MyException;
import com.service.MyBatisService;

public class MyBatisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. insert
		MyBatisService service = new MyBatisService();
		/*try {
			service.insert(new Dept(80, "개발", "속초"));
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}*/
		//2. delete
		    try {
				service.delete(41);
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		//3.update
		    try {
				service.update(new Dept(80, "인사", "부산"));
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		//4. selectByDeptno
		    
		    try {
				Dept dept = service.select(40);
				System.out.println(dept);
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//5. selectAll
		    try {
				List<Dept> list = service.selectAll();
				for (Dept dept : list) {
					System.out.println(dept);
				}
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		//6. deptCOunt
		    try {
				int n = service.deptCount();
				System.out.println("레코드 갯수:" + n);
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		//7. selectHashMap
		    try {
				HashMap map = service.selectHashMap(10);
				Set set = map.keySet();
				for (Object key : set) {
					System.out.println(key+"="+map.get(key));
				}
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 //8. selectJoin   
		    try {
				HashMap map = service.selectJoin("SMITH");
				Set set = map.keySet();
				for (Object key : set) {
					System.out.println(key+"="+map.get(key));
				}
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		    // 9. selectByDnameLoc 
		    //DTO 클래스에 저장 불가능한 데이터인 경우에 사용 가능
		    HashMap<String,String> map = new HashMap<>();
		    map.put("xxx", "SALES");
		    map.put("yyy", "CHICAGO");
		    try {
				List<Dept> list = service.selectByDnameLoc(map);
				for (Dept dept : list) {
					System.out.println(dept);
				}
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		   //10. paging 처리 ( Top-N 분석 ) 
		   // RowBound 클래스
		    
		    try {
				List<Dept> list = service.selectPaging(4,5);
				for (Dept dept : list) {
					System.out.println(dept);
				}
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}//end main
}


