package cn.edu.cxtc.dao;
//���ݷ��ʲ㣬ʵ�ֺ����ݿ�ֱ�ӽ����Ľӿ�
import java.util.List;

import cn.edu.cxtc.po.City;

public interface CityDao {
	//��ѯȫ��
	public List<City> findAll();
	// ͨ��id��ѯһ����¼
	public City findOne(Integer id);
	//���һ������
	public Integer add(City a);
	//�޸�����
	public Integer update(City a);
	//ɾ������
	public Integer delete(int id);

}
