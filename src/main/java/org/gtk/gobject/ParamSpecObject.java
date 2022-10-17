package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for object properties.
 */
public class ParamSpecObject extends ParamSpec {

    public ParamSpecObject(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecObject */
    public static ParamSpecObject castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecObject(gobject.refcounted());
    }
    
}
