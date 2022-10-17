package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for boolean properties.
 */
public class ParamSpecBoolean extends ParamSpec {

    public ParamSpecBoolean(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecBoolean */
    public static ParamSpecBoolean castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecBoolean(gobject.refcounted());
    }
    
}
