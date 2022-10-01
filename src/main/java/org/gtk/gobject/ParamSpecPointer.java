package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for pointer properties.
 */
public class ParamSpecPointer extends ParamSpec {

    public ParamSpecPointer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecPointer */
    public static ParamSpecPointer castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecPointer(gobject.refcounted());
    }
    
}
