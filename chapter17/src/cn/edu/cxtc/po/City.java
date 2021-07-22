package cn.edu.cxtc.po;
//对应数据库中的一张表、实体类
public class City {
	
	private Integer id;
	private String name;
	private String countrycode;
	private String district;
	private Integer population;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", countrycode=" + countrycode + ", district=" + district
				+ ", population=" + population + "]";
	}
}
