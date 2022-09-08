package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for double properties.
 */
public class ParamSpecDouble extends ParamSpec {

    public ParamSpecDouble(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecDouble */
    public static ParamSpecDouble castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecDouble(gobject.getReference());
    }
    
}
