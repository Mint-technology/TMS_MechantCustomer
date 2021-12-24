package lk.epictechnology.tms.dto;

import lk.epictechnology.tms.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/23/2021
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class merchantcustomerDTO {

    private String IDNO;
    private String IDTYPE;
    private String LEGALNAME;
    private String CONTACTNO;
    private String CONTACTPERSON;
    private String CONTACTPERSONPOSITION;

    private instituteDTO INSTITUTE;

    private countryDTO COUNTRY;

    private provinceDTO PROVINCE;

    private districtDTO DISTRICT;

    private cityDTO CITY;

    private String POSTALCODE;
    private String ADDRESS;
    private String FAX;
    private String EMAIL;
    private String REMARK;

    private statusDTO STATUS;

    private String LASTUPDATEDUSER;
    private String EMAIL_E_STATEMENT;
    private String BRANCH;
}
