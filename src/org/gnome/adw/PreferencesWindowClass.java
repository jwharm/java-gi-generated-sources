package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class PreferencesWindowClass extends io.github.jwharm.javagi.ResourceBase {

    public PreferencesWindowClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PreferencesWindowClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwPreferencesWindowClass.allocate(Interop.getAllocator()).address()));
    }
    
}
