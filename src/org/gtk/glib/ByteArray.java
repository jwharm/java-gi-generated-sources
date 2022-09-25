package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Contains the public fields of a GByteArray.
 */
public class ByteArray extends io.github.jwharm.javagi.ResourceBase {

    public ByteArray(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ByteArray() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GByteArray.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Frees the memory allocated by the {@link ByteArray}. If {@code free_segment} is
     * {@code true} it frees the actual byte data. If the reference count of
     * {@code array} is greater than one, the {@link ByteArray} wrapper is preserved but
     * the size of {@code array} will be set to zero.
     */
    public static PointerByte free(byte[] array, boolean freeSegment) {
        var RESULT = gtk_h.g_byte_array_free(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, array)).handle(), freeSegment ? 1 : 0);
        return new PointerByte(RESULT);
    }
    
    /**
     * Transfers the data from the {@link ByteArray} into a new immutable {@link Bytes}.
     * <p>
     * The {@link ByteArray} is freed unless the reference count of {@code array} is greater
     * than one, the {@link ByteArray} wrapper is preserved but the size of {@code array}
     * will be set to zero.
     * <p>
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
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Frees the data in the array and resets the size to zero, while
     * the underlying array is preserved for use elsewhere and returned
     * to the caller.
     */
    public static PointerByte steal(byte[] array, PointerLong len) {
        var RESULT = gtk_h.g_byte_array_steal(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, array)).handle(), len.handle());
        return new PointerByte(RESULT);
    }
    
    /**
     * Atomically decrements the reference count of {@code array} by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     */
    public static void unref(byte[] array) {
        gtk_h.g_byte_array_unref(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, array)).handle());
    }
    
}
