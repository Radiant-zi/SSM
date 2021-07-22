package cn.edu.cxtc.service;
//业务层，可以分成接口类和实现类，方便代码复用性和维护性
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.edu.cxtc.dao.CityDao;
import cn.edu.cxtc.po.City;

@Service
public class CityService {
	//对类成员变量、方法及构造函数进行标注，完成自动装配的工作, 通过 @Autowired的使用来消除 set ，get方法
	//注解注入citydao
	@Autowired
	private CityDao cityDao;// （IOC AOP）注入dao层的对象，便于后面使用//依赖注入（注解方式）

	// 查询所有记录
	public List<City> findAll() {
		return cityDao.findAll();
	}
	//查询单条记录
	public City findOne(Integer id) {
		return cityDao.findOne(id);
	}
	//增加一条数据
	public int add(City city) {
		return cityDao.add(city);
	}
	//修改一条数据
	public int update(City city) {
		return cityDao.update(city);
	}
	// 删除
	public int delete(Integer id) {
		return cityDao.delete(id);
	}

}
