package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public interface PlayerVideoRenderer extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayerVideoRendererImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PlayerVideoRendererImpl(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_player_video_renderer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_player_video_renderer_get_type = Interop.downcallHandle(
                "gst_player_video_renderer_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The PlayerVideoRendererImpl type represents a native instance of the PlayerVideoRenderer interface.
     */
    class PlayerVideoRendererImpl extends org.gtk.gobject.GObject implements PlayerVideoRenderer {
        
        static {
            GstPlayer.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of PlayerVideoRenderer for the provided memory address.
         * @param address the memory address of the instance
         */
        public PlayerVideoRendererImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_player_video_renderer_get_type != null;
    }
}
