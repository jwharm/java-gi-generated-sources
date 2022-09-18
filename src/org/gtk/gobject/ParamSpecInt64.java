package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gobject.ParamSpec} derived structure that contains the meta data for 64bit integer properties.
 */
public class ParamSpecInt64 extends ParamSpec {

    public ParamSpecInt64(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecInt64 */
    public static ParamSpecInt64 castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecInt64(gobject.getReference());
    }
    
}
