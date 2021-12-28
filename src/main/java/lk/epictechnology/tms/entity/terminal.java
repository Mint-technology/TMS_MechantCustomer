package lk.epictechnology.tms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/28/2021
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class terminal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @ManyToOne
    @JoinColumn(name = "DEVICE")
    private device device ;

    @Column(length = 8)
    private String TERMINALID;

    @ManyToOne
    @JoinColumn(name = "MERCHANT")
    private merchant merchant ;

    @ManyToOne
    @JoinColumn(name = "BANK")
    private bank bank ;

    @Column(length = 15)
    private String SHEREMERCHANTID;

    @ManyToOne
    @JoinColumn(name = "CURRENCY")
    private currency currency ;

    private boolean ISMASTER;

    private Short SORTKEY;

    @ManyToOne
    @JoinColumn(name = "STATUS")
    private status status;

    @Column(length = 64)
    private String LASTUPDATEDUSER;

}
