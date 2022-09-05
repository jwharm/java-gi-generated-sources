package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for unsigned long integer properties.
 */
public class ParamSpecULong extends ParamSpec {

    public ParamSpecULong(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ParamSpecULong */
    public static ParamSpecULong castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecULong(gobject.getProxy());
    }
    
}
