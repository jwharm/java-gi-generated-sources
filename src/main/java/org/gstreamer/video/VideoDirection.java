package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The interface allows unified access to control flipping and rotation
 * operations of video-sources or operators.
 * @version 1.10
 */
public interface VideoDirection extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoDirectionImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoDirectionImpl(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_direction_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_video_direction_get_type = Interop.downcallHandle(
            "gst_video_direction_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class VideoDirectionImpl extends org.gtk.gobject.GObject implements VideoDirection {
        
        static {
            GstVideo.javagi$ensureInitialized();
        }
        
        public VideoDirectionImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
