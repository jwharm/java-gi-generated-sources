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

    @ApiStatus.Internal static final MethodHandle g_loadable_icon_load = Interop.downcallHandle(
        "g_loadable_icon_load",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads a loadable icon. For the asynchronous version of this function,
     * see g_loadable_icon_load_async().
     */
    default @NotNull InputStream load(@NotNull int size, @NotNull Out<java.lang.String> type, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment typePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_loadable_icon_load.invokeExact(handle(), size, (Addressable) typePOINTER.address(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        type.set(typePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new InputStream(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_loadable_icon_load_async = Interop.downcallHandle(
        "g_loadable_icon_load_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads an icon asynchronously. To finish this function, see
     * g_loadable_icon_load_finish(). For the synchronous, blocking
     * version of this function, see g_loadable_icon_load().
     */
    default @NotNull void loadAsync(@NotNull int size, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_loadable_icon_load_async.invokeExact(handle(), size, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_loadable_icon_load_finish = Interop.downcallHandle(
        "g_loadable_icon_load_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous icon load started in g_loadable_icon_load_async().
     */
    default @NotNull InputStream loadFinish(@NotNull AsyncResult res, @NotNull Out<java.lang.String> type) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment typePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_loadable_icon_load_finish.invokeExact(handle(), res.handle(), (Addressable) typePOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        type.set(typePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new InputStream(Refcounted.get(RESULT, true));
    }
    
    class LoadableIconImpl extends org.gtk.gobject.Object implements LoadableIcon {
        public LoadableIconImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
