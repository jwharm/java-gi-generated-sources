package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Extends the #GIcon interface and adds the ability to
 * load icons from streams.
 */
public interface LoadableIcon extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Loads a loadable icon. For the asynchronous version of this function,
     * see g_loadable_icon_load_async().
     */
    public default InputStream load(int size, java.lang.String[] type, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
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
    public default void loadAsync(int size, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_loadable_icon_load_async(handle(), size, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous icon load started in g_loadable_icon_load_async().
     */
    public default InputStream loadFinish(AsyncResult res, java.lang.String[] type) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_loadable_icon_load_finish(handle(), res.handle(), Interop.allocateNativeArray(type).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new InputStream(References.get(RESULT, true));
    }
    
    class LoadableIconImpl extends org.gtk.gobject.Object implements LoadableIcon {
        public LoadableIconImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
