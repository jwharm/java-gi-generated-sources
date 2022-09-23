package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Structure representing a name ID in a particular language.
 */
public class OtNameEntryT extends io.github.jwharm.javagi.ResourceBase {

    public OtNameEntryT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public OtNameEntryT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_ot_name_entry_t.allocate(Interop.getAllocator()).address()));
    }
    
}
