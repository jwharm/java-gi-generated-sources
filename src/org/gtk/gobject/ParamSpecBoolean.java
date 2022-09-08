package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for boolean properties.
 */
public class ParamSpecBoolean extends ParamSpec {

    public ParamSpecBoolean(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecBoolean */
    public static ParamSpecBoolean castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecBoolean(gobject.getReference());
    }
    
}
