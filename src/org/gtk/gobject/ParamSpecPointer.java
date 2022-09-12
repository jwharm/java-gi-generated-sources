package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for pointer properties.
 */
public class ParamSpecPointer extends ParamSpec {

    public ParamSpecPointer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecPointer */
    public static ParamSpecPointer castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecPointer(gobject.getReference());
    }
    
}
