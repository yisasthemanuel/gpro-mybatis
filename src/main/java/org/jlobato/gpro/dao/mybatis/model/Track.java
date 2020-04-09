package org.jlobato.gpro.dao.mybatis.model;

import java.io.Serializable;

public class Track implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.id_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private Short idTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.name_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private String nameTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.distance_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private int distanceTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.laps_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private int lapsTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.lap_length_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private int lapLengthTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.power_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private int powerTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.handling_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private int handlingTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.acceleration_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private int accelerationTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.downforce_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private String downforceTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.overtaking_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private String overtakingTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.suspension_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private String suspensionTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.fuel_consumption_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private String fuelConsumptionTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.tyre_wear_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private String tyreWearTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.avg_speed_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private int avgSpeedTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.grip_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private String gripTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.number_corners_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private int numberCornersTrack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column track.pit_time_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private int pitTimeTrack;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.id_track
     *
     * @return the value of track.id_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Short getIdTrack() {
        return idTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withIdTrack(Short idTrack) {
        this.setIdTrack(idTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.id_track
     *
     * @param idTrack the value for track.id_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setIdTrack(Short idTrack) {
        this.idTrack = idTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.name_track
     *
     * @return the value of track.name_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public String getNameTrack() {
        return nameTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withNameTrack(String nameTrack) {
        this.setNameTrack(nameTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.name_track
     *
     * @param nameTrack the value for track.name_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setNameTrack(String nameTrack) {
        this.nameTrack = nameTrack == null ? null : nameTrack.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.distance_track
     *
     * @return the value of track.distance_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public int getDistanceTrack() {
        return distanceTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withDistanceTrack(int distanceTrack) {
        this.setDistanceTrack(distanceTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.distance_track
     *
     * @param distanceTrack the value for track.distance_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setDistanceTrack(int distanceTrack) {
        this.distanceTrack = distanceTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.laps_track
     *
     * @return the value of track.laps_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public int getLapsTrack() {
        return lapsTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withLapsTrack(int lapsTrack) {
        this.setLapsTrack(lapsTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.laps_track
     *
     * @param lapsTrack the value for track.laps_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setLapsTrack(int lapsTrack) {
        this.lapsTrack = lapsTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.lap_length_track
     *
     * @return the value of track.lap_length_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public int getLapLengthTrack() {
        return lapLengthTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withLapLengthTrack(int lapLengthTrack) {
        this.setLapLengthTrack(lapLengthTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.lap_length_track
     *
     * @param lapLengthTrack the value for track.lap_length_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setLapLengthTrack(int lapLengthTrack) {
        this.lapLengthTrack = lapLengthTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.power_track
     *
     * @return the value of track.power_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public int getPowerTrack() {
        return powerTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withPowerTrack(int powerTrack) {
        this.setPowerTrack(powerTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.power_track
     *
     * @param powerTrack the value for track.power_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setPowerTrack(int powerTrack) {
        this.powerTrack = powerTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.handling_track
     *
     * @return the value of track.handling_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public int getHandlingTrack() {
        return handlingTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withHandlingTrack(int handlingTrack) {
        this.setHandlingTrack(handlingTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.handling_track
     *
     * @param handlingTrack the value for track.handling_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setHandlingTrack(int handlingTrack) {
        this.handlingTrack = handlingTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.acceleration_track
     *
     * @return the value of track.acceleration_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public int getAccelerationTrack() {
        return accelerationTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withAccelerationTrack(int accelerationTrack) {
        this.setAccelerationTrack(accelerationTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.acceleration_track
     *
     * @param accelerationTrack the value for track.acceleration_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setAccelerationTrack(int accelerationTrack) {
        this.accelerationTrack = accelerationTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.downforce_track
     *
     * @return the value of track.downforce_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public String getDownforceTrack() {
        return downforceTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withDownforceTrack(String downforceTrack) {
        this.setDownforceTrack(downforceTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.downforce_track
     *
     * @param downforceTrack the value for track.downforce_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setDownforceTrack(String downforceTrack) {
        this.downforceTrack = downforceTrack == null ? null : downforceTrack.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.overtaking_track
     *
     * @return the value of track.overtaking_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public String getOvertakingTrack() {
        return overtakingTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withOvertakingTrack(String overtakingTrack) {
        this.setOvertakingTrack(overtakingTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.overtaking_track
     *
     * @param overtakingTrack the value for track.overtaking_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setOvertakingTrack(String overtakingTrack) {
        this.overtakingTrack = overtakingTrack == null ? null : overtakingTrack.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.suspension_track
     *
     * @return the value of track.suspension_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public String getSuspensionTrack() {
        return suspensionTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withSuspensionTrack(String suspensionTrack) {
        this.setSuspensionTrack(suspensionTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.suspension_track
     *
     * @param suspensionTrack the value for track.suspension_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setSuspensionTrack(String suspensionTrack) {
        this.suspensionTrack = suspensionTrack == null ? null : suspensionTrack.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.fuel_consumption_track
     *
     * @return the value of track.fuel_consumption_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public String getFuelConsumptionTrack() {
        return fuelConsumptionTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withFuelConsumptionTrack(String fuelConsumptionTrack) {
        this.setFuelConsumptionTrack(fuelConsumptionTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.fuel_consumption_track
     *
     * @param fuelConsumptionTrack the value for track.fuel_consumption_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setFuelConsumptionTrack(String fuelConsumptionTrack) {
        this.fuelConsumptionTrack = fuelConsumptionTrack == null ? null : fuelConsumptionTrack.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.tyre_wear_track
     *
     * @return the value of track.tyre_wear_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public String getTyreWearTrack() {
        return tyreWearTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withTyreWearTrack(String tyreWearTrack) {
        this.setTyreWearTrack(tyreWearTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.tyre_wear_track
     *
     * @param tyreWearTrack the value for track.tyre_wear_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setTyreWearTrack(String tyreWearTrack) {
        this.tyreWearTrack = tyreWearTrack == null ? null : tyreWearTrack.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.avg_speed_track
     *
     * @return the value of track.avg_speed_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public int getAvgSpeedTrack() {
        return avgSpeedTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withAvgSpeedTrack(int avgSpeedTrack) {
        this.setAvgSpeedTrack(avgSpeedTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.avg_speed_track
     *
     * @param avgSpeedTrack the value for track.avg_speed_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setAvgSpeedTrack(int avgSpeedTrack) {
        this.avgSpeedTrack = avgSpeedTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.grip_track
     *
     * @return the value of track.grip_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public String getGripTrack() {
        return gripTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withGripTrack(String gripTrack) {
        this.setGripTrack(gripTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.grip_track
     *
     * @param gripTrack the value for track.grip_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setGripTrack(String gripTrack) {
        this.gripTrack = gripTrack == null ? null : gripTrack.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.number_corners_track
     *
     * @return the value of track.number_corners_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public int getNumberCornersTrack() {
        return numberCornersTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withNumberCornersTrack(int numberCornersTrack) {
        this.setNumberCornersTrack(numberCornersTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.number_corners_track
     *
     * @param numberCornersTrack the value for track.number_corners_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setNumberCornersTrack(int numberCornersTrack) {
        this.numberCornersTrack = numberCornersTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column track.pit_time_track
     *
     * @return the value of track.pit_time_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public int getPitTimeTrack() {
        return pitTimeTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public Track withPitTimeTrack(int pitTimeTrack) {
        this.setPitTimeTrack(pitTimeTrack);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column track.pit_time_track
     *
     * @param pitTimeTrack the value for track.pit_time_track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    public void setPitTimeTrack(int pitTimeTrack) {
        this.pitTimeTrack = pitTimeTrack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table track
     *
     * @mbg.generated Sat Mar 28 10:44:39 CET 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idTrack=").append(idTrack);
        sb.append(", nameTrack=").append(nameTrack);
        sb.append(", distanceTrack=").append(distanceTrack);
        sb.append(", lapsTrack=").append(lapsTrack);
        sb.append(", lapLengthTrack=").append(lapLengthTrack);
        sb.append(", powerTrack=").append(powerTrack);
        sb.append(", handlingTrack=").append(handlingTrack);
        sb.append(", accelerationTrack=").append(accelerationTrack);
        sb.append(", downforceTrack=").append(downforceTrack);
        sb.append(", overtakingTrack=").append(overtakingTrack);
        sb.append(", suspensionTrack=").append(suspensionTrack);
        sb.append(", fuelConsumptionTrack=").append(fuelConsumptionTrack);
        sb.append(", tyreWearTrack=").append(tyreWearTrack);
        sb.append(", avgSpeedTrack=").append(avgSpeedTrack);
        sb.append(", gripTrack=").append(gripTrack);
        sb.append(", numberCornersTrack=").append(numberCornersTrack);
        sb.append(", pitTimeTrack=").append(pitTimeTrack);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}