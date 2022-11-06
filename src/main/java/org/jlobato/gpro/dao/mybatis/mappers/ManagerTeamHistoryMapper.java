package org.jlobato.gpro.dao.mybatis.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jlobato.gpro.dao.mybatis.model.ManagerTeamHistory;
import org.jlobato.gpro.dao.mybatis.model.ManagerTeamHistoryExample;

public interface ManagerTeamHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_team_history
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    long countByExample(ManagerTeamHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_team_history
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int deleteByExample(ManagerTeamHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_team_history
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int deleteByPrimaryKey(Integer idManagerTeamHistory);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_team_history
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int insert(ManagerTeamHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_team_history
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int insertSelective(ManagerTeamHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_team_history
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    List<ManagerTeamHistory> selectByExample(ManagerTeamHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_team_history
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    ManagerTeamHistory selectByPrimaryKey(Integer idManagerTeamHistory);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_team_history
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int updateByExampleSelective(@Param("record") ManagerTeamHistory record, @Param("example") ManagerTeamHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_team_history
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int updateByExample(@Param("record") ManagerTeamHistory record, @Param("example") ManagerTeamHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_team_history
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int updateByPrimaryKeySelective(ManagerTeamHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_team_history
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int updateByPrimaryKey(ManagerTeamHistory record);
}