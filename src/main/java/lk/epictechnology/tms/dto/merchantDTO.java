package lk.epictechnology.tms.dto;

import lk.epictechnology.tms.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/27/2021
 */


@NoArgsConstructor
@AllArgsConstructor
@Data
public class merchantDTO {

    private long  ID;

    private String MERCHANTID;

    private String MERCHANTTYPE;

    private merchantcustomerDTO MERCHANTCUSTOMER;

    private mccDTO MCC;

    private String DESCRIPTION;

    private instituteDTO INSTITUTE;

    private String CONTACTNO;

    private String CONTACTPERSON;

    private String CONTACTPERSONPOSITION;

    private countryDTO COUNTRY;

    private provinceDTO PROVINCE;

    private districtDTO DISTRICT;

    private cityDTO CITY;

    private String POSTALCODE;

    private String ADDRESS1;

    private String ADDRESS2;

    private String ADDRESS3;

    private String FAX;

    private String EMAIL;

    private String REMARK;

    private statusDTO STATUS;

    private String LASTUPDATEDUSER;

    private String BRANCH;
}
