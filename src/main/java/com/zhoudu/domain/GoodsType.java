package com.zhoudu.domain;

public class GoodsType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.id
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.name
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.pid
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.id
     *
     * @return the value of goods_type.id
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.id
     *
     * @param id the value for goods_type.id
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.name
     *
     * @return the value of goods_type.name
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.name
     *
     * @param name the value for goods_type.name
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.pid
     *
     * @return the value of goods_type.pid
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.pid
     *
     * @param pid the value for goods_type.pid
     *
     * @mbg.generated Sat Oct 23 18:42:50 GMT+08:00 2021
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}