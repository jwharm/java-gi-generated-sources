package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The structure that holds various text properties of an {@link buffer_t}. Can be
 * set and retrieved using hb_buffer_set_segment_properties() and
 * hb_buffer_get_segment_properties(), respectively.
 */
public class SegmentPropertiesT extends io.github.jwharm.javagi.ResourceBase {

    public SegmentPropertiesT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
