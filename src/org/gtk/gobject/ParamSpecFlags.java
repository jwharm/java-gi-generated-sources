package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for flags
 * properties.
 */
public class ParamSpecFlags extends ParamSpec {

    public ParamSpecFlags(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecFlags */
    public static ParamSpecFlags castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecFlags(gobject.getReference());
    }
    
}
