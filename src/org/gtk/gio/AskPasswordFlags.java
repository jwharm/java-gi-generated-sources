package org.gtk.gio;

/**
 * {@link AskPasswordFlags} are used to request specific information from the
 * user, or to notify the user of their choices in an authentication
 * situation.
 */
public class AskPasswordFlags {

    /**
     * operation requires a password.
     */
    public static final AskPasswordFlags NEED_PASSWORD = new AskPasswordFlags(1);
    
    /**
     * operation requires a username.
     */
    public static final AskPasswordFlags NEED_USERNAME = new AskPasswordFlags(2);
    
    /**
     * operation requires a domain.
     */
    public static final AskPasswordFlags NEED_DOMAIN = new AskPasswordFlags(4);
    
    /**
     * operation supports saving settings.
     */
    public static final AskPasswordFlags SAVING_SUPPORTED = new AskPasswordFlags(8);
    
    /**
     * operation supports anonymous users.
     */
    public static final AskPasswordFlags ANONYMOUS_SUPPORTED = new AskPasswordFlags(16);
    
    /**
     * operation takes TCRYPT parameters (Since: 2.58)
     */
    public static final AskPasswordFlags TCRYPT = new AskPasswordFlags(32);
    
    private int value;
    
    public AskPasswordFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(AskPasswordFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public AskPasswordFlags combined(AskPasswordFlags mask) {
        return new AskPasswordFlags(this.getValue() | mask.getValue());
    }
    
    public static AskPasswordFlags combined(AskPasswordFlags mask, AskPasswordFlags... masks) {
        int value = mask.getValue();
        for (AskPasswordFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AskPasswordFlags(value);
    }
    
}
