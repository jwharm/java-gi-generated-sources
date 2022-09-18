package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gobject.ParamSpec} derived structure that contains the meta data for float properties.
 */
public class ParamSpecFloat extends ParamSpec {

    public ParamSpecFloat(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecFloat */
    public static ParamSpecFloat castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecFloat(gobject.getReference());
    }
    
}
