package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for string
 * properties.
 */
public class ParamSpecString extends ParamSpec {

    public ParamSpecString(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ParamSpecString */
    public static ParamSpecString castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecString(gobject.getProxy());
    }
    
}
