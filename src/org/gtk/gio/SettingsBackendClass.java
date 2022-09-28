package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link SettingsBackend}.
 */
public class SettingsBackendClass extends io.github.jwharm.javagi.ResourceBase {

    public SettingsBackendClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SettingsBackendClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GSettingsBackendClass.allocate(Interop.getAllocator()).address()));
    }
    
}
