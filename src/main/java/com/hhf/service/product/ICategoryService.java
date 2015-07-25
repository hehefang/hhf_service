package com.hhf.service.product;

import java.util.List;
import com.hhf.model.product.BaseCategory;
import com.hhf.model.product.BcAttrValue;
import com.hhf.model.product.BcAttribute;
import com.hhf.model.product.BcSpec;
import com.hhf.model.product.BcSpecValue;
import com.hhf.model.product.vo.BaseCategoryInfoVO;
import com.hhf.model.product.vo.BcAttrValueVO;
import com.hhf.model.product.vo.BcAttributeVO;
import com.hhf.model.product.vo.BcSpecVO;



public interface ICategoryService {
	
	/*－－－－－－－－－－－－－－－－－－－－－基本类目,签约类目,销售类目接口－－－－－－－－－－－－－－－－－－－－－－－－－*/
	
	/**
	 * 按层级结构获取所有的基本类目
	 * @param status 0:无效,1:有效
	 * @return
	 */
	public List<BaseCategory> getAllBaseCategory(String status);
	
	/**
	 * 获取指定类目的一级子类目
	 * @param pId 基本类目ID
	 * @return
	 */
	public List<BaseCategory> getBaseCategorysByPId(Integer pId, String status);
	
	
	/**
	 * @param flag 1:一级编码,2:二级编码,3:三级编码
	 * @param pId 父ID
	 * @return -1:编码越过预定,否则基础类目新编码
	 */
	public String getCodeByPid(int flag, Integer pId);
	
	/**
	 * @param name 基本类目名称
	 * @param pId 父类目ID
	 * @param status 0:无效,1:有效
	 * @return
	 */
	public BaseCategory getBaseCategoryByNameAndPid(Integer pId, String name, String status);
	
	/**
	 * @param bcName 类目名称
	 * @param pathName 父类目名称
	 * @param status
	 * @return
	 */
	public BaseCategory getBaseCategoryByName(String bcName, String pathName, String status);
	
	/**
	 * 删除指定的基本类目
	 * @param bcId
	 * @return 1:成功,0:失败,-1:存在子类目不允许删除-2:类目不存在
	 */
	public int deleteByBcId(Integer bcId);
	
	/**
	 * 获取基本类目及对应的属性和规格相关信息
	 * @param bcId 基本类目ID
	 * @return
	 */
	public BaseCategoryInfoVO getBaseCategoryInfoByBcId(Integer bcId);
	
	/**
	 * 获取指定的基本类目的基本信息
	 * @param bcId
	 * @return
	 */
	public BaseCategory getByBcId(Integer bcId);
	
	/**
	 * 交换两个基本类目的顺序
	 * @param sccId 
	 * @param dccId
	 * @return 1:成功,0:失败
	 */
	public int updateBcDisplayOrder(Integer sbcId, Integer dbcId);

	/**
	 * 保存基本品类信息
	 * @param category
	 * @return 0:失败,正数：数据的自增ID
	 */
	public Integer insertBaseCategory(BaseCategory category);

    /**
     * 根据对象ID更新基本类目属性
     * @param category
     * @return
     */
	public boolean updateBaseCategory(BaseCategory category);
	
	/*－－－－－－－－－－－－－－－－－－－－－类目属性关系和值关系接口－－－－－－－－－－－－－－－－－－－－－－－－－*/
	
	/**
     * 插入类目属性
     * @param bcAttr
     * @return 0:失败,-1:已关联,正数：数据的自增ID
     */
	public Long insertBcAttribute(BcAttribute bcAttr);
    
    /**
     * 根据ID删除
     * @param bcAttrIds
     * @return 1:成功,0:失败
     */
	public int deleteBcAttributeById(Long... bcAttrIds);

    /**
     * 更新信息
     * @param bcAttr
     * @return
     */
	public boolean updateBcAttributeById(BcAttribute bcAttr);

    /**
     * 获取类目配置信息
     * @param bcAttrId
     * @return
     */
	public BcAttribute getBcAttributeById(Long bcAttrId);
	
	/**
     * 获取类目的属性名列表
     * @param bcId 类目ID
     * @param status
     * @return
     */
    List<BcAttributeVO> getBcAttributeByBcId(Integer bcId, String status);

    /**
     * @param sbcaId
     * @param dbcaId
     * @return
     */
    public boolean updateBcAttributeOrder(Long sbcaId, Long dbcaId);
	
	
	/**
	 * 根据属性值ID获取关联的类目属性关系ID列表
	 * @param attrValueId 属性值ID
	 * @return 
	 */
	List<BcAttrValue> getBcAttrValueByAttrValueId(Long attrValueId);
    
    /**
	 * 根据ID获取属性值信息
	 * @param bcAvId
	 * @return
	 */
    public BcAttrValue getBcAttrValueById(Long bcAvId);
	
