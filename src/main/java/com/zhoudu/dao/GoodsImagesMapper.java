package com.zhoudu.dao;

import com.zhoudu.domain.GoodsImages;
import com.zhoudu.domain.GoodsImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsImagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_images
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    long countByExample(GoodsImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_images
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int deleteByExample(GoodsImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_images
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_images
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int insert(GoodsImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_images
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int insertSelective(GoodsImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_images
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    List<GoodsImages> selectByExample(GoodsImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_images
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    GoodsImages selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_images
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByExampleSelective(@Param("record") GoodsImages record, @Param("example") GoodsImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_images
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByExample(@Param("record") GoodsImages record, @Param("example") GoodsImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_images
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(GoodsImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_images
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    int updateByPrimaryKey(GoodsImages record);
}