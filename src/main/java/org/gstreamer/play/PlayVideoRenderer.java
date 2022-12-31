package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public interface PlayVideoRenderer extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayVideoRendererImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PlayVideoRendererImpl(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_play_video_renderer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_play_video_renderer_get_type = Interop.downcallHandle(
            "gst_play_video_renderer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class PlayVideoRendererImpl extends org.gtk.gobject.GObject implements PlayVideoRenderer {
        
        static {
            GstPlay.javagi$ensureInitialized();
        }
        
        public PlayVideoRendererImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
