package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for long integer properties.
 */
public class ParamSpecLong extends ParamSpec {

    public ParamSpecLong(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecLong */
    public static ParamSpecLong castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecLong(gobject.getReference());
    }
    
}
