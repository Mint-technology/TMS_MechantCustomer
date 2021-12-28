package lk.epictechnology.tms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/28/2021
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class bank {

    @Id
    @Column(length = 16)
    private String BANKCODE;
}
