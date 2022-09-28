package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class PreferencesRowClass extends io.github.jwharm.javagi.ResourceBase {

    public PreferencesRowClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PreferencesRowClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwPreferencesRowClass.allocate(Interop.getAllocator()).address()));
    }
    
}
