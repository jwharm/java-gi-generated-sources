package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for 64bit integer properties.
 */
public class ParamSpecInt64 extends ParamSpec {

    public ParamSpecInt64(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecInt64 */
    public static ParamSpecInt64 castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecInt64(gobject.refcounted());
    }
    
}
