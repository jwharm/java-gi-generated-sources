package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Interface that is used by backends to associate default
 * handlers with URI schemes.
 */
public class DesktopAppInfoLookupIface extends io.github.jwharm.javagi.ResourceBase {

    public DesktopAppInfoLookupIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DesktopAppInfoLookupIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDesktopAppInfoLookupIface.allocate(Interop.getAllocator()).address()));
    }
    
}
