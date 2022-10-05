package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GParamSpec} for properties holding a {@code GtkExpression}.
 */
public class ParamSpecExpression extends org.gtk.gobject.ParamSpec {

    public ParamSpecExpression(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecExpression */
    public static ParamSpecExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecExpression(gobject.refcounted());
    }
    
}
