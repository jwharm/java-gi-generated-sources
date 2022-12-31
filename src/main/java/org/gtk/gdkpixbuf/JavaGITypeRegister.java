package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(Pixbuf.getType(), Pixbuf.fromAddress);
        Interop.typeRegister.put(PixbufAnimation.getType(), PixbufAnimation.fromAddress);
        Interop.typeRegister.put(PixbufAnimationIter.getType(), PixbufAnimationIter.fromAddress);
        Interop.typeRegister.put(PixbufLoader.getType(), PixbufLoader.fromAddress);
        Interop.typeRegister.put(PixbufNonAnim.getType(), PixbufNonAnim.fromAddress);
        Interop.typeRegister.put(PixbufSimpleAnim.getType(), PixbufSimpleAnim.fromAddress);
        Interop.typeRegister.put(PixbufSimpleAnimIter.getType(), PixbufSimpleAnimIter.fromAddress);
    }
}
