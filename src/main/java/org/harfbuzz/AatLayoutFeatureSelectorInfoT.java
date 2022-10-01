package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Structure representing a setting for an {@link aat_layout_feature_type_t}.
 */
public class AatLayoutFeatureSelectorInfoT extends io.github.jwharm.javagi.ResourceBase {

    public AatLayoutFeatureSelectorInfoT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public AatLayoutFeatureSelectorInfoT() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.hb_aat_layout_feature_selector_info_t.allocate(Interop.getAllocator()).address()));
    }
    
}
