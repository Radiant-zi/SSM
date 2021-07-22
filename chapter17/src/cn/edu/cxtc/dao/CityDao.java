package cn.edu.cxtc.dao;
//数据访问层，实现和数据库直接交互的接口
import java.util.List;

import cn.edu.cxtc.po.City;

public interface CityDao {
	//查询全部
	public List<City> findAll();
	// 通过id查询一条记录
	public City findOne(Integer id);
	//添加一条数据
	public Integer add(City a);
	//修改数据
	public Integer update(City a);
	//删除数据
	public Integer delete(int id);

}
