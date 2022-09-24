package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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