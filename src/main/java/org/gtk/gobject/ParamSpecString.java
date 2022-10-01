package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for string
 * properties.
 */
public class ParamSpecString extends ParamSpec {

    public ParamSpecString(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecString */
    public static ParamSpecString castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecString(gobject.getReference());
    }
    
}
