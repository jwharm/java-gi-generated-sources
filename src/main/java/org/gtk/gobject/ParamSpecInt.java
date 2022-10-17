package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for integer properties.
 */
public class ParamSpecInt extends ParamSpec {

    public ParamSpecInt(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecInt */
    public static ParamSpecInt castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecInt(gobject.refcounted());
    }
    
}
