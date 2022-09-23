package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FontFamilyClass extends io.github.jwharm.javagi.ResourceBase {

    public FontFamilyClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FontFamilyClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoFontFamilyClass.allocate(Interop.getAllocator()).address()));
    }
    
}
