package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The amount of checking to be done when linking pads. {@code GST_PAD_LINK_CHECK_CAPS}
 * and {@code GST_PAD_LINK_CHECK_TEMPLATE_CAPS} are mutually exclusive. If both are
 * specified, expensive but safe {@code GST_PAD_LINK_CHECK_CAPS} are performed.
 * <p>
 * <blockquote>
 *  Only disable some of the checks if you are 100% certain you know the link
 *  will not fail because of hierarchy/caps compatibility failures. If uncertain,
 *  use the default checks ({@link PadLinkCheck#DEFAULT}) or the regular methods
 *  for linking the pads.
 * </blockquote>
 */
public class PadLinkCheck extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstPadLinkCheck";
    
    /**
     * Don't check hierarchy or caps compatibility.
     */
    public static final PadLinkCheck NOTHING = new PadLinkCheck(0);
    
    /**
     * Check the pads have same parents/grandparents.
     *   Could be omitted if it is already known that the two elements that own the
     *   pads are in the same bin.
     */
    public static final PadLinkCheck HIERARCHY = new PadLinkCheck(1);
    
    /**
     * Check if the pads are compatible by using
     *   their template caps. This is much faster than {@code GST_PAD_LINK_CHECK_CAPS}, but
     *   would be unsafe e.g. if one pad has {@code GST_CAPS_ANY}.
     */
    public static final PadLinkCheck TEMPLATE_CAPS = new PadLinkCheck(2);
    
    /**
     * Check if the pads are compatible by comparing the
     *   caps returned by gst_pad_query_caps().
     */
    public static final PadLinkCheck CAPS = new PadLinkCheck(4);
    
    /**
     * Disables pushing a reconfigure event when pads are
     *   linked.
     */
    public static final PadLinkCheck NO_RECONFIGURE = new PadLinkCheck(8);
    
    /**
     * The default checks done when linking
     *   pads (i.e. the ones used by gst_pad_link()).
     */
    public static final PadLinkCheck DEFAULT = new PadLinkCheck(5);
    
    public PadLinkCheck(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public PadLinkCheck or(PadLinkCheck mask) {
        return new PadLinkCheck(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static PadLinkCheck combined(PadLinkCheck mask, PadLinkCheck... masks) {
        int value = mask.getValue();        for (PadLinkCheck arg : masks) {
            value |= arg.getValue();
        }
        return new PadLinkCheck(value);
    }
}
