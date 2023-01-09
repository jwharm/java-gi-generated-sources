package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkKeymapKey} is a hardware key that can be mapped to a keyval.
 */
public class KeymapKey extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkKeymapKey";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("keycode"),
            Interop.valueLayout.C_INT.withName("group"),
            Interop.valueLayout.C_INT.withName("level")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link KeymapKey}
     * @return A new, uninitialized @{link KeymapKey}
     */
    public static KeymapKey allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        KeymapKey newInstance = new KeymapKey(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code keycode}
     * @return The value of the field {@code keycode}
     */
    public int getKeycode() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("keycode"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code keycode}
     * @param keycode The new value of the field {@code keycode}
     */
    public void setKeycode(int keycode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("keycode"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), keycode);
        }
    }
    
    /**
     * Get the value of the field {@code group}
     * @return The value of the field {@code group}
     */
    public int getGroup() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("group"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code group}
     * @param group The new value of the field {@code group}
     */
    public void setGroup(int group) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("group"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), group);
        }
    }
    
    /**
     * Get the value of the field {@code level}
     * @return The value of the field {@code level}
     */
    public int getLevel() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("level"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code level}
     * @param level The new value of the field {@code level}
     */
    public void setLevel(int level) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("level"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), level);
        }
    }
    
    /**
     * Create a KeymapKey proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected KeymapKey(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, KeymapKey> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new KeymapKey(input);
    
    /**
     * A {@link KeymapKey.Builder} object constructs a {@link KeymapKey} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link KeymapKey.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final KeymapKey struct;
        
        private Builder() {
            struct = KeymapKey.allocate();
        }
        
        /**
         * Finish building the {@link KeymapKey} struct.
         * @return A new instance of {@code KeymapKey} with the fields 
         *         that were set in the Builder object.
         */
        public KeymapKey build() {
            return struct;
        }
        
        /**
         * the hardware keycode. This is an identifying number for a
         *   physical key.
         * @param keycode The value for the {@code keycode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKeycode(int keycode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("keycode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), keycode);
                return this;
            }
        }
        
        /**
         * indicates movement in a horizontal direction. Usually groups are used
         *   for two different languages. In group 0, a key might have two English
         *   characters, and in group 1 it might have two Hebrew characters. The Hebrew
         *   characters will be printed on the key next to the English characters.
         * @param group The value for the {@code group} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGroup(int group) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("group"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), group);
                return this;
            }
        }
        
        /**
         * indicates which symbol on the key will be used, in a vertical direction.
         *   So on a standard US keyboard, the key with the number “1” on it also has the
         *   exclamation point ("!") character on it. The level indicates whether to use
         *   the “1” or the “!” symbol. The letter keys are considered to have a lowercase
         *   letter at level 0, and an uppercase letter at level 1, though only the
         *   uppercase letter is printed.
         * @param level The value for the {@code level} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLevel(int level) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("level"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), level);
                return this;
            }
        }
    }
}
