package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Structure representing a setting for an {@link aat_layout_feature_type_t}.
 */
public class AatLayoutFeatureSelectorInfoT extends io.github.jwharm.javagi.ResourceBase {

    public AatLayoutFeatureSelectorInfoT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public AatLayoutFeatureSelectorInfoT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_aat_layout_feature_selector_info_t.allocate(Interop.getAllocator()).address()));
    }
    
}
