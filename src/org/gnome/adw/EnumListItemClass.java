package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class EnumListItemClass extends io.github.jwharm.javagi.ResourceBase {

    public EnumListItemClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public EnumListItemClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwEnumListItemClass.allocate(Interop.getAllocator()).address()));
    }
    
}
