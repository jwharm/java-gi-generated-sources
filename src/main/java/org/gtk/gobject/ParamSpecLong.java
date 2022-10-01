package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for long integer properties.
 */
public class ParamSpecLong extends ParamSpec {

    public ParamSpecLong(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecLong */
    public static ParamSpecLong castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecLong(gobject.refcounted());
    }
    
}
