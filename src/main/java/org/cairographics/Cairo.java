package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public final class Cairo {
    
    static {
        System.loadLibrary("cairo");
        System.loadLibrary("cairo-gobject");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
}
