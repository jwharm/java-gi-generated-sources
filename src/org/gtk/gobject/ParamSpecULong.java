package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for unsigned long integer properties.
 */
public class ParamSpecULong extends ParamSpec {

    public ParamSpecULong(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecULong */
    public static ParamSpecULong castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecULong(gobject.getReference());
    }
    
}
