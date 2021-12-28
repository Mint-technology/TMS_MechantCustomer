package lk.epictechnology.tms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/28/2021
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  ID;

}
