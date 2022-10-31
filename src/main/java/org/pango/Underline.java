package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoUnderline} enumeration is used to specify whether text
 * should be underlined, and if so, the type of underlining.
 */
public class Underline extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "PangoUnderline";
    
    /**
     * no underline should be drawn
     */
    public static final Underline NONE = new Underline(0);
    
    /**
     * a single underline should be drawn
     */
    public static final Underline SINGLE = new Underline(1);
    
    /**
     * a double underline should be drawn
     */
    public static final Underline DOUBLE = new Underline(2);
    
    /**
     * a single underline should be drawn at a
     *   position beneath the ink extents of the text being
     *   underlined. This should be used only for underlining
     *   single characters, such as for keyboard accelerators.
     *   {@link Underline#SINGLE} should be used for extended
     *   portions of text.
     */
    public static final Underline LOW = new Underline(3);
    
    /**
     * an underline indicating an error should
     *   be drawn below. The exact style of rendering is up to the
     *   {@code PangoRenderer} in use, but typical styles include wavy
     *   or dotted lines.
     *   This underline is typically used to indicate an error such
     *   as a possible mispelling; in some cases a contrasting color
     *   may automatically be used. This type of underlining is
     *   available since Pango 1.4.
     */
    public static final Underline ERROR = new Underline(4);
    
    /**
     * Like {@code PANGO_UNDERLINE_SINGLE}, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    public static final Underline SINGLE_LINE = new Underline(5);
    
    /**
     * Like {@code PANGO_UNDERLINE_DOUBLE}, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    public static final Underline DOUBLE_LINE = new Underline(6);
    
    /**
     * Like {@code PANGO_UNDERLINE_ERROR}, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    public static final Underline ERROR_LINE = new Underline(7);
    
    public Underline(int value) {
        super(value);
    }
}
