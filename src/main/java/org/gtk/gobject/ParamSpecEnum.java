package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for enum
 * properties.
 */
public class ParamSpecEnum extends ParamSpec {

    public ParamSpecEnum(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecEnum */
    public static ParamSpecEnum castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecEnum(gobject.refcounted());
    }
    
}