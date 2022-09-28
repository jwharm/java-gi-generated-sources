package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for {@link ValueArray} properties.
 */
public class ParamSpecValueArray extends ParamSpec {

    public ParamSpecValueArray(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecValueArray */
    public static ParamSpecValueArray castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecValueArray(gobject.getReference());
    }
    
}
