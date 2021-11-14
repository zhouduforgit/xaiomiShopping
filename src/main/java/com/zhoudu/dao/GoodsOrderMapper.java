package com.zhoudu.dao;

import com.zhoudu.domain.GoodsOrder;
import com.zhoudu.domain.GoodsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    long countByExample(GoodsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int deleteByExample(GoodsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int insert(GoodsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int insertSelective(GoodsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    List<GoodsOrder> selectByExample(GoodsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    GoodsOrder selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByExampleSelective(@Param("record") GoodsOrder record, @Param("example") GoodsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByExample(@Param("record") GoodsOrder record, @Param("example") GoodsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(GoodsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByPrimaryKey(GoodsOrder record);
}