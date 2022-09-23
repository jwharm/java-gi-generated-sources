package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@code GdkContentProvider}.
 */
public class ContentProviderClass extends io.github.jwharm.javagi.ResourceBase {

    public ContentProviderClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ContentProviderClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GdkContentProviderClass.allocate(Interop.getAllocator()).address()));
    }
    
}
