package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for double properties.
 */
public class ParamSpecDouble extends ParamSpec {

    public ParamSpecDouble(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecDouble */
    public static ParamSpecDouble castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecDouble(gobject.refcounted());
    }
    
}
