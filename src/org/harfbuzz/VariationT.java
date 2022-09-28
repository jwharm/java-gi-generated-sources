package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Data type for holding variation data. Registered OpenType
 * variation-axis tags are listed in
 * <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg">OpenType Axis Tag Registry</a>.
 */
public class VariationT extends io.github.jwharm.javagi.ResourceBase {

    public VariationT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public VariationT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_variation_t.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Converts an {@link variation_t} into a {@code null}-terminated string in the format
     * understood by hb_variation_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     */
    public void String(java.lang.String[] buf, int size) {
        gtk_h.hb_variation_to_string(handle(), Interop.allocateNativeArray(buf).handle(), size);
    }
    
}
