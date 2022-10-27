package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAnalysis} structure stores information about
 * the properties of a segment of text.
 */
public class Analysis extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("shape_engine"),
        Interop.valueLayout.ADDRESS.withName("lang_engine"),
        org.pango.Font.getMemoryLayout().withName("font"),
        ValueLayout.JAVA_BYTE.withName("level"),
        ValueLayout.JAVA_BYTE.withName("gravity"),
        ValueLayout.JAVA_BYTE.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("script"),
        org.pango.Language.getMemoryLayout().withName("language"),
        org.gtk.glib.SList.getMemoryLayout().withName("extra_attrs")
    ).withName("PangoAnalysis");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Analysis(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
