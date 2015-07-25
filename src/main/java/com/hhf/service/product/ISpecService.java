package com.hhf.service.product;

import java.util.List;
import java.util.Map;

import com.hhf.common.mybatis.Page;
import com.hhf.model.product.Spec;
import com.hhf.model.product.SpecSpecValue;
import com.hhf.model.product.SpecValue;
import com.hhf.model.product.vo.SpecSpecValueVO;


/**
 * 品牌管理服务
 */
public interface ISpecService {

/*－－－－－－－－－－－－－－－－－－－－－规格相关信息接口－－－－开始－－－－－－－－－－－－－－－－－－－－－*/
	
	/**
	 * 新增规格名称
	 * @param spec
	 * @return 0:失败,正数：数据的自增ID
	 */
	public Long insertSpec(Spec spec);
	
    /**
     * 删除规格信息
     * @param specId
     * @return 1:成功,0:失败,-1:规格已关联类目不能删除
     */
	public int deleteSpecById(Long specId);


    /**
     * 根据规格ID获取规格信息
     * @param specId
     * @return
     */
    public Spec getSpecById(Long specId);

    /**
     * 根据规格名称精确查询
     * @param name 规格名称
     * @return
     */
    public Spec getSpecByName(String name, String status);
    
    /**
     * 按规格名模糊分页查询
	 * @param specName 规格名
	 * @param page 分页信息
	 * @return
	 */
	public Page<Spec> getSpecByPage(Map<?, ?> map, Page<Spec> page);
	
	/**
	 * @param map
	 * @return
	 */
	public List<Spec> getSpecs(Map<?, ?> map);

	/**
	 * 根据规格ID修改规格信息
	 * @param spec
	 * @return
	 */
	public boolean updateSpecById(Spec spec);
	
	/*－－－－－－－－－－－－－－－－－－－－－规格相关信息接口－－－－结束－－－－－－－－－－－－－－－－－－－－－*/
	
	/*－－－－－－－－－－－－－－－－－－－－－规格值接口－－－－开始－－－－－－－－－－－－－－－－－－－－－*/
	/**
	 * @param specValueId 规格值ID
	 * @return 0:失败,1:成功,-1:已关联类目
	 */
	int deleteSpecValueById(Long specValueId);

    /**
     * 插入全部字段
     * @param SpecValue
     * @return 规格值ID
     */
    Long insertSpecValue(SpecValue SpecValue);

    /**
     * 获取规格值信息
     * @param specValueId
     * @return
     */
    SpecValue getSpecValueById(Long specValueId);
    
    /**
     * @param specValueName 规格值名称
     * @param status 状态
     * @return
     */
    List<SpecValue> getSpecValueByName(String specValueName, String status);
    
    /**
     * @param map 查询条件
     * @return
     */
    List<SpecValue> getSpecValues(Map<?, ?> map);

    /**
     * @param map 查询条件
     * @param page
     * @return
     */
    Page<SpecValue> getSpecValueByPage(Map<?, ?> map, Page<SpecValue> page);

    /**
     * 修改不为空的字段值信息
     * @param SpecValue
     * @return
     */
    boolean updateSpecValueById(SpecValue SpecValue);
    
	/*－－－－－－－－－－－－－－－－－－－－－规格值接口－－－－结束－－－－－－－－－－－－－－－－－－－－－*/
    /*－－－－－－－－－－－－－－－－－－－－－规格规格值接口－－－－开始－－－－－－－－－－－－－－－－－－－－－*/
    /**
     * @param specSpecValue
     * @return
     */
    Long insertSpecSpecValue(SpecSpecValue specSpecValue);
 
    /**
     * @param sSVId
     * @return
     */
    boolean deleteSpecSpecValueById(Long sSVId);
    
    /**
     * @param sSVIds
     * @return
     */
    int deleteSpecSpecValuesById(List<Long> sSVIds);
    
    /**
     * @param specId
     * @return
     */
    List<SpecSpecValueVO> getSpecSpecValueByspecId(Long specId);
    
    /**
     * 检查规格名和规格值关系是否存在
     * @param specId 
     * @param specValueId
     * @return
     */
    SpecSpecValue getSpecSpecValueBySpecIdAndSpecValueId(Long specId, Long specValueId);
    
    /**
     * 规格规格值排序
     * @param sssvId 
     * @param dssvId
     * @return
     */
    public boolean updateSpecSpecValueOrder(Long sssvId, Long dssvId);
    
    /*－－－－－－－－－－－－－－－－－－－－－规格规格值接口－－－－结束－－－－－－－－－－－－－－－－－－－－－*/
	
}
