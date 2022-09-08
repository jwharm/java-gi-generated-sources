package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for integer properties.
 */
public class ParamSpecInt extends ParamSpec {

    public ParamSpecInt(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecInt */
    public static ParamSpecInt castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecInt(gobject.getReference());
    }
    
}
