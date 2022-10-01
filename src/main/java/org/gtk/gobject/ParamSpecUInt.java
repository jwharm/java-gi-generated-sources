package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for unsigned integer properties.
 */
public class ParamSpecUInt extends ParamSpec {

    public ParamSpecUInt(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecUInt */
    public static ParamSpecUInt castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecUInt(gobject.refcounted());
    }
    
}
