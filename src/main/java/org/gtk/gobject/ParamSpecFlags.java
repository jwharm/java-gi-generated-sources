package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for flags
 * properties.
 */
public class ParamSpecFlags extends ParamSpec {

    public ParamSpecFlags(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecFlags */
    public static ParamSpecFlags castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecFlags(gobject.refcounted());
    }
    
}
