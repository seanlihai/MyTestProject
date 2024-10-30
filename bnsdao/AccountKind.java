
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountKind">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LEGAL_ENT_00"/>
 *     <enumeration value="COMP_CORP_01"/>
 *     <enumeration value="COMP_CORP_0101"/>
 *     <enumeration value="COMP_CORP_0102"/>
 *     <enumeration value="COMP_CORP_0103"/>
 *     <enumeration value="COMP_CORP_0104"/>
 *     <enumeration value="COMP_CORP_0105"/>
 *     <enumeration value="COMP_CORP_0106"/>
 *     <enumeration value="COMP_CORP_0107"/>
 *     <enumeration value="COMP_CORP_0108"/>
 *     <enumeration value="COMP_CORP_02"/>
 *     <enumeration value="COMP_CORP_0201"/>
 *     <enumeration value="COMP_CORP_0202"/>
 *     <enumeration value="COMP_CORP_0203"/>
 *     <enumeration value="COMP_CORP_0204"/>
 *     <enumeration value="COMP_CORP_0205"/>
 *     <enumeration value="COMP_CORP_0206"/>
 *     <enumeration value="COMP_CORP_0207"/>
 *     <enumeration value="COMP_CORP_0208"/>
 *     <enumeration value="COMP_CORP_03"/>
 *     <enumeration value="COMP_CORP_0301"/>
 *     <enumeration value="COMP_CORP_0302"/>
 *     <enumeration value="COMP_CORP_0303"/>
 *     <enumeration value="COMP_CORP_0304"/>
 *     <enumeration value="COMP_CORP_0305"/>
 *     <enumeration value="COMP_CORP_0306"/>
 *     <enumeration value="COMP_CORP_0307"/>
 *     <enumeration value="COMP_CORP_0308"/>
 *     <enumeration value="PERSONAL_PRIVATE_COMP_04"/>
 *     <enumeration value="PERSONAL_PRIVATE_COMP_05"/>
 *     <enumeration value="PARTNERSHIP_06"/>
 *     <enumeration value="PARTNERSHIP_07"/>
 *     <enumeration value="PARTNERSHIP_08"/>
 *     <enumeration value="INVEST_CLUB_09"/>
 *     <enumeration value="SOLE_PROP_10"/>
 *     <enumeration value="WRITTEN_TRUST_11"/>
 *     <enumeration value="WRITTEN_TRUST_12"/>
 *     <enumeration value="WRITTEN_TRUST_13"/>
 *     <enumeration value="WRITTEN_TRUST_14"/>
 *     <enumeration value="WRITTEN_TRUST_15"/>
 *     <enumeration value="ESTATE_16"/>
 *     <enumeration value="ESTATE_17"/>
 *     <enumeration value="ESTATE_18"/>
 *     <enumeration value="ESTATE_19"/>
 *     <enumeration value="PRIVATE_FUND_20"/>
 *     <enumeration value="GOV_INTER_ORG_21"/>
 *     <enumeration value="SCHOOL_BOARD_22"/>
 *     <enumeration value="HOSPITAL_23"/>
 *     <enumeration value="MUNICIPALITY_24"/>
 *     <enumeration value="MUNICIPALITY_25"/>
 *     <enumeration value="CONDO_CORP_26"/>
 *     <enumeration value="RELIGIOUS_ORG_27"/>
 *     <enumeration value="REG_CHARITY_28"/>
 *     <enumeration value="SOCAL_NON_PROF_ORG_29"/>
 *     <enumeration value="COMMITTEE_30"/>
 *     <enumeration value="PUB_TRUSTEE_31"/>
 *     <enumeration value="COMP_CORP_32"/>
 *     <enumeration value="COMP_CORP_3201"/>
 *     <enumeration value="COMP_CORP_3202"/>
 *     <enumeration value="COMP_CORP_3203"/>
 *     <enumeration value="COMP_CORP_3204"/>
 *     <enumeration value="COMP_CORP_3205"/>
 *     <enumeration value="COMP_CORP_3206"/>
 *     <enumeration value="COMP_CORP_3207"/>
 *     <enumeration value="COMP_CORP_3208"/>
 *     <enumeration value="COMP_CORP_33"/>
 *     <enumeration value="COMP_CORP_3301"/>
 *     <enumeration value="COMP_CORP_3302"/>
 *     <enumeration value="COMP_CORP_3303"/>
 *     <enumeration value="COMP_CORP_3304"/>
 *     <enumeration value="COMP_CORP_3305"/>
 *     <enumeration value="COMP_CORP_3306"/>
 *     <enumeration value="COMP_CORP_3307"/>
 *     <enumeration value="COMP_CORP_3308"/>
 *     <enumeration value="COMP_CORP_34"/>
 *     <enumeration value="COMP_CORP_3401"/>
 *     <enumeration value="COMP_CORP_3402"/>
 *     <enumeration value="COMP_CORP_3403"/>
 *     <enumeration value="COMP_CORP_3404"/>
 *     <enumeration value="COMP_CORP_3405"/>
 *     <enumeration value="COMP_CORP_3406"/>
 *     <enumeration value="COMP_CORP_3407"/>
 *     <enumeration value="COMP_CORP_3408"/>
 *     <enumeration value="LE_CASH_OPTI_40"/>
 *     <enumeration value="CASH_OPTI_INVEST_COIA"/>
 *     <enumeration value="CLUB"/>
 *     <enumeration value="CORPORATE"/>
 *     <enumeration value="DCPP"/>
 *     <enumeration value="DPSP"/>
 *     <enumeration value="ESTATE"/>
 *     <enumeration value="GRSP"/>
 *     <enumeration value="GTFS"/>
 *     <enumeration value="JOINT"/>
 *     <enumeration value="JOINT_COIA"/>
 *     <enumeration value="LIF"/>
 *     <enumeration value="LIRA"/>
 *     <enumeration value="LRIF"/>
 *     <enumeration value="LRSP"/>
 *     <enumeration value="PARTNERSHIP"/>
 *     <enumeration value="RESP"/>
 *     <enumeration value="RIF"/>
 *     <enumeration value="RSP"/>
 *     <enumeration value="REGULAR"/>
 *     <enumeration value="SRIF"/>
 *     <enumeration value="SRSP"/>
 *     <enumeration value="TFSA"/>
 *     <enumeration value="TRUST"/>
 *     <enumeration value="TRUST_JOINT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountKind", namespace = "http://xsd.bns.com/types/kycservice/v001")
