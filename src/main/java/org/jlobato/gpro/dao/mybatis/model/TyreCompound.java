package org.jlobato.gpro.dao.mybatis.model;

import java.io.Serializable;

public class TyreCompound implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tyrecompound.id_tyrecompound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private Integer idTyrecompound;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tyrecompound.cod_compound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private String codCompound;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tyrecompound.description_compound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private String descriptionCompound;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tyrecompound.sort_order
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private Short sortOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tyrecompound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tyrecompound.id_tyrecompound
     *
     * @return the value of tyrecompound.id_tyrecompound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Integer getIdTyrecompound() {
        return idTyrecompound;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyrecompound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public TyreCompound withIdTyrecompound(Integer idTyrecompound) {
        this.setIdTyrecompound(idTyrecompound);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tyrecompound.id_tyrecompound
     *
     * @param idTyrecompound the value for tyrecompound.id_tyrecompound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setIdTyrecompound(Integer idTyrecompound) {
        this.idTyrecompound = idTyrecompound;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tyrecompound.cod_compound
     *
     * @return the value of tyrecompound.cod_compound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public String getCodCompound() {
        return codCompound;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyrecompound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public TyreCompound withCodCompound(String codCompound) {
        this.setCodCompound(codCompound);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tyrecompound.cod_compound
     *
     * @param codCompound the value for tyrecompound.cod_compound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setCodCompound(String codCompound) {
        this.codCompound = codCompound == null ? null : codCompound.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tyrecompound.description_compound
     *
     * @return the value of tyrecompound.description_compound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public String getDescriptionCompound() {
        return descriptionCompound;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyrecompound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public TyreCompound withDescriptionCompound(String descriptionCompound) {
        this.setDescriptionCompound(descriptionCompound);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tyrecompound.description_compound
     *
     * @param descriptionCompound the value for tyrecompound.description_compound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setDescriptionCompound(String descriptionCompound) {
        this.descriptionCompound = descriptionCompound == null ? null : descriptionCompound.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tyrecompound.sort_order
     *
     * @return the value of tyrecompound.sort_order
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Short getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyrecompound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public TyreCompound withSortOrder(Short sortOrder) {
        this.setSortOrder(sortOrder);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tyrecompound.sort_order
     *
     * @param sortOrder the value for tyrecompound.sort_order
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyrecompound
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idTyrecompound=").append(idTyrecompound);
        sb.append(", codCompound=").append(codCompound);
        sb.append(", descriptionCompound=").append(descriptionCompound);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}