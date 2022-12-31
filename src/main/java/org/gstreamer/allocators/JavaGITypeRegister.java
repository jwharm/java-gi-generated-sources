package org.gstreamer.allocators;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(DmaBufAllocator.getType(), DmaBufAllocator.fromAddress);
        Interop.typeRegister.put(FdAllocator.getType(), FdAllocator.fromAddress);
        Interop.typeRegister.put(PhysMemoryAllocator.getType(), PhysMemoryAllocator.fromAddress);
    }
}
