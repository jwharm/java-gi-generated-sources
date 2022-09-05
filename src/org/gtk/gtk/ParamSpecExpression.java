package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GParamSpec` for properties holding a `GtkExpression`.
 */
public class ParamSpecExpression extends org.gtk.gobject.ParamSpec {

    public ParamSpecExpression(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ParamSpecExpression */
    public static ParamSpecExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecExpression(gobject.getProxy());
    }
    
}
