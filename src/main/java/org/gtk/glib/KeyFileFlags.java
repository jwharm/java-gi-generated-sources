package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags which influence the parsing.
 */
public class KeyFileFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GKeyFileFlags";
    
    /**
     * No flags, default behaviour
     */
    public static final KeyFileFlags NONE = new KeyFileFlags(0);
    
    /**
     * Use this flag if you plan to write the
     *   (possibly modified) contents of the key file back to a file;
     *   otherwise all comments will be lost when the key file is
     *   written back.
     */
    public static final KeyFileFlags KEEP_COMMENTS = new KeyFileFlags(1);
    
    /**
     * Use this flag if you plan to write the
     *   (possibly modified) contents of the key file back to a file;
     *   otherwise only the translations for the current language will be
     *   written back.
     */
    public static final KeyFileFlags KEEP_TRANSLATIONS = new KeyFileFlags(2);
    
    public KeyFileFlags(int value) {
        super(value);
    }
}
