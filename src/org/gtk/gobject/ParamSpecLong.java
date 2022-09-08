package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for long integer properties.
 */
public class ParamSpecLong extends ParamSpec {

    public ParamSpecLong(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecLong */
    public static ParamSpecLong castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecLong(gobject.getReference());
    }
    
}
