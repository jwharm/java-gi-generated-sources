package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for integer properties.
 */
public class ParamSpecInt extends ParamSpec {

    public ParamSpecInt(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecInt */
    public static ParamSpecInt castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecInt(gobject.getReference());
    }
    
}
