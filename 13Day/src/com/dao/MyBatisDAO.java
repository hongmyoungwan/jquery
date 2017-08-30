package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class MyBatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		List<Dept> list = session.selectList("com.aaa.selectAll");
		return list;
	}

	public Dept select(SqlSession session, int deptno) {

		Dept dept = session.selectOne("com.aaa.selectByDeptno", deptno);
		return dept;
	}// end

	public int insert(SqlSession session, Dept dept) {

		int n = session.insert("com.aaa.a", dept);
		return n;
	}

	public int delete(SqlSession session, int deptno) {

		int n = session.delete("com.aaa.deleteByDeptno", deptno);
		return n;
	}//

	public int update(SqlSession session, Dept dept) {

		int n = session.update("com.aaa.updateByDeptno", dept);
		return n;
	}

	// 레코드 갯수
	public int deptCount(SqlSession session) {
		int n = session.selectOne("com.bbb.deptCount");
		return n;
	}

	public HashMap selectHashMap(SqlSession session, int deptno) {

		HashMap map = (HashMap) session.selectOne("com.bbb.selectByDeptno", deptno);
		return map;
	}// end

	public HashMap selectJoin(SqlSession session, String ename) {

		HashMap map = (HashMap) session.selectOne("com.bbb.selectJoin", ename);
		return map;
	}// end

	public List<Dept> selectByDnameLoc(
			 SqlSession session, HashMap<String, String> map) {

		List<Dept> list = session.selectList(
				 "com.bbb.selectByDnameLoc", map);
		return list;
	}//end 

	public List<Dept> selectPaging(
			 SqlSession session, int sIndex, int length) {

		List<Dept> list = session.selectList(
				 "com.bbb.selectPaging", null, 
				 new RowBounds(sIndex, length));
		return list;
	}//end 
	
	public List<Dept> selectByDname(
			 SqlSession session, String dname) {
		HashMap<String, String> map =
				new HashMap<>();
		map.put("dname", dname);
		List<Dept> list = session.selectList(
				 "com.ccc.selectByDname", map);
		return list;
	}//end 
	
	public List<Dept> selectByDnameChoose(
			 SqlSession session, String dname) {
		HashMap<String, String> map =
				new HashMap<>();
		map.put("dname", dname);
		List<Dept> list = session.selectList(
				 "com.ccc.selectByDnameChoose", map);
		return list;
	}//end 
	
	public List<Dept> selectByDnameWhere(
			 SqlSession session, String dname) {
		HashMap<String, String> map =
				new HashMap<>();
		map.put("dname", dname);
		List<Dept> list = session.selectList(
				 "com.ccc.selectByDnameWhere", map);
		return list;
	}//end 
	public List<Dept> selectByDnameWhere2(
			 SqlSession session, String dname , String loc) {
		HashMap<String, String> map =
				new HashMap<>();
		map.put("dname", dname);
		map.put("loc", loc);
		List<Dept> list = session.selectList(
				 "com.ccc.selectByDnameWhere2", map);
		return list;
	}//end 
	
	public int updateDept(SqlSession session, Dept dept) {

		int n = session.update("com.ddd.updateDept", dept);
		return n;
	}
	
	
	public List<Dept> selectByMultiDeptno(
			 SqlSession session, ArrayList<Integer> xxx) {
		List<Dept> list = session.selectList(
				 "com.ddd.selectByMultiDeptno", xxx);
		return list;
	}//end 
	
	public int multiInsert(SqlSession session, ArrayList<Dept> multi) {

		int n = session.insert("com.ddd.multiInsert", multi);
		return n;
	}
	
	public int multiDelete(SqlSession session, ArrayList<Dept> multi) {

		int n = session.delete("com.ddd.multiDelete", multi);
		return n;
	}
}//end class





