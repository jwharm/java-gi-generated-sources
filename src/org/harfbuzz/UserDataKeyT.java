package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Data structure for holding user-data keys.
 */
public class UserDataKeyT extends io.github.jwharm.javagi.ResourceBase {

    public UserDataKeyT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public UserDataKeyT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_user_data_key_t.allocate(Interop.getAllocator()).address()));
    }
    
}
