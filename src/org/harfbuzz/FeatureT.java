package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #hb_feature_t is the structure that holds information about requested
 * feature application. The feature will be applied with the given value to all
 * glyphs which are in clusters between @start (inclusive) and @end (exclusive).
 * Setting start to #HB_FEATURE_GLOBAL_START and end to #HB_FEATURE_GLOBAL_END
 * specifies that the feature always applies to the entire buffer.
 */
public class FeatureT extends io.github.jwharm.javagi.interop.ResourceBase {

    public FeatureT(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Converts a #hb_feature_t into a %NULL-terminated string in the format
     * understood by hb_feature_from_string(). The client in responsible for
     * allocating big enough size for @buf, 128 bytes is more than enough.
     */
    public void String(java.lang.String[] buf, int size) {
        gtk_h.hb_feature_to_string(handle(), Interop.allocateNativeArray(buf), size);
    }
    
}
