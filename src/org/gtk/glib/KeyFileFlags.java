package org.gtk.glib;

/**
 * Flags which influence the parsing.
 */
public class KeyFileFlags {

    /**
     * No flags, default behaviour
     */
    public static final int NONE = 0;
    
    /**
     * Use this flag if you plan to write the
     *   (possibly modified) contents of the key file back to a file;
     *   otherwise all comments will be lost when the key file is
     *   written back.
     */
    public static final int KEEP_COMMENTS = 1;
    
    /**
     * Use this flag if you plan to write the
     *   (possibly modified) contents of the key file back to a file;
     *   otherwise only the translations for the current language will be
     *   written back.
     */
    public static final int KEEP_TRANSLATIONS = 2;
    
}