	/**
	 * 获取类目属性的所有一级值
	 * @param bcAttrId 类目属性关系ID
	 * @param sub true:加载子属性值,false:不加载
	 * @return
	 */
    public List<BcAttrValueVO> getBcAttrValueByBcAttrId(Long bcAttrId, String status, boolean sub);
	
	
	/**
	 * 获取指定属性值ID的子属性列表
	 * @param pBcAvId 父属性值ID
	 * @param status
	 * @return
	 */
    public List<BcAttrValueVO> getBcAttrValueByPBcAvId(Long pBcAvId, String status);
    
    /**
     * 删除指定ID的属性值
     * @param bcAvId
     * @return 1:成功,0:失败
     */
    public int deleteBcAttrValueById(Long bcAvId);

    /**
     * 插入属性值信息
     * @param bcAttrValue
     * @return 0:失败,-1:已存在,正数：数据的自增ID
     */
    public Long insertBcAttrValue(BcAttrValue bcAttrValue);
    
    /**
     * 插入类目属性值关系信息，如果相关的未插入一并插入
     * @param bcAttrValue
     * @param attrId 属性ID
     * @param pAvId 父属性值ID
     * @return 0:失败,-1:已存在,成功：属性类目关系ID,-2:信息不全
     */
    public Long insertBcAttrValue(BcAttrValue bcAttrValue, Long attrId, Long pAvId);

    /**
     * 更新属性值信息
     * @param bcAttrValue
     * @return
     */
    public boolean updateBcAttrValueById(BcAttrValue bcAttrValue);
    
    /**
     * @param flag 0:按类目属性关系,1:按父类目属性关系值ID
	 * @param sBcAvId 原ID
	 * @param dBcAvId 目标ID
     * @return
     */
    boolean updateBcAttrValueOrders(Integer flag, Long sBcAvId, Long dBcAvId);
    
    /*－－－－－－－－－－－－－－－－－－－－－类目规格关系和值接口－－－－－－－－－－－－－－－－－－－－－－－－－*/
    
    /**
     * 插入类目规格
     * @param bcSpec
     * @return 0:失败,正数：数据的自增ID
     */
    public Long insertBcSpec(BcSpec bcSpec);
    
    /**
     * 根据ID删除
     * @param bcSpecId
     * @return 1:成功,0:失败,-1:有规格值不能删除
     */
    public int deleteBcSpecById(Long bcSpecId);

    /**
     * 删除类目规格,同时删除类目规格值
     * @param bcSpecId
     * @return
     */
    public boolean deleteBcSpecByIdForce(Long bcSpecId);

    /**
     * 更新信息
     * @param bcSpec
     * @return
     */
    public boolean updateBcSpecById(BcSpec bcSpec);

    /**
     * 获取类目配置信息
     * @param bcSpecId
     * @return
     */
    public BcSpec getBcSpecById(Long bcSpecId);
    
    /**
     * 获取指定类目的规格名称列表
     * @param bcId 类目ID
     * @param status 
     * @return
     */
    List<BcSpecVO> getBcSpecByBcId(Integer bcId, String status);
    
    /**
     * 类目规格排序
     * @param sbcsId 
     * @param dbcsId
     * @return
     */
    public boolean updateBcSpecOrder(Long sbcsId, Long dbcsId);
    
    
    /**
     * @param specValueId 规格值ID
     * @param status 0:无效,1:有效
     * @return
     */
    public List<BcSpecValue> getBcSpecValueBySpecValueId(Long specValueId, String status);
    
    /**
	 * 增加规格值信息
	 * @param bcSpecValue
	 * @return 0:失败,正数：数据的自增ID
	 */
    public Long insertBcSpecValue(BcSpecValue bcSpecValue);
	
    /**
     * 删除规格值信息(逻辑删除)
     * @param bcSvId
     * @return
     */
    public boolean deleteBcSpecValueById(Long bcSvId);


    /**根据主键ID获取规格值信息
     * @param bcSvId
     * @return
     */
    public BcSpecValue getBcSpecValueById(Long bcSvId);
    
    /**
     * 根据类目规格关系ID获取该规格值列表信息
     * @param bcSvId
     * @return
     */
    public List<BcSpecValue> getBcSpecValueByBcSpecId(Long bcSpecId, String status);

    
    /**
     * 修改规格值信息
     * @param bcSpecValue
     * @return
     */
    public boolean updateBcSpecValueById(BcSpecValue bcSpecValue);
    
    /**
     * 修改类目规格值表里冗余的规格值名和图片url
     * @param specValueId
     * @param specValueName
     * @param imgUrl
     * @return
     */
    public int updateBcSpecValueBySpecValueId(Long specValueId, String specValueName, String imgUrl);
    
    /**
     * 类目规格值排序
     * @param sbcsvId 
     * @param dbcsvId
     * @return
     */
    public boolean updateBcSpecValueOrder(Long sbcsvId, Long dbcsvId);
}
