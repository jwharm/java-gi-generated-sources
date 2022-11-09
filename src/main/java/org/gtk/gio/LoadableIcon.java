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
     * Cast object to LoadableIcon if its GType is a (or inherits from) "GLoadableIcon".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "LoadableIcon" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GLoadableIcon", a ClassCastException will be thrown.
     */
    public static LoadableIcon castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GLoadableIcon"))) {
            return new LoadableIconImpl(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GLoadableIcon");
        }
    }
    
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
    default @NotNull org.gtk.gio.InputStream load(int size, @NotNull Out<java.lang.String> type, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment typePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_loadable_icon_load.invokeExact(
                    handle(),
                    size,
                    (Addressable) typePOINTER.address(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        type.set(Interop.getStringFrom(typePOINTER.get(ValueLayout.ADDRESS, 0)));
        return new org.gtk.gio.InputStream(RESULT, Ownership.FULL);
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
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
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
    default @NotNull org.gtk.gio.InputStream loadFinish(@NotNull org.gtk.gio.AsyncResult res, @NotNull Out<java.lang.String> type) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment typePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_loadable_icon_load_finish.invokeExact(
                    handle(),
                    res.handle(),
                    (Addressable) typePOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        type.set(Interop.getStringFrom(typePOINTER.get(ValueLayout.ADDRESS, 0)));
        return new org.gtk.gio.InputStream(RESULT, Ownership.FULL);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_loadable_icon_load = Interop.downcallHandle(
            "g_loadable_icon_load",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_loadable_icon_load_async = Interop.downcallHandle(
            "g_loadable_icon_load_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_loadable_icon_load_finish = Interop.downcallHandle(
            "g_loadable_icon_load_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    class LoadableIconImpl extends org.gtk.gobject.Object implements LoadableIcon {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public LoadableIconImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
