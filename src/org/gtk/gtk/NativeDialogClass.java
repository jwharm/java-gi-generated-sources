package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
