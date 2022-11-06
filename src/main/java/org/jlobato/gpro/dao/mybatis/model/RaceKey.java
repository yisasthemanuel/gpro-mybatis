package org.jlobato.gpro.dao.mybatis.model;

import java.io.Serializable;

public class RaceKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column race.id_season
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    private Short idSeason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column race.id_race
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    private Short idRace;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table race
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column race.id_season
     *
     * @return the value of race.id_season
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public Short getIdSeason() {
        return idSeason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table race
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public RaceKey withIdSeason(Short idSeason) {
        this.setIdSeason(idSeason);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column race.id_season
     *
     * @param idSeason the value for race.id_season
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public void setIdSeason(Short idSeason) {
        this.idSeason = idSeason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column race.id_race
     *
     * @return the value of race.id_race
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public Short getIdRace() {
        return idRace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table race
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public RaceKey withIdRace(Short idRace) {
        this.setIdRace(idRace);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column race.id_race
     *
     * @param idRace the value for race.id_race
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    public void setIdRace(Short idRace) {
        this.idRace = idRace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table race
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idSeason=").append(idSeason);
        sb.append(", idRace=").append(idRace);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}