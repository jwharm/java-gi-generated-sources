package org.gtk.gio;

/**
 * #GPasswordSave is used to indicate the lifespan of a saved password.
 * 
 * #Gvfs stores passwords in the Gnome keyring when this flag allows it
 * to, and later retrieves it again from there.
 */
public enum PasswordSave {

    /**
     * never save a password.
     */
    NEVER,
    
    /**
     * save a password for the session.
     */
    FOR_SESSION,
    
    /**
     * save a password permanently.
     */
    PERMANENTLY;
    
    public static PasswordSave fromValue(int value) {
        return switch(value) {
            case 0 -> NEVER;
            case 1 -> FOR_SESSION;
            case 2 -> PERMANENTLY;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NEVER -> 0;
            case FOR_SESSION -> 1;
            case PERMANENTLY -> 2;
        };
    }

}
