package org.gtk.gio;

import org.gtk.gobject.*;
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
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_loadable_icon_load(HANDLE(), size, Interop.allocateNativeArray(type), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new InputStream(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Finishes an asynchronous icon load started in g_loadable_icon_load_async().
     */
    public default InputStream loadFinish(AsyncResult res, java.lang.String[] type) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_loadable_icon_load_finish(HANDLE(), res.HANDLE(), Interop.allocateNativeArray(type), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new InputStream(ProxyFactory.getProxy(RESULT, true));
    }
    
    class LoadableIconImpl extends org.gtk.gobject.Object implements LoadableIcon {
        public LoadableIconImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}