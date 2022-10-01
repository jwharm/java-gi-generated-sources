package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkKeymapKey} is a hardware key that can be mapped to a keyval.
 */
public class KeymapKey extends io.github.jwharm.javagi.ResourceBase {

    public KeymapKey(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public KeymapKey() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GdkKeymapKey.allocate(Interop.getAllocator()).address()));
    }
    
}
