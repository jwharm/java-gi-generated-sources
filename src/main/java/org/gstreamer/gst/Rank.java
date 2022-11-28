package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Element priority ranks. Defines the order in which the autoplugger (or
 * similar rank-picking mechanisms, such as e.g. gst_element_make_from_uri())
 * will choose this element over an alternative one with the same function.
 * <p>
 * These constants serve as a rough guidance for defining the rank of a
 * {@link PluginFeature}. Any value is valid, including values bigger than
 * {@code GST_RANK_PRIMARY}.
 */
public class Rank extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstRank";
    
    /**
     * will be chosen last or not at all
     */
    public static final Rank NONE = new Rank(0);
    
    /**
     * unlikely to be chosen
     */
    public static final Rank MARGINAL = new Rank(64);
    
    /**
     * likely to be chosen
     */
    public static final Rank SECONDARY = new Rank(128);
    
    /**
     * will be chosen first
     */
    public static final Rank PRIMARY = new Rank(256);
    
    public Rank(int value) {
        super(value);
    }
}
