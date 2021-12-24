package lk.epictechnology.tms.exception;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/23/2021
 */

public class NotFoundException extends RuntimeException{

    public NotFoundException(String message) {
        super(message);
    }
}
