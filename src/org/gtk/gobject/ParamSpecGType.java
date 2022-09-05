package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for #GType properties.
 */
public class ParamSpecGType extends ParamSpec {

    public ParamSpecGType(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ParamSpecGType */
    public static ParamSpecGType castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecGType(gobject.getProxy());
    }
    
}
