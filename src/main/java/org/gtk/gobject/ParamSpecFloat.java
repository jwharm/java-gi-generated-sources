package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for float properties.
 */
public class ParamSpecFloat extends ParamSpec {

    public ParamSpecFloat(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecFloat */
    public static ParamSpecFloat castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecFloat(gobject.refcounted());
    }
    
}
