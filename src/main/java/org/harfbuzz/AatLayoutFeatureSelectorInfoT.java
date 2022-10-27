package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure representing a setting for an {@link AatLayoutFeatureTypeT}.
 */
public class AatLayoutFeatureSelectorInfoT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("name_id"),
        org.harfbuzz.AatLayoutFeatureSelectorT.getMemoryLayout().withName("enable"),
        org.harfbuzz.AatLayoutFeatureSelectorT.getMemoryLayout().withName("disable"),
        ValueLayout.JAVA_INT.withName("reserved")
    ).withName("hb_aat_layout_feature_selector_info_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public AatLayoutFeatureSelectorInfoT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
