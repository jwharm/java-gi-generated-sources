package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class CarouselClass extends io.github.jwharm.javagi.ResourceBase {

    public CarouselClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public CarouselClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwCarouselClass.allocate(Interop.getAllocator()).address()));
    }
    
}
