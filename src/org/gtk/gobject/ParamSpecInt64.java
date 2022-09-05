package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for 64bit integer properties.
 */
public class ParamSpecInt64 extends ParamSpec {

    public ParamSpecInt64(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ParamSpecInt64 */
    public static ParamSpecInt64 castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecInt64(gobject.getProxy());
    }
    
}
