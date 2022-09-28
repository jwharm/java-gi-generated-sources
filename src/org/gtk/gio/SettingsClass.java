package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class SettingsClass extends io.github.jwharm.javagi.ResourceBase {

    public SettingsClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SettingsClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GSettingsClass.allocate(Interop.getAllocator()).address()));
    }
    
}
