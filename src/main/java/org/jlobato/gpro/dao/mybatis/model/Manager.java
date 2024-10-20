package org.jlobato.gpro.dao.mybatis.model;

import java.io.Serializable;

public class Manager implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.id_manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private Short idManager;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.code_manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private String codeManager;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.first_name
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.last_name
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.avatar_path
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private String avatarPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.cup_wins
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private int cupWins;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.id_gpro
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private Integer idGpro;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.avatar_img
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private byte[] avatarImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.id_manager
     *
     * @return the value of manager.id_manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Short getIdManager() {
        return idManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Manager withIdManager(Short idManager) {
        this.setIdManager(idManager);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.id_manager
     *
     * @param idManager the value for manager.id_manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setIdManager(Short idManager) {
        this.idManager = idManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.code_manager
     *
     * @return the value of manager.code_manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public String getCodeManager() {
        return codeManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Manager withCodeManager(String codeManager) {
        this.setCodeManager(codeManager);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.code_manager
     *
     * @param codeManager the value for manager.code_manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setCodeManager(String codeManager) {
        this.codeManager = codeManager == null ? null : codeManager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.first_name
     *
     * @return the value of manager.first_name
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Manager withFirstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.first_name
     *
     * @param firstName the value for manager.first_name
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.last_name
     *
     * @return the value of manager.last_name
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Manager withLastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.last_name
     *
     * @param lastName the value for manager.last_name
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.avatar_path
     *
     * @return the value of manager.avatar_path
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public String getAvatarPath() {
        return avatarPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Manager withAvatarPath(String avatarPath) {
        this.setAvatarPath(avatarPath);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.avatar_path
     *
     * @param avatarPath the value for manager.avatar_path
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath == null ? null : avatarPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.cup_wins
     *
     * @return the value of manager.cup_wins
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public int getCupWins() {
        return cupWins;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Manager withCupWins(int cupWins) {
        this.setCupWins(cupWins);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.cup_wins
     *
     * @param cupWins the value for manager.cup_wins
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setCupWins(int cupWins) {
        this.cupWins = cupWins;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.id_gpro
     *
     * @return the value of manager.id_gpro
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Integer getIdGpro() {
        return idGpro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Manager withIdGpro(Integer idGpro) {
        this.setIdGpro(idGpro);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.id_gpro
     *
     * @param idGpro the value for manager.id_gpro
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setIdGpro(Integer idGpro) {
        this.idGpro = idGpro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.avatar_img
     *
     * @return the value of manager.avatar_img
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public byte[] getAvatarImg() {
        return avatarImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Manager withAvatarImg(byte[] avatarImg) {
        this.setAvatarImg(avatarImg);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.avatar_img
     *
     * @param avatarImg the value for manager.avatar_img
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setAvatarImg(byte[] avatarImg) {
        this.avatarImg = avatarImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idManager=").append(idManager);
        sb.append(", codeManager=").append(codeManager);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", avatarPath=").append(avatarPath);
        sb.append(", cupWins=").append(cupWins);
        sb.append(", idGpro=").append(idGpro);
        sb.append(", avatarImg=").append(avatarImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}