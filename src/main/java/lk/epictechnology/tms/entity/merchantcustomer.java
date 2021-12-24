package lk.epictechnology.tms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Column;
/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/23/2021
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class merchantcustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  ID;

    @Column(length = 128)
    private String IDNO;

    @Column(length = 16)
    private String IDTYPE;

    @Column(length = 256)
    private String LEGALNAME;

    @Column(length = 64)
    private String CONTACTNO;

    @Column(length = 256)
    private String CONTACTPERSON;

    @Column(length = 256)
    private String CONTACTPERSONPOSITION;

    @ManyToOne
    @JoinColumn(name = "INSTITUTE")
    private institute institute;

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

    @Column(length = 512)
    private String ADDRESS;

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

        @Column(length = 256)
    private String EMAIL_E_STATEMENT;

        @Column(length = 25)
    private String BRANCH;
}
