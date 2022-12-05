package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public interface PlayVideoRenderer extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to PlayVideoRenderer if its GType is a (or inherits from) "GstPlayVideoRenderer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PlayVideoRenderer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPlayVideoRenderer", a ClassCastException will be thrown.
     */
    public static PlayVideoRenderer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PlayVideoRenderer.getType())) {
            return new PlayVideoRendererImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstPlayVideoRenderer");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    
    class PlayVideoRendererImpl extends org.gtk.gobject.Object implements PlayVideoRenderer {
        
        static {
            GstPlay.javagi$ensureInitialized();
        }
        
        public PlayVideoRendererImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
