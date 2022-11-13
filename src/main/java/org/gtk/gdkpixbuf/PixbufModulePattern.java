package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The signature prefix for a module.
 * <p>
 * The signature of a module is a set of prefixes. Prefixes are encoded as
 * pairs of ordinary strings, where the second string, called the mask, if
 * not {@code NULL}, must be of the same length as the first one and may contain
 * ' ', '!', 'x', 'z', and 'n' to indicate bytes that must be matched,
 * not matched, "don't-care"-bytes, zeros and non-zeros, respectively.
 * <p>
 * Each prefix has an associated integer that describes the relevance of
 * the prefix, with 0 meaning a mismatch and 100 a "perfect match".
 * <p>
 * Starting with gdk-pixbuf 2.8, the first byte of the mask may be '*',
 * indicating an unanchored pattern that matches not only at the beginning,
 * but also in the middle. Versions prior to 2.8 will interpret the '*'
 * like an 'x'.
 * <p>
 * The signature of a module is stored as an array of
 * {@code GdkPixbufModulePatterns}. The array is terminated by a pattern
 * where the {@code prefix} is {@code NULL}.
 * <pre>{@code c
 * GdkPixbufModulePattern *signature[] = {
 *   { "abcdx", " !x z", 100 },
 *   { "bla", NULL,  90 },
 *   { NULL, NULL, 0 }
 * };
 * }</pre>
 * <p>
 * In the example above, the signature matches e.g. "auud\\0" with
 * relevance 100, and "blau" with relevance 90.
 * @version 2.2
 */
public class PixbufModulePattern extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufModulePattern";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("prefix"),
        Interop.valueLayout.ADDRESS.withName("mask"),
        ValueLayout.JAVA_INT.withName("relevance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static PixbufModulePattern allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PixbufModulePattern newInstance = new PixbufModulePattern(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code prefix}
     * @return The value of the field {@code prefix}
     */
    public java.lang.String prefix$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prefix"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code prefix}
     * @param prefix The new value of the field {@code prefix}
     */
    public void prefix$set(java.lang.String prefix) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prefix"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(prefix));
    }
    
    /**
     * Get the value of the field {@code mask}
     * @return The value of the field {@code mask}
     */
    public java.lang.String mask$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mask"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code mask}
     * @param mask The new value of the field {@code mask}
     */
    public void mask$set(java.lang.String mask) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mask"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(mask));
    }
    
    /**
     * Get the value of the field {@code relevance}
     * @return The value of the field {@code relevance}
     */
    public int relevance$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("relevance"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code relevance}
     * @param relevance The new value of the field {@code relevance}
     */
    public void relevance$set(int relevance) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("relevance"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), relevance);
    }
    
    /**
     * Create a PixbufModulePattern proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PixbufModulePattern(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
