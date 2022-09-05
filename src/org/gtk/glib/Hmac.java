package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a HMAC operation.
 * To create a new GHmac, use g_hmac_new(). To free
 * a GHmac, use g_hmac_unref().
 */
public class Hmac extends io.github.jwharm.javagi.interop.ResourceBase {

    public Hmac(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Copies a #GHmac. If @hmac has been closed, by calling
     * g_hmac_get_string() or g_hmac_get_digest(), the copied
     * HMAC will be closed as well.
     */
    public Hmac copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_hmac_copy(HANDLE());
        return new Hmac(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the HMAC as a hexadecimal string.
     * 
     * Once this function has been called the #GHmac can no longer be
     * updated with g_hmac_update().
     * 
     * The hexadecimal characters will be lower case.
     */
    public java.lang.String getString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_hmac_get_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Atomically increments the reference count of @hmac by one.
     * 
     * This function is MT-safe and may be called from any thread.
     */
    public Hmac ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_hmac_ref(HANDLE());
        return new Hmac(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Atomically decrements the reference count of @hmac by one.
     * 
     * If the reference count drops to 0, all keys and values will be
     * destroyed, and all memory allocated by the hash table is released.
     * This function is MT-safe and may be called from any thread.
     * Frees the memory allocated for @hmac.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_hmac_unref(HANDLE());
    }
    
    /**
     * Feeds @data into an existing #GHmac.
     * 
     * The HMAC must still be open, that is g_hmac_get_string() or
     * g_hmac_get_digest() must not have been called on @hmac.
     */
    public void update(byte[] data, long length) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_hmac_update(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data), length);
    }
    
}
