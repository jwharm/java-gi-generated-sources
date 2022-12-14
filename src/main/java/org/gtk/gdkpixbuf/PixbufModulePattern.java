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
public class PixbufModulePattern extends Struct {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufModulePattern";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("prefix"),
            Interop.valueLayout.ADDRESS.withName("mask"),
            Interop.valueLayout.C_INT.withName("relevance")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PixbufModulePattern}
     * @return A new, uninitialized @{link PixbufModulePattern}
     */
    public static PixbufModulePattern allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PixbufModulePattern newInstance = new PixbufModulePattern(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code prefix}
     * @return The value of the field {@code prefix}
     */
    public java.lang.String getPrefix() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prefix"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code prefix}
     * @param prefix The new value of the field {@code prefix}
     */
    public void setPrefix(java.lang.String prefix) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prefix"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prefix == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(prefix, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code mask}
     * @return The value of the field {@code mask}
     */
    public java.lang.String getMask() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mask"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code mask}
     * @param mask The new value of the field {@code mask}
     */
    public void setMask(java.lang.String mask) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mask"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mask == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(mask, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code relevance}
     * @return The value of the field {@code relevance}
     */
    public int getRelevance() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("relevance"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code relevance}
     * @param relevance The new value of the field {@code relevance}
     */
    public void setRelevance(int relevance) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("relevance"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), relevance);
        }
    }
    
    /**
     * Create a PixbufModulePattern proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PixbufModulePattern(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PixbufModulePattern> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PixbufModulePattern(input);
    
    /**
     * A {@link PixbufModulePattern.Builder} object constructs a {@link PixbufModulePattern} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PixbufModulePattern.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PixbufModulePattern struct;
        
        private Builder() {
            struct = PixbufModulePattern.allocate();
        }
        
        /**
         * Finish building the {@link PixbufModulePattern} struct.
         * @return A new instance of {@code PixbufModulePattern} with the fields 
         *         that were set in the Builder object.
         */
        public PixbufModulePattern build() {
            return struct;
        }
        
        /**
         * the prefix for this pattern
         * @param prefix The value for the {@code prefix} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPrefix(java.lang.String prefix) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prefix"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prefix == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(prefix, SCOPE)));
                return this;
            }
        }
        
        /**
         * mask containing bytes which modify how the prefix is matched against
         *  test data
         * @param mask The value for the {@code mask} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMask(java.lang.String mask) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mask"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mask == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(mask, SCOPE)));
                return this;
            }
        }
        
        /**
         * relevance of this pattern
         * @param relevance The value for the {@code relevance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRelevance(int relevance) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("relevance"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), relevance);
                return this;
            }
        }
    }
}
