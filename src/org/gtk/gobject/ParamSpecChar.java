package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for character properties.
 */
public class ParamSpecChar extends ParamSpec {

    public ParamSpecChar(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ParamSpecChar */
    public static ParamSpecChar castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecChar(gobject.getProxy());
    }
    
}