@XmlEnum
public enum AccountKind {

    LEGAL_ENT_00,
    COMP_CORP_01,
    COMP_CORP_0101,
    COMP_CORP_0102,
    COMP_CORP_0103,
    COMP_CORP_0104,
    COMP_CORP_0105,
    COMP_CORP_0106,
    COMP_CORP_0107,
    COMP_CORP_0108,
    COMP_CORP_02,
    COMP_CORP_0201,
    COMP_CORP_0202,
    COMP_CORP_0203,
    COMP_CORP_0204,
    COMP_CORP_0205,
    COMP_CORP_0206,
    COMP_CORP_0207,
    COMP_CORP_0208,
    COMP_CORP_03,
    COMP_CORP_0301,
    COMP_CORP_0302,
    COMP_CORP_0303,
    COMP_CORP_0304,
    COMP_CORP_0305,
    COMP_CORP_0306,
    COMP_CORP_0307,
    COMP_CORP_0308,
    PERSONAL_PRIVATE_COMP_04,
    PERSONAL_PRIVATE_COMP_05,
    PARTNERSHIP_06,
    PARTNERSHIP_07,
    PARTNERSHIP_08,
    INVEST_CLUB_09,
    SOLE_PROP_10,
    WRITTEN_TRUST_11,
    WRITTEN_TRUST_12,
    WRITTEN_TRUST_13,
    WRITTEN_TRUST_14,
    WRITTEN_TRUST_15,
    ESTATE_16,
    ESTATE_17,
    ESTATE_18,
    ESTATE_19,
    PRIVATE_FUND_20,
    GOV_INTER_ORG_21,
    SCHOOL_BOARD_22,
    HOSPITAL_23,
    MUNICIPALITY_24,
    MUNICIPALITY_25,
    CONDO_CORP_26,
    RELIGIOUS_ORG_27,
    REG_CHARITY_28,
    SOCAL_NON_PROF_ORG_29,
    COMMITTEE_30,
    PUB_TRUSTEE_31,
    COMP_CORP_32,
    COMP_CORP_3201,
    COMP_CORP_3202,
    COMP_CORP_3203,
    COMP_CORP_3204,
    COMP_CORP_3205,
    COMP_CORP_3206,
    COMP_CORP_3207,
    COMP_CORP_3208,
    COMP_CORP_33,
    COMP_CORP_3301,
    COMP_CORP_3302,
    COMP_CORP_3303,
    COMP_CORP_3304,
    COMP_CORP_3305,
    COMP_CORP_3306,
    COMP_CORP_3307,
    COMP_CORP_3308,
    COMP_CORP_34,
    COMP_CORP_3401,
    COMP_CORP_3402,
    COMP_CORP_3403,
    COMP_CORP_3404,
    COMP_CORP_3405,
    COMP_CORP_3406,
    COMP_CORP_3407,
    COMP_CORP_3408,
    LE_CASH_OPTI_40,
    CASH_OPTI_INVEST_COIA,
    CLUB,
    CORPORATE,
    DCPP,
    DPSP,
    ESTATE,
    GRSP,
    GTFS,
    JOINT,
    JOINT_COIA,
    LIF,
    LIRA,
    LRIF,
    LRSP,
    PARTNERSHIP,
    RESP,
    RIF,
    RSP,
    REGULAR,
    SRIF,
    SRSP,
    TFSA,
    TRUST,
    TRUST_JOINT;

    public String value() {
        return name();
    }

    public static AccountKind fromValue(String v) {
        return valueOf(v);
    }

}
