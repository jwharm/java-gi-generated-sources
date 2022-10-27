package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The structure that holds various text properties of an {@link BufferT}. Can be
 * set and retrieved using hb_buffer_set_segment_properties() and
 * hb_buffer_get_segment_properties(), respectively.
 */
public class SegmentPropertiesT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.harfbuzz.DirectionT.getMemoryLayout().withName("direction"),
        org.harfbuzz.ScriptT.getMemoryLayout().withName("script"),
        org.harfbuzz.LanguageT.getMemoryLayout().withName("language"),
        Interop.valueLayout.ADDRESS.withName("reserved1"),
        Interop.valueLayout.ADDRESS.withName("reserved2")
    ).withName("hb_segment_properties_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public SegmentPropertiesT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
