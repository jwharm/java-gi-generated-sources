package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Structure used for scatter/gather data input.
 * You generally pass in an array of <code>#GInputVectors</code> and the operation will store the read data starting in the
 * first buffer, switching to the next as needed.
 */
public class InputVector extends io.github.jwharm.javagi.ResourceBase {

    public InputVector(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
