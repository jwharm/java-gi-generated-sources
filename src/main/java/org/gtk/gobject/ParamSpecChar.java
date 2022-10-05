package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for character properties.
 */
public class ParamSpecChar extends ParamSpec {

    public ParamSpecChar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecChar */
    public static ParamSpecChar castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecChar(gobject.refcounted());
    }
    
}