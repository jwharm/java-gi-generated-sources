package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for unsigned long integer properties.
 */
public class ParamSpecULong extends ParamSpec {

    public ParamSpecULong(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecULong */
    public static ParamSpecULong castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecULong(gobject.getReference());
    }
    
}
