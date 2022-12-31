package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public interface PlayerSignalDispatcher extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayerSignalDispatcherImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PlayerSignalDispatcherImpl(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_player_signal_dispatcher_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_player_signal_dispatcher_get_type = Interop.downcallHandle(
            "gst_player_signal_dispatcher_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class PlayerSignalDispatcherImpl extends org.gtk.gobject.GObject implements PlayerSignalDispatcher {
        
        static {
            GstPlayer.javagi$ensureInitialized();
        }
        
        public PlayerSignalDispatcherImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
