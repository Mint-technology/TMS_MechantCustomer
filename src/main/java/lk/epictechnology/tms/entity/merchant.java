package lk.epictechnology.tms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/27/2021
 */


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  ID;

    @Column(length = 15)
    private String MERCHANTID;

    @Column(length = 32)
    private String MERCHANTTYPE;

    @ManyToOne
    @JoinColumn(name = "MERCHANTCUSTOMER")
    private merchantcustomer merchantcustomer ;

    @ManyToOne
    @JoinColumn(name = "MCC")
    private mcc mcc ;

    @Column(length = 64)
    private String DESCRIPTION;

    @ManyToOne
    @JoinColumn(name = "INSTITUTE")
    private institute institute;

    @Column(length = 64)
    private String CONTACTNO;

    @Column(length = 256)
    private String CONTACTPERSON;

    @Column(length = 256)
    private String CONTACTPERSONPOSITION;

    @ManyToOne
    @JoinColumn(name = "COUNTRY")
    private country country;

    @ManyToOne
    @JoinColumn(name = "PROVINCE")
    private province province;

    @ManyToOne
    @JoinColumn(name = "DISTRICT")
    private district district;

    @ManyToOne
    @JoinColumn(name = "CITY")
    private city city;

    @Column(length = 16)
    private String POSTALCODE;

    @Column(length = 64)
    private String ADDRESS1;

    @Column(length = 64)
    private String ADDRESS2;

    @Column(length = 64)
    private String ADDRESS3;

    @Column(length = 64)
    private String FAX;

    @Column(length = 256)
    private String EMAIL;

    @Column(length = 64)
    private String REMARK;

    @ManyToOne
    @JoinColumn(name = "STATUS")
    private status status;

    @Column(length = 64)
    private String LASTUPDATEDUSER;

    @Column(length = 25)
    private String BRANCH;

}
