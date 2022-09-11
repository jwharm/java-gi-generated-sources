package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Extends the #GIcon interface and adds the ability to
 * load icons from streams.
 */
public interface LoadableIcon extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Loads a loadable icon. For the asynchronous version of this function,
     * see g_loadable_icon_load_async().
     */
    public default InputStream load(int size, java.lang.String[] type, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_loadable_icon_load(handle(), size, Interop.allocateNativeArray(type).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new InputStream(References.get(RESULT, true));
    }
    
    /**
     * Loads an icon asynchronously. To finish this function, see
     * g_loadable_icon_load_finish(). For the synchronous, blocking
     * version of this function, see g_loadable_icon_load().
     */
    public default void loadAsync(LoadableIcon icon, int size, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_loadable_icon_load_async(handle(), size, cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous icon load started in g_loadable_icon_load_async().
     */
    public default InputStream loadFinish(AsyncResult res, java.lang.String[] type) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_loadable_icon_load_finish(handle(), res.handle(), Interop.allocateNativeArray(type).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new InputStream(References.get(RESULT, true));
    }
    
    class LoadableIconImpl extends org.gtk.gobject.Object implements LoadableIcon {
        public LoadableIconImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
