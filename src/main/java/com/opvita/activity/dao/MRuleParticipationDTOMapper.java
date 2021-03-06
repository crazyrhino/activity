package com.opvita.activity.dao;

import com.opvita.activity.dto.MRuleParticipationDTO;
import com.opvita.activity.dto.MRuleParticipationDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MRuleParticipationDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_RULE_PARTICIPATION
     *
     * @mbggenerated
     */
    int countByExample(MRuleParticipationDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_RULE_PARTICIPATION
     *
     * @mbggenerated
     */
    int deleteByExample(MRuleParticipationDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_RULE_PARTICIPATION
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_RULE_PARTICIPATION
     *
     * @mbggenerated
     */
    int insert(MRuleParticipationDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_RULE_PARTICIPATION
     *
     * @mbggenerated
     */
    int insertSelective(MRuleParticipationDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_RULE_PARTICIPATION
     *
     * @mbggenerated
     */
    List<MRuleParticipationDTO> selectByExample(MRuleParticipationDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_RULE_PARTICIPATION
     *
     * @mbggenerated
     */
    MRuleParticipationDTO selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_RULE_PARTICIPATION
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MRuleParticipationDTO record, @Param("example") MRuleParticipationDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_RULE_PARTICIPATION
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MRuleParticipationDTO record, @Param("example") MRuleParticipationDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_RULE_PARTICIPATION
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MRuleParticipationDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_RULE_PARTICIPATION
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MRuleParticipationDTO record);
}