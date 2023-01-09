package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extends the {@link Icon} interface and adds the ability to
 * load icons from streams.
 */
public interface LoadableIcon extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, LoadableIconImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new LoadableIconImpl(input);
    
    /**
     * Loads a loadable icon. For the asynchronous version of this function,
     * see g_loadable_icon_load_async().
     * @param size an integer.
     * @param type a location to store the type of the loaded
     * icon, {@code null} to ignore.
     * @param cancellable optional {@link Cancellable} object, {@code null} to
     * ignore.
     * @return a {@link InputStream} to read the icon from.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default org.gtk.gio.InputStream load(int size, @Nullable Out<java.lang.String> type, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment typePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_loadable_icon_load.invokeExact(
                        handle(),
                        size,
                        (Addressable) (type == null ? MemoryAddress.NULL : (Addressable) typePOINTER.address()),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (type != null) type.set(Marshal.addressToString.marshal(typePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            var OBJECT = (org.gtk.gio.InputStream) Interop.register(RESULT, org.gtk.gio.InputStream.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Loads an icon asynchronously. To finish this function, see
     * g_loadable_icon_load_finish(). For the synchronous, blocking
     * version of this function, see g_loadable_icon_load().
     * @param size an integer.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback} to call when the
     *            request is satisfied
     */
    default void loadAsync(int size, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_loadable_icon_load_async.invokeExact(
                    handle(),
                    size,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous icon load started in g_loadable_icon_load_async().
     * @param res a {@link AsyncResult}.
     * @param type a location to store the type of the loaded
     *        icon, {@code null} to ignore.
     * @return a {@link InputStream} to read the icon from.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default org.gtk.gio.InputStream loadFinish(org.gtk.gio.AsyncResult res, @Nullable Out<java.lang.String> type) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment typePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_loadable_icon_load_finish.invokeExact(
                        handle(),
                        res.handle(),
                        (Addressable) (type == null ? MemoryAddress.NULL : (Addressable) typePOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (type != null) type.set(Marshal.addressToString.marshal(typePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            var OBJECT = (org.gtk.gio.InputStream) Interop.register(RESULT, org.gtk.gio.InputStream.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_loadable_icon_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_loadable_icon_load = Interop.downcallHandle(
                "g_loadable_icon_load",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_loadable_icon_load_async = Interop.downcallHandle(
                "g_loadable_icon_load_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_loadable_icon_load_finish = Interop.downcallHandle(
                "g_loadable_icon_load_finish",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_loadable_icon_get_type = Interop.downcallHandle(
                "g_loadable_icon_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The LoadableIconImpl type represents a native instance of the LoadableIcon interface.
     */
    class LoadableIconImpl extends org.gtk.gobject.GObject implements LoadableIcon {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of LoadableIcon for the provided memory address.
         * @param address the memory address of the instance
         */
        public LoadableIconImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_loadable_icon_get_type != null;
    }
}
