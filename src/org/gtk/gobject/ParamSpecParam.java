package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for %G_TYPE_PARAM
 * properties.
 */
public class ParamSpecParam extends ParamSpec {

    public ParamSpecParam(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ParamSpecParam */
    public static ParamSpecParam castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecParam(gobject.getProxy());
    }
    
}
