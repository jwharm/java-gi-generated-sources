package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for #GValueArray properties.
 */
public class ParamSpecValueArray extends ParamSpec {

    public ParamSpecValueArray(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ParamSpecValueArray */
    public static ParamSpecValueArray castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecValueArray(gobject.getProxy());
    }
    
}
