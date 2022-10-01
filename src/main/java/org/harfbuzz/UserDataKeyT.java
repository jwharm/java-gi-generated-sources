package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Data structure for holding user-data keys.
 */
public class UserDataKeyT extends io.github.jwharm.javagi.ResourceBase {

    public UserDataKeyT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public UserDataKeyT() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.hb_user_data_key_t.allocate(Interop.getAllocator()).address()));
    }
    
}
