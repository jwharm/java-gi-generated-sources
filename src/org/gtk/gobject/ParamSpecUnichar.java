package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for unichar (unsigned integer) properties.
 */
public class ParamSpecUnichar extends ParamSpec {

    public ParamSpecUnichar(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ParamSpecUnichar */
    public static ParamSpecUnichar castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecUnichar(gobject.getProxy());
    }
    
}
