package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for object properties.
 */
public class ParamSpecObject extends ParamSpec {

    public ParamSpecObject(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ParamSpecObject */
    public static ParamSpecObject castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecObject(gobject.getProxy());
    }
    
}
