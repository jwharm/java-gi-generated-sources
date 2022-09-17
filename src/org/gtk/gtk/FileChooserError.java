package org.gtk.gtk;

/**
 * These identify the various errors that can occur while calling<code>GtkFileChooser</code> functions.
 */
public enum FileChooserError {

    /**
     * Indicates that a file does not exist.
     */
    NONEXISTENT,
    
    /**
     * Indicates a malformed filename.
     */
    BAD_FILENAME,
    
    /**
     * Indicates a duplicate path (e.g. when
     *  adding a bookmark).
     */
    ALREADY_EXISTS,
    
    /**
     * Indicates an incomplete hostname
     *  (e.g. &#34;http://foo&#34; without a slash after that).
     */
    INCOMPLETE_HOSTNAME;
    
    public static FileChooserError fromValue(int value) {
        return switch(value) {
            case 0 -> NONEXISTENT;
            case 1 -> BAD_FILENAME;
            case 2 -> ALREADY_EXISTS;
            case 3 -> INCOMPLETE_HOSTNAME;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONEXISTENT -> 0;
            case BAD_FILENAME -> 1;
            case ALREADY_EXISTS -> 2;
            case INCOMPLETE_HOSTNAME -> 3;
        };
    }

}
