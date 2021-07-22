package cn.edu.cxtc.service;
//ҵ��㣬���Էֳɽӿ����ʵ���࣬������븴���Ժ�ά����
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.edu.cxtc.dao.CityDao;
import cn.edu.cxtc.po.City;

@Service
public class CityService {
	//�����Ա���������������캯�����б�ע������Զ�װ��Ĺ���, ͨ�� @Autowired��ʹ�������� set ��get����
	//ע��ע��citydao
	@Autowired
	private CityDao cityDao;// ��IOC AOP��ע��dao��Ķ��󣬱��ں���ʹ��//����ע�루ע�ⷽʽ��

	// ��ѯ���м�¼
	public List<City> findAll() {
		return cityDao.findAll();
	}
	//��ѯ������¼
	public City findOne(Integer id) {
		return cityDao.findOne(id);
	}
	//����һ������
	public int add(City city) {
		return cityDao.add(city);
	}
	//�޸�һ������
	public int update(City city) {
		return cityDao.update(city);
	}
	// ɾ��
	public int delete(Integer id) {
		return cityDao.delete(id);
	}

}
