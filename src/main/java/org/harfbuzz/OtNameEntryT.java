package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure representing a name ID in a particular language.
 * @version 2.1.0
 */
public class OtNameEntryT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("name_id"),
        org.harfbuzz.VarIntT.getMemoryLayout().withName("var"),
        org.harfbuzz.LanguageT.getMemoryLayout().withName("language")
    ).withName("hb_ot_name_entry_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public OtNameEntryT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
