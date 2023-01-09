package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayerGMainContextSignalDispatcher extends org.gtk.gobject.GObject implements org.gstreamer.player.PlayerSignalDispatcher {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerGMainContextSignalDispatcher";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PlayerGMainContextSignalDispatcher proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PlayerGMainContextSignalDispatcher(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayerGMainContextSignalDispatcher> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PlayerGMainContextSignalDispatcher(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_player_g_main_context_signal_dispatcher_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a new GstPlayerSignalDispatcher that uses {@code application_context},
     * or the thread default one if {@code null} is used. See gst_player_new().
     * @param applicationContext GMainContext to use or {@code null}
     * @return the new GstPlayerSignalDispatcher
     */
    public static org.gstreamer.player.PlayerSignalDispatcher new_(@Nullable org.gtk.glib.MainContext applicationContext) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_g_main_context_signal_dispatcher_new.invokeExact((Addressable) (applicationContext == null ? MemoryAddress.NULL : applicationContext.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.player.PlayerSignalDispatcher) Interop.register(RESULT, org.gstreamer.player.PlayerSignalDispatcher.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A {@link PlayerGMainContextSignalDispatcher.Builder} object constructs a {@link PlayerGMainContextSignalDispatcher} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PlayerGMainContextSignalDispatcher.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PlayerGMainContextSignalDispatcher} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PlayerGMainContextSignalDispatcher}.
         * @return A new instance of {@code PlayerGMainContextSignalDispatcher} with the properties 
         *         that were set in the Builder object.
         */
        public PlayerGMainContextSignalDispatcher build() {
            return (PlayerGMainContextSignalDispatcher) org.gtk.gobject.GObject.newWithProperties(
                PlayerGMainContextSignalDispatcher.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setApplicationContext(org.gtk.glib.MainContext applicationContext) {
            names.add("application-context");
            values.add(org.gtk.gobject.Value.create(applicationContext));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_player_g_main_context_signal_dispatcher_get_type = Interop.downcallHandle(
                "gst_player_g_main_context_signal_dispatcher_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_player_g_main_context_signal_dispatcher_new = Interop.downcallHandle(
                "gst_player_g_main_context_signal_dispatcher_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_player_g_main_context_signal_dispatcher_get_type != null;
    }
}
