package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A struct that specifies a border around a rectangular area.
 * <p>
 * Each side can have different width.
 */
public class Border extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBorder";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("left"),
            Interop.valueLayout.C_SHORT.withName("right"),
            Interop.valueLayout.C_SHORT.withName("top"),
            Interop.valueLayout.C_SHORT.withName("bottom")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Border}
     * @return A new, uninitialized @{link Border}
     */
    public static Border allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Border newInstance = new Border(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code left}
     * @return The value of the field {@code left}
     */
    public short getLeft() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("left"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code left}
     * @param left The new value of the field {@code left}
     */
    public void setLeft(short left) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("left"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), left);
        }
    }
    
    /**
     * Get the value of the field {@code right}
     * @return The value of the field {@code right}
     */
    public short getRight() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("right"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code right}
     * @param right The new value of the field {@code right}
     */
    public void setRight(short right) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("right"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), right);
        }
    }
    
    /**
     * Get the value of the field {@code top}
     * @return The value of the field {@code top}
     */
    public short getTop() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("top"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code top}
     * @param top The new value of the field {@code top}
     */
    public void setTop(short top) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("top"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), top);
        }
    }
    
    /**
     * Get the value of the field {@code bottom}
     * @return The value of the field {@code bottom}
     */
    public short getBottom() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bottom"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code bottom}
     * @param bottom The new value of the field {@code bottom}
     */
    public void setBottom(short bottom) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bottom"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), bottom);
        }
    }
    
    /**
     * Create a Border proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Border(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Border> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Border(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_border_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@code GtkBorder} struct and initializes its elements to zero.
     */
    public Border() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Copies a {@code GtkBorder}.
     * @return a copy of {@code border_}.
     */
    public org.gtk.gtk.Border copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_border_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gtk.Border.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Frees a {@code GtkBorder}.
     */
    public void free() {
        try {
            DowncallHandles.gtk_border_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_border_new = Interop.downcallHandle(
                "gtk_border_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_border_copy = Interop.downcallHandle(
                "gtk_border_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_border_free = Interop.downcallHandle(
                "gtk_border_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Border.Builder} object constructs a {@link Border} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Border.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Border struct;
        
        private Builder() {
            struct = Border.allocate();
        }
        
        /**
         * Finish building the {@link Border} struct.
         * @return A new instance of {@code Border} with the fields 
         *         that were set in the Builder object.
         */
        public Border build() {
            return struct;
        }
        
        /**
         * The width of the left border
         * @param left The value for the {@code left} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLeft(short left) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("left"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), left);
                return this;
            }
        }
        
        /**
         * The width of the right border
         * @param right The value for the {@code right} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRight(short right) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("right"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), right);
                return this;
            }
        }
        
        /**
         * The width of the top border
         * @param top The value for the {@code top} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTop(short top) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("top"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), top);
                return this;
            }
        }
        
        /**
         * The width of the bottom border
         * @param bottom The value for the {@code bottom} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBottom(short bottom) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bottom"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), bottom);
                return this;
            }
        }
    }
}
