package org.jlobato.gpro.dao.mybatis.model;

import java.io.Serializable;

public class TechProblem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column techproblem.id_techproblem
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private Integer idTechproblem;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column techproblem.id_racedata
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private Integer idRacedata;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column techproblem.tp_lap
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private Short tpLap;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column techproblem.description_tp
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private String descriptionTp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table techproblem
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column techproblem.id_techproblem
     *
     * @return the value of techproblem.id_techproblem
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Integer getIdTechproblem() {
        return idTechproblem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public TechProblem withIdTechproblem(Integer idTechproblem) {
        this.setIdTechproblem(idTechproblem);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column techproblem.id_techproblem
     *
     * @param idTechproblem the value for techproblem.id_techproblem
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setIdTechproblem(Integer idTechproblem) {
        this.idTechproblem = idTechproblem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column techproblem.id_racedata
     *
     * @return the value of techproblem.id_racedata
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Integer getIdRacedata() {
        return idRacedata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public TechProblem withIdRacedata(Integer idRacedata) {
        this.setIdRacedata(idRacedata);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column techproblem.id_racedata
     *
     * @param idRacedata the value for techproblem.id_racedata
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setIdRacedata(Integer idRacedata) {
        this.idRacedata = idRacedata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column techproblem.tp_lap
     *
     * @return the value of techproblem.tp_lap
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Short getTpLap() {
        return tpLap;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public TechProblem withTpLap(Short tpLap) {
        this.setTpLap(tpLap);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column techproblem.tp_lap
     *
     * @param tpLap the value for techproblem.tp_lap
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setTpLap(Short tpLap) {
        this.tpLap = tpLap;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column techproblem.description_tp
     *
     * @return the value of techproblem.description_tp
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public String getDescriptionTp() {
        return descriptionTp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public TechProblem withDescriptionTp(String descriptionTp) {
        this.setDescriptionTp(descriptionTp);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column techproblem.description_tp
     *
     * @param descriptionTp the value for techproblem.description_tp
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setDescriptionTp(String descriptionTp) {
        this.descriptionTp = descriptionTp == null ? null : descriptionTp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idTechproblem=").append(idTechproblem);
        sb.append(", idRacedata=").append(idRacedata);
        sb.append(", tpLap=").append(tpLap);
        sb.append(", descriptionTp=").append(descriptionTp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}