package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for unsigned character properties.
 */
public class ParamSpecUChar extends ParamSpec {

    public ParamSpecUChar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecUChar */
    public static ParamSpecUChar castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecUChar(gobject.refcounted());
    }
    
}