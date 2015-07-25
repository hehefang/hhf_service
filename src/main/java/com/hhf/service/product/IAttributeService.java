package com.hhf.service.product;

import java.util.List;
import java.util.Map;

import com.hhf.common.mybatis.Page;
import com.hhf.model.product.AttrAttrValue;
import com.hhf.model.product.Attribute;
import com.hhf.model.product.AttributeValue;
import com.hhf.model.product.vo.AttrAttrValueVO;


/**
 * 品牌管理服务
 */
public interface IAttributeService {

	/**
     * 新增属性名信息
     * @param attrbute
     * @return 0:失败,正数：数据的自增ID
     */
    public Long insertAttribute(Attribute attrbute);

    /**
     * 根据ID删除
     * @param attrId
     * @return 1:成功,0:失败,-1:属性已关联类目不能删除
     */
    public int deleteAttributeById(Long attrId);
    
    /**
     * 根据属性ID查询
     * @param attrId 属性ID
     * @return
     */
    public Attribute getAttributeById(Long attrId);
    
    /**
     * 根据属性名称精确查询
     * @param attrName 属性名称
     * @return
     */
    public Attribute getAttributeByName(String attrName, String status);
    
    /**
   	 * @param map 查询条件(或名称不为空则匹配以名称开头的即name%)
   	 * @return
   	 */
   	public List<Attribute> getAttributes(Map<?, ?> map);
   	
    /**
     * 按属性名模糊分页查询
	 * @param map 查询条件
	 * @param page 分页信息
	 * @return
	 */
	public Page<Attribute> getAttributeByPage(Map<?, ?> map, Page<Attribute> page);
	
    /**
     * 修改属性名信息
     * @param attrbute
     * @return
     */
	public boolean updateAttributeById(Attribute attrbute);
	
	
	
	/*－－－－－－－－－－－－－－－－－－－－－属性属性值关系接口－－－－－－－－－－－－－－－－－－－－－－*/
	/**
	 * 删除指定ID的关系,sub为true则同事删除子关系
     * @param aAvId 属性和属性值关系ID
     * @param sub true:删除,false:不删除
     * @return
     */
    boolean deleteAttrAttrValueById(Long aAvId, Boolean sub);
    
    /**
	 * @param attrAttrValue
	 * @return 成功:属性和属性值关系ID,否则:0
	 */
	Long insertAttrAttrValue(AttrAttrValue attrAttrValue);
	
	/**
	 * @param attrAttrValue
	 * @return 
	 */
	boolean updateAttrAttrValueById(AttrAttrValue attrAttrValue);
	
	/**
	 * @param aAvId 
	 * @return
	 */
	AttrAttrValue getAttrAttrValueById(Long aAvId);
	
	/**
	 * @param attrId 属性ID
	 * @param attrValueId 属性值ID
	 * @return
	 */
	AttrAttrValue getAttrAttrValueByAttrIdAndAVId(Long attrId, Long attrValueId);
	
	/**
	 * @param pAAvId 父关系ID
	 * @param attrValueId 属性值ID
	 * @return
	 */
	AttrAttrValue getAttrAttrValueByPAAvIdAndAVId(Long pAAvId, Long attrValueId);
	
	/**
	 * @param attrId 属性ID
	 * @param sub true:加载子属性
	 * @return
	 */
	List<AttrAttrValueVO> getAttrAttrValueByAttrId(Long attrId, Boolean sub);
	
	/**
	 * @param pAAvId 属性和属性值关系父ID
	 * @return
	 */
	List<AttrAttrValueVO> getAttrAttrValueByPAAvId(Long pAAvId);
	
	/**
     * @param flag 0:按属性,1:按父属性和值
	 * @param sAAvId 原ID
	 * @param dAAvId 目标ID
     * @return
     */
    boolean updateAttrAttrValueOrders(Integer flag, Long sAAvId, Long dAAvId);
	
	/*－－－－－－－－－－－－－－－－－－－－－属性属性值关系接口－－－－－－－－－－－－－－－－－－－－－*/
	
	/**
     * 删除属性值
     * @param attrValueId 属性值ID
     * @return 1:成功,0:失败,-1:属性值已关联属性不允许删除
     */
    int deleteAttributeValueById(Long attrValueId);

    /**
     * 插入属性值
     * @param attrValue
     * @return 0:失败,正数：数据的自增ID
     */
    Long insertAttributeValue(AttributeValue attrValue);

    /**
     * 根据ID获取
     * @param attrValueId 属性名ID
     * @return
     */
    AttributeValue getAttributeValueById(Long attrValueId);
    
    /**
     * @param attrValueName 属性名 精确匹配
     * @param status 状态 1：有效,0：无效
     * @return
     */
    AttributeValue getAttributeValueByName(String attrValueName, String status);
    
    /**
     * 根据条件模糊查询
     * @param map 查询条件
     * @return
     */
    List<AttributeValue> getAttributeValues(Map<?, ?> map);
    
    /**
     * 根据条件模糊分页查询
     * @param map 查询条件
     * @param page 分页信息
     * @return
     */
    Page<AttributeValue> getAttributeValueByPage(Map<?, ?> map, Page<AttributeValue> page);

    /**
     * 修改属性值 
     * @param attrValue
     * @return
     */
    boolean updateAttributeValueById(AttributeValue attrValue);
	
}
