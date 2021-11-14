package com.zhoudu.dao;

import com.zhoudu.domain.GoodsShippingAddress;
import com.zhoudu.domain.GoodsShippingAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsShippingAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    long countByExample(GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int deleteByExample(GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int insert(GoodsShippingAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int insertSelective(GoodsShippingAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    List<GoodsShippingAddress> selectByExampleWithBLOBs(GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    List<GoodsShippingAddress> selectByExample(GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    GoodsShippingAddress selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByExampleSelective(@Param("record") GoodsShippingAddress record, @Param("example") GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByExampleWithBLOBs(@Param("record") GoodsShippingAddress record, @Param("example") GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByExample(@Param("record") GoodsShippingAddress record, @Param("example") GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(GoodsShippingAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByPrimaryKeyWithBLOBs(GoodsShippingAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByPrimaryKey(GoodsShippingAddress record);
}