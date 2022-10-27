package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes transitions types of a {@link Flap} widget.
 * <p>
 * It determines the type of animation when transitioning between children in a
 * {@link Flap} widget, as well as which areas can be swiped via
 * {@code Flap:swipe-to-open] and [property@Flap:swipe-to-close}.
 * <p>
 * New values may be added to this enum over time.
 * @version 1.0
 */
public class FlapTransitionType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The flap slides over the content, which is
     *   dimmed. When folded, only the flap can be swiped.
     */
    public static final FlapTransitionType OVER = new FlapTransitionType(0);
    
    /**
     * The content slides over the flap. Only the
     *   content can be swiped.
     */
    public static final FlapTransitionType UNDER = new FlapTransitionType(1);
    
    /**
     * The flap slides offscreen when hidden,
     *   neither the flap nor content overlap each other. Both widgets can be
     *   swiped.
     */
    public static final FlapTransitionType SLIDE = new FlapTransitionType(2);
    
    public FlapTransitionType(int value) {
        super(value);
    }
}
