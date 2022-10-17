package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for unsigned long integer properties.
 */
public class ParamSpecULong extends ParamSpec {

    public ParamSpecULong(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecULong */
    public static ParamSpecULong castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecULong(gobject.refcounted());
    }
    
}
