package org.jlobato.gpro.dao.mybatis.model;

import java.io.Serializable;

public class TyreBrand implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tyre_brand.id_tyre_brand
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    private Short idTyreBrand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tyre_brand.tyre_brand_name
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    private String tyreBrandName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tyre_brand.tyre_brand_code
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    private String tyreBrandCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tyre_brand
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tyre_brand.id_tyre_brand
     *
     * @return the value of tyre_brand.id_tyre_brand
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public Short getIdTyreBrand() {
        return idTyreBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyre_brand
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public TyreBrand withIdTyreBrand(Short idTyreBrand) {
        this.setIdTyreBrand(idTyreBrand);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tyre_brand.id_tyre_brand
     *
     * @param idTyreBrand the value for tyre_brand.id_tyre_brand
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public void setIdTyreBrand(Short idTyreBrand) {
        this.idTyreBrand = idTyreBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tyre_brand.tyre_brand_name
     *
     * @return the value of tyre_brand.tyre_brand_name
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public String getTyreBrandName() {
        return tyreBrandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyre_brand
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public TyreBrand withTyreBrandName(String tyreBrandName) {
        this.setTyreBrandName(tyreBrandName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tyre_brand.tyre_brand_name
     *
     * @param tyreBrandName the value for tyre_brand.tyre_brand_name
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public void setTyreBrandName(String tyreBrandName) {
        this.tyreBrandName = tyreBrandName == null ? null : tyreBrandName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tyre_brand.tyre_brand_code
     *
     * @return the value of tyre_brand.tyre_brand_code
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public String getTyreBrandCode() {
        return tyreBrandCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyre_brand
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public TyreBrand withTyreBrandCode(String tyreBrandCode) {
        this.setTyreBrandCode(tyreBrandCode);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tyre_brand.tyre_brand_code
     *
     * @param tyreBrandCode the value for tyre_brand.tyre_brand_code
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public void setTyreBrandCode(String tyreBrandCode) {
        this.tyreBrandCode = tyreBrandCode == null ? null : tyreBrandCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyre_brand
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idTyreBrand=").append(idTyreBrand);
        sb.append(", tyreBrandName=").append(tyreBrandName);
        sb.append(", tyreBrandCode=").append(tyreBrandCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}