package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data type for holding variation data. Registered OpenType
 * variation-axis tags are listed in
 * [OpenType Axis Tag Registry](https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg).
 */
public class VariationT extends io.github.jwharm.javagi.interop.ResourceBase {

    public VariationT(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Converts an #hb_variation_t into a %NULL-terminated string in the format
     * understood by hb_variation_from_string(). The client in responsible for
     * allocating big enough size for @buf, 128 bytes is more than enough.
     */
    public void String(java.lang.String[] buf, int size) {
        gtk_h.hb_variation_to_string(handle(), Interop.allocateNativeArray(buf), size);
    }
    
}
