package org.jlobato.gpro.dao.mybatis.model;

import java.io.Serializable;

public class TyreBrandWithBLOBs extends TyreBrand implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tyre_brand.tyre_brand_image
     *
     * @mbg.generated Sun Oct 16 16:30:16 CEST 2022
     */
    private byte[] tyreBrandImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tyre_brand.tyre_brand_icon
     *
     * @mbg.generated Sun Oct 16 16:30:16 CEST 2022
     */
    private byte[] tyreBrandIcon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tyre_brand
     *
     * @mbg.generated Sun Oct 16 16:30:16 CEST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tyre_brand.tyre_brand_image
     *
     * @return the value of tyre_brand.tyre_brand_image
     *
     * @mbg.generated Sun Oct 16 16:30:16 CEST 2022
     */
    public byte[] getTyreBrandImage() {
        return tyreBrandImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyre_brand
     *
     * @mbg.generated Sun Oct 16 16:30:16 CEST 2022
     */
    public TyreBrandWithBLOBs withTyreBrandImage(byte[] tyreBrandImage) {
        this.setTyreBrandImage(tyreBrandImage);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tyre_brand.tyre_brand_image
     *
     * @param tyreBrandImage the value for tyre_brand.tyre_brand_image
     *
     * @mbg.generated Sun Oct 16 16:30:16 CEST 2022
     */
    public void setTyreBrandImage(byte[] tyreBrandImage) {
        this.tyreBrandImage = tyreBrandImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tyre_brand.tyre_brand_icon
     *
     * @return the value of tyre_brand.tyre_brand_icon
     *
     * @mbg.generated Sun Oct 16 16:30:16 CEST 2022
     */
    public byte[] getTyreBrandIcon() {
        return tyreBrandIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyre_brand
     *
     * @mbg.generated Sun Oct 16 16:30:16 CEST 2022
     */
    public TyreBrandWithBLOBs withTyreBrandIcon(byte[] tyreBrandIcon) {
        this.setTyreBrandIcon(tyreBrandIcon);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tyre_brand.tyre_brand_icon
     *
     * @param tyreBrandIcon the value for tyre_brand.tyre_brand_icon
     *
     * @mbg.generated Sun Oct 16 16:30:16 CEST 2022
     */
    public void setTyreBrandIcon(byte[] tyreBrandIcon) {
        this.tyreBrandIcon = tyreBrandIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyre_brand
     *
     * @mbg.generated Sun Oct 16 16:30:16 CEST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tyreBrandImage=").append(tyreBrandImage);
        sb.append(", tyreBrandIcon=").append(tyreBrandIcon);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}