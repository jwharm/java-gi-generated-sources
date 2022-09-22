package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for boxed properties.
 */
public class ParamSpecBoxed extends ParamSpec {

    public ParamSpecBoxed(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecBoxed */
    public static ParamSpecBoxed castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecBoxed(gobject.getReference());
    }
    
}
