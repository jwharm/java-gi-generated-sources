package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Contains the public fields of a GByteArray.
 */
public class ByteArray extends io.github.jwharm.javagi.interop.ResourceBase {

    public ByteArray(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Transfers the data from the #GByteArray into a new immutable #GBytes.
     * 
     * The #GByteArray is freed unless the reference count of @array is greater
     * than one, the #GByteArray wrapper is preserved but the size of @array
     * will be set to zero.
     * 
     * This is identical to using g_bytes_new_take() and g_byte_array_free()
     * together.
     */
    public static Bytes freeToBytes(byte[] array) {
        var RESULT = gtk_h.g_byte_array_free_to_bytes(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, array)).handle());
        return new Bytes(References.get(RESULT, true));
    }
    
    /**
     * Atomically decrements the reference count of @array by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     */
    public static void unref(byte[] array) {
        gtk_h.g_byte_array_unref(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, array)).handle());
    }
    
}
