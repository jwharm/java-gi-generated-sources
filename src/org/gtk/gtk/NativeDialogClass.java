package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@code GtkNativeDialog}.
 */
public class NativeDialogClass extends io.github.jwharm.javagi.ResourceBase {

    public NativeDialogClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public NativeDialogClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkNativeDialogClass.allocate(Interop.getAllocator()).address()));
    }
    
}
