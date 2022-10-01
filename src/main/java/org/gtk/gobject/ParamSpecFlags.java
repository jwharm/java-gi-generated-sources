package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for flags
 * properties.
 */
public class ParamSpecFlags extends ParamSpec {

    public ParamSpecFlags(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecFlags */
    public static ParamSpecFlags castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecFlags(gobject.getReference());
    }
    
}
