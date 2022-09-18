package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Contains the public fields of a GByteArray.
 */
public class ByteArray extends io.github.jwharm.javagi.ResourceBase {

    public ByteArray(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Transfers the data from the {@link org.gtk.glib.ByteArray} into a new immutable {@link org.gtk.glib.Bytes} 
     * 
     * The {@link org.gtk.glib.ByteArray} is freed unless the reference count of @array is greater
     * than one, the {@link org.gtk.glib.ByteArray} wrapper is preserved but the size of @array
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
     * Like g_byte_array_sort(), but the comparison function takes an extra
     * user data argument.
     */
    public static void sortWithData(byte[] array, CompareDataFunc compareFunc) {
        try {
            gtk_h.g_byte_array_sort_with_data(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, array)).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
