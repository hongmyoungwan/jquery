package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.MyBatisDAO;
import com.dto.Dept;
import com.exception.MyException;
import com.util.MyBatisTemplate;

public class MyBatisService {

	public List<Dept> selectAll() throws MyException{
		
		MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		} catch (Exception e) {
			// e.printStackTrace();
			throw new MyException("selectAll 실패");
		} finally {
			session.close();
		}
		return list;
	}//end 
	
	
	
	public Dept select(int deptno) throws MyException {
		MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		Dept dept = null;
		try {
			dept = dao.select(session, deptno);
		} catch (Exception e) {
			// e.printStackTrace();
			throw new MyException("select 실패");
		} finally {
			session.close();
		}
		return dept;
	}// end

	public void insert(Dept dept) throws MyException {
		MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		try {
			int n = dao.insert(session, dept);
			if (n == 1) {
				session.commit();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			throw new MyException("insert 실패");
		} finally {
			session.close();
		}

	}// end

	public void delete(int deptno) throws MyException {

		MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		try {
			int n = dao.delete(session, deptno);
			if (n == 1) {
				session.commit();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			throw new MyException("delete 실패");
		} finally {
			session.close();
		}

	}// end

	public void update(Dept dept) throws MyException {
		MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		try {
			int n = dao.update(session, dept);
			if (n == 1) {
				session.commit();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			throw new MyException("insert 실패");
		} finally {
			session.close();
		}

	}// end
	
	
	public int deptCount() throws MyException{
		MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		int n = 0;
		try {
			 n = dao.deptCount(session);
		} catch (Exception e) {
			// e.printStackTrace();
			throw new MyException("insert 실패");
		} finally {
			session.close();
		}
		return n;
	}
	
	public HashMap selectHashMap(int deptno)throws MyException {
		MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		HashMap map = null;
		try {
			map = dao.selectHashMap(session, deptno);
		} catch (Exception e) {
			// e.printStackTrace();
			throw new MyException("selectHashMap 실패");
		} finally {
			session.close();
		}
		return map;
	}//end 
	public HashMap selectJoin(String ename)throws MyException {
		MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		HashMap map = null;
		try {
			map = dao.selectJoin(session, ename);
		} catch (Exception e) {
			 e.printStackTrace();
			throw new MyException("selectHashMap 실패");
		} finally {
			session.close();
		}
		return map;
	}//end 
	
    public List<Dept> selectByDnameLoc(HashMap<String, String> map)
    		throws MyException{
		
		MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		List<Dept> list = null;
		try {
			list = dao.selectByDnameLoc(session,map);
		} catch (Exception e) {
			// e.printStackTrace();
			throw new MyException("selectByDnameLoc 실패");
		} finally {
			session.close();
		}
		return list;
	}//end 
	
    public List<Dept> selectPaging(int sIndex, int length)
    		throws MyException{
    	MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		List<Dept> list = null;
		try {
			list = dao.selectPaging(session,sIndex,length);
		} catch (Exception e) {
			// e.printStackTrace();
			throw new MyException("selectPaging 실패");
		} finally {
			session.close();
		}
		return list;
    }//
    
    public List<Dept> selectByDname(String dname)throws MyException{
    	MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		List<Dept> list = null;
		try {
			list = dao.selectByDname(session,dname);
		} catch (Exception e) {
			e.printStackTrace();
			throw new MyException("selectByDname 실패");
		} finally {
			session.close();
		}
		return list;
    }//
    public List<Dept> selectByDnameChoose(String dname)throws MyException{
    	MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		List<Dept> list = null;
		try {
			list = dao.selectByDnameChoose(session,dname);
		} catch (Exception e) {
			e.printStackTrace();
			throw new MyException("selectByDnameChoose 실패");
		} finally {
			session.close();
		}
		return list;
    }//
    
    public List<Dept> selectByDnameWhere(String dname)throws MyException{
    	MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		List<Dept> list = null;
		try {
			list = dao.selectByDnameWhere(session,dname);
		} catch (Exception e) {
			e.printStackTrace();
			throw new MyException("selectByDnameWhere 실패");
		} finally {
			session.close();
		}
		return list;
    }//
    
    public List<Dept> selectByDnameWhere2(String dname,String loc)throws MyException{
    	MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		List<Dept> list = null;
		try {
			list = dao.selectByDnameWhere2(session,dname,loc);
		} catch (Exception e) {
			e.printStackTrace();
			throw new MyException("selectByDnameWhere2 실패");
		} finally {
			session.close();
		}
		return list;
    }//
    
    public void updateDept(Dept dept) throws MyException {
		MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		try {
			int n = dao.updateDept(session, dept);
			if (n == 1) {
				session.commit();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			throw new MyException("updateDept 실패");
		} finally {
			session.close();
		}

	}// end
    
    public List<Dept> selectByMultiDeptno(ArrayList<Integer> xxx)throws MyException{
    	MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		List<Dept> list = null;
		try {
			list = dao.selectByMultiDeptno(session,xxx);
		} catch (Exception e) {
			e.printStackTrace();
			throw new MyException("selectByMultiDeptno 실패");
		} finally {
			session.close();
		}
		return list;
    }//
    
    public void multiInsert(ArrayList<Dept> multi) throws MyException {
		MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		try {
			int n = dao.multiInsert(session, multi);
			if (n == multi.size()) {
				session.commit();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			throw new MyException("multiInsert 실패");
		} finally {
			session.close();
		}

	}// end
   
    
    public void multiDelete(ArrayList<Dept> multi) throws MyException {
		MyBatisDAO dao = new MyBatisDAO();
		SqlSession session = MyBatisTemplate.openSession();
		try {
			int n = dao.multiDelete(session, multi);
			if (n == multi.size()) {
				session.commit();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			throw new MyException("multiDelete 실패");
		} finally {
			session.close();
		}

	}// end
    
    
    
    
    
    
}//end class
