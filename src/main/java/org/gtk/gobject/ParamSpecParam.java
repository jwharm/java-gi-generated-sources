package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for {@code G_TYPE_PARAM}
 * properties.
 */
public class ParamSpecParam extends ParamSpec {

    public ParamSpecParam(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecParam */
    public static ParamSpecParam castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecParam(gobject.refcounted());
    }
    
}
