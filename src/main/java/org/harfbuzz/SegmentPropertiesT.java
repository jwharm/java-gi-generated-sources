package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The structure that holds various text properties of an {@link buffer_t}. Can be
 * set and retrieved using hb_buffer_set_segment_properties() and
 * hb_buffer_get_segment_properties(), respectively.
 */
public class SegmentPropertiesT extends io.github.jwharm.javagi.ResourceBase {

    public SegmentPropertiesT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public SegmentPropertiesT() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.hb_segment_properties_t.allocate(Interop.getAllocator()).address()));
    }
    
}
