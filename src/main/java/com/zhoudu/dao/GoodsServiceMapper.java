package com.zhoudu.dao;

import com.zhoudu.domain.GoodsService;
import com.zhoudu.domain.GoodsServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsServiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    long countByExample(GoodsServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int deleteByExample(GoodsServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int insert(GoodsService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int insertSelective(GoodsService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    List<GoodsService> selectByExample(GoodsServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    GoodsService selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByExampleSelective(@Param("record") GoodsService record, @Param("example") GoodsServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByExample(@Param("record") GoodsService record, @Param("example") GoodsServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(GoodsService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByPrimaryKey(GoodsService record);
}