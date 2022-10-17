package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for unichar (unsigned integer) properties.
 */
public class ParamSpecUnichar extends ParamSpec {

    public ParamSpecUnichar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecUnichar */
    public static ParamSpecUnichar castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecUnichar(gobject.refcounted());
    }
    
}
