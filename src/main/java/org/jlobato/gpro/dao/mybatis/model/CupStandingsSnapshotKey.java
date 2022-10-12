package org.jlobato.gpro.dao.mybatis.model;

import java.io.Serializable;

public class CupStandingsSnapshotKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cupstandingsnapshot.id_season
     *
     * @mbg.generated Sun Oct 16 16:30:15 CEST 2022
     */
    private Short idSeason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cupstandingsnapshot.id_team
     *
     * @mbg.generated Sun Oct 16 16:30:15 CEST 2022
     */
    private Short idTeam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cupstandingsnapshot
     *
     * @mbg.generated Sun Oct 16 16:30:15 CEST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cupstandingsnapshot.id_season
     *
     * @return the value of cupstandingsnapshot.id_season
     *
     * @mbg.generated Sun Oct 16 16:30:15 CEST 2022
     */
    public Short getIdSeason() {
        return idSeason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cupstandingsnapshot
     *
     * @mbg.generated Sun Oct 16 16:30:15 CEST 2022
     */
    public CupStandingsSnapshotKey withIdSeason(Short idSeason) {
        this.setIdSeason(idSeason);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cupstandingsnapshot.id_season
     *
     * @param idSeason the value for cupstandingsnapshot.id_season
     *
     * @mbg.generated Sun Oct 16 16:30:15 CEST 2022
     */
    public void setIdSeason(Short idSeason) {
        this.idSeason = idSeason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cupstandingsnapshot.id_team
     *
     * @return the value of cupstandingsnapshot.id_team
     *
     * @mbg.generated Sun Oct 16 16:30:15 CEST 2022
     */
    public Short getIdTeam() {
        return idTeam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cupstandingsnapshot
     *
     * @mbg.generated Sun Oct 16 16:30:15 CEST 2022
     */
    public CupStandingsSnapshotKey withIdTeam(Short idTeam) {
        this.setIdTeam(idTeam);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cupstandingsnapshot.id_team
     *
     * @param idTeam the value for cupstandingsnapshot.id_team
     *
     * @mbg.generated Sun Oct 16 16:30:15 CEST 2022
     */
    public void setIdTeam(Short idTeam) {
        this.idTeam = idTeam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cupstandingsnapshot
     *
     * @mbg.generated Sun Oct 16 16:30:15 CEST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idSeason=").append(idSeason);
        sb.append(", idTeam=").append(idTeam);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}