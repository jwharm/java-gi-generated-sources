package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link URIHandler} is an interface that is implemented by Source and Sink
 * {@link Element} to unify handling of URI.
 * <p>
 * An application can use the following functions to quickly get an element
 * that handles the given URI for reading or writing
 * (gst_element_make_from_uri()).
 * <p>
 * Source and Sink plugins should implement this interface when possible.
 */
public interface URIHandler extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to URIHandler if its GType is a (or inherits from) "GstURIHandler".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code URIHandler} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstURIHandler", a ClassCastException will be thrown.
     */
    public static URIHandler castFrom(org.gtk.gobject.Object gobject) {
            return new URIHandlerImpl(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Gets the list of protocols supported by {@code handler}. This list may not be
     * modified.
     * @return the
     *     supported protocols.  Returns {@code null} if the {@code handler} isn't
     *     implemented properly, or the {@code handler} doesn't support any
     *     protocols.
     */
    default @Nullable PointerString getProtocols() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_handler_get_protocols.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the currently handled URI.
     * @return the URI currently handled by
     *   the {@code handler}.  Returns {@code null} if there are no URI currently
     *   handled. The returned string must be freed with g_free() when no
     *   longer needed.
     */
    default @Nullable java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_handler_get_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the type of the given URI handler
     * @return the {@link URIType} of the URI handler.
     * Returns {@code GST_URI_UNKNOWN} if the {@code handler} isn't implemented correctly.
     */
    default @NotNull org.gstreamer.gst.URIType getUriType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_handler_get_uri_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.URIType(RESULT);
    }
    
    /**
     * Tries to set the URI of the given handler.
     * @param uri URI to set
     * @return {@code true} if the URI was set successfully, else {@code false}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setUri(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_handler_set_uri.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_uri_handler_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_uri_handler_get_protocols = Interop.downcallHandle(
            "gst_uri_handler_get_protocols",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_uri_handler_get_uri = Interop.downcallHandle(
            "gst_uri_handler_get_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_uri_handler_get_uri_type = Interop.downcallHandle(
            "gst_uri_handler_get_uri_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_uri_handler_set_uri = Interop.downcallHandle(
            "gst_uri_handler_set_uri",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_uri_handler_get_type = Interop.downcallHandle(
            "gst_uri_handler_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class URIHandlerImpl extends org.gtk.gobject.Object implements URIHandler {
        
        static {
            Gst.javagi$ensureInitialized();
        }
        
        public URIHandlerImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
