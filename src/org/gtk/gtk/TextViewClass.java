package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TextViewClass extends io.github.jwharm.javagi.ResourceBase {

    public TextViewClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TextViewClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkTextViewClass.allocate(Interop.getAllocator()).address()));
    }
    
}
