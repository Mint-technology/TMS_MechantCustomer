package lk.epictechnology.tms.dto;

import lk.epictechnology.tms.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/28/2021
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class terminalDTO {
    private long ID;

    private deviceDTO DEVICE ;

    private String TERMINALID;

    private merchantDTO MERCHANT ;

    private bankDTO BANK ;

    private String SHEREMERCHANTID;

    private currencyDTO CURRENCY ;

    private boolean ISMASTER;

    private Short SORTKEY;

    private statusDTO STATUS;

    private String LASTUPDATEDUSER;
}
