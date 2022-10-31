package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes a type of line wrapping.
 */
public class WrapMode extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkWrapMode";
    
    /**
     * do not wrap lines; just make the text area wider
     */
    public static final WrapMode NONE = new WrapMode(0);
    
    /**
     * wrap text, breaking lines anywhere the cursor can
     *   appear (between characters, usually - if you want to be technical,
     *   between graphemes, see pango_get_log_attrs())
     */
    public static final WrapMode CHAR = new WrapMode(1);
    
    /**
     * wrap text, breaking lines in between words
     */
    public static final WrapMode WORD = new WrapMode(2);
    
    /**
     * wrap text, breaking lines in between words, or if
     *   that is not enough, also between graphemes
     */
    public static final WrapMode WORD_CHAR = new WrapMode(3);
    
    public WrapMode(int value) {
        super(value);
    }
}
