package com.hhf.service.product;

import java.util.List;
import java.util.Map;

import com.hhf.common.mybatis.Page;
import com.hhf.model.product.Brand;


/**
 * 品牌管理服务
 */
public interface IBrandService {

    /**
	 * @param brand 
	 * @return 成功返回ID
	 */
	Long insertBrand(Brand brand);

	boolean updateByBrandId(Brand record);
	
	/**
	 * @param brandId 品牌ID
	 * @return 1:成功,-1:卖家已申请不允许删除,0:失败
	 */
	int deleteByBrandId(Long brandId);
	
	Brand getByBrandId(Long brandId);
	
	/**
	 * @param brandName 中文名 精确匹配
	 * @param brandEname 英文名  精确匹配
	 * @param status 1:有效,0:无效
	 * @return
	 */
	Brand getBrandByName(String brandName, String brandEname, String status);
	
	/**
	 * 根据名称模糊查询(中文名或英文名)
	 * @param name
	 * @return 
	 */
	public List<Brand> getBrandsByName(String name);
	
	/**
	 * 根据名称精确查询(先查中文名再查英文名)
	 * @param name 
	 * @return 
	 */
	public Brand getBrandByName(String name);
	
	public Page<Brand> getBrandsByPage(Map<?, ?> map, Page<Brand> page);
}
