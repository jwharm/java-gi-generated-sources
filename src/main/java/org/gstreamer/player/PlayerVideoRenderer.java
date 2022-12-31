package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public interface PlayerVideoRenderer extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayerVideoRendererImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PlayerVideoRendererImpl(input, ownership);
    
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
    
    class PlayerVideoRendererImpl extends org.gtk.gobject.GObject implements PlayerVideoRenderer {
        
        static {
            GstPlayer.javagi$ensureInitialized();
        }
        
        public PlayerVideoRendererImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
