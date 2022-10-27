package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Options for selecting a different wrap mode for natural size
 * requests.
 * <p>
 * See for example the {@code Gtk.Label:natural-wrap-mode} property.
 * @version 4.6
 */
public class NaturalWrapMode extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Inherit the minimum size request.
     *   In particular, this should be used with {@link org.pango.WrapMode#CHAR}.
     */
    public static final NaturalWrapMode INHERIT = new NaturalWrapMode(0);
    
    /**
     * Try not to wrap the text. This mode is the
     *   closest to GTK3's behavior but can lead to a wide label leaving
     *   lots of empty space below the text.
     */
    public static final NaturalWrapMode NONE = new NaturalWrapMode(1);
    
    /**
     * Attempt to wrap at word boundaries. This
     *   is useful in particular when using {@link org.pango.WrapMode#WORD_CHAR} as the
     *   wrap mode.
     */
    public static final NaturalWrapMode WORD = new NaturalWrapMode(2);
    
    public NaturalWrapMode(int value) {
        super(value);
    }
}
