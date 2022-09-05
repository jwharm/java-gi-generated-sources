package org.gtk.gio;

/**
 * #GAskPasswordFlags are used to request specific information from the
 * user, or to notify the user of their choices in an authentication
 * situation.
 */
public class AskPasswordFlags {

    /**
     * operation requires a password.
     */
    public static final int NEED_PASSWORD = 1;
    
    /**
     * operation requires a username.
     */
    public static final int NEED_USERNAME = 2;
    
    /**
     * operation requires a domain.
     */
    public static final int NEED_DOMAIN = 4;
    
    /**
     * operation supports saving settings.
     */
    public static final int SAVING_SUPPORTED = 8;
    
    /**
     * operation supports anonymous users.
     */
    public static final int ANONYMOUS_SUPPORTED = 16;
    
    /**
     * operation takes TCRYPT parameters (Since: 2.58)
     */
    public static final int TCRYPT = 32;
    
}
