package org.freetype;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global Freetype2 namespace.
 */
public final class Freetype2 {
    
    static {
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}

public static void libraryVersion() {
    try {
        DowncallHandles.FT_Library_Version.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}
    
    private static class DowncallHandles {

private static final MethodHandle FT_Library_Version = Interop.downcallHandle(
        "FT_Library_Version",
        FunctionDescriptor.ofVoid(),
        false
);
    }
    
    private static void registerTypes() {
    }
}
