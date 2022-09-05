package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for unsigned integer properties.
 */
public class ParamSpecUInt extends ParamSpec {

    public ParamSpecUInt(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ParamSpecUInt */
    public static ParamSpecUInt castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecUInt(gobject.getProxy());
    }
    
}
