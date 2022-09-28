package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class PreferencesGroupClass extends io.github.jwharm.javagi.ResourceBase {

    public PreferencesGroupClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PreferencesGroupClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwPreferencesGroupClass.allocate(Interop.getAllocator()).address()));
    }
    
}
