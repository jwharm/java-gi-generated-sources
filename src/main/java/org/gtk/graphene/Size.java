package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A size.
 * @version 1.0
 */
public class Size extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_size_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_FLOAT.withName("width"),
            Interop.valueLayout.C_FLOAT.withName("height")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Size}
     * @return A new, uninitialized @{link Size}
     */
    public static Size allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Size newInstance = new Size(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code width}
     * @return The value of the field {@code width}
     */
    public float getWidth() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code width}
     * @param width The new value of the field {@code width}
     */
    public void setWidth(float width) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), width);
        }
    }
    
    /**
     * Get the value of the field {@code height}
     * @return The value of the field {@code height}
     */
    public float getHeight() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("height"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code height}
     * @param height The new value of the field {@code height}
     */
    public void setHeight(float height) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("height"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), height);
        }
    }
    
    /**
     * Create a Size proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Size(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Size> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Size(input);
    
    private static MemoryAddress constructAlloc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_size_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Allocates a new {@link Size}.
     * <p>
     * The contents of the returned value are undefined.
     * @return the newly allocated {@link Size}
     */
    public static Size alloc() {
        var RESULT = constructAlloc();
        var OBJECT = org.gtk.graphene.Size.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Checks whether the two give {@link Size} are equal.
     * @param b a {@link Size}
     * @return {@code true} if the sizes are equal
     */
    public boolean equal(org.gtk.graphene.Size b) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_size_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_size_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_size_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes a {@link Size} using the given {@code width} and {@code height}.
     * @param width the width
     * @param height the height
     * @return the initialized {@link Size}
     */
    public org.gtk.graphene.Size init(float width, float height) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_size_init.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Size.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link Size} using the width and height of
     * the given {@code src}.
     * @param src a {@link Size}
     * @return the initialized {@link Size}
     */
    public org.gtk.graphene.Size initFromSize(org.gtk.graphene.Size src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_size_init_from_size.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Size.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Linearly interpolates the two given {@link Size} using the given
     * interpolation {@code factor}.
     * @param b a {@link Size}
     * @param factor the linear interpolation factor
     * @param res return location for the interpolated size
     */
    public void interpolate(org.gtk.graphene.Size b, double factor, org.gtk.graphene.Size res) {
        try {
            DowncallHandles.graphene_size_interpolate.invokeExact(
                    handle(),
                    b.handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Scales the components of a {@link Size} using the given {@code factor}.
     * @param factor the scaling factor
     * @param res return location for the scaled size
     */
    public void scale(float factor, org.gtk.graphene.Size res) {
        try {
            DowncallHandles.graphene_size_scale.invokeExact(
                    handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A constant pointer to a zero {@link Size}, useful for
     * equality checks and interpolations.
     * @return a constant size
     */
    public static org.gtk.graphene.Size zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_size_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Size.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_size_alloc = Interop.downcallHandle(
                "graphene_size_alloc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_size_equal = Interop.downcallHandle(
                "graphene_size_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_size_free = Interop.downcallHandle(
                "graphene_size_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_size_init = Interop.downcallHandle(
                "graphene_size_init",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_size_init_from_size = Interop.downcallHandle(
                "graphene_size_init_from_size",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_size_interpolate = Interop.downcallHandle(
                "graphene_size_interpolate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_size_scale = Interop.downcallHandle(
                "graphene_size_scale",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_size_zero = Interop.downcallHandle(
                "graphene_size_zero",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Size.Builder} object constructs a {@link Size} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Size.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Size struct;
        
        private Builder() {
            struct = Size.allocate();
        }
        
        /**
         * Finish building the {@link Size} struct.
         * @return A new instance of {@code Size} with the fields 
         *         that were set in the Builder object.
         */
        public Size build() {
            return struct;
        }
        
        /**
         * the width
         * @param width The value for the {@code width} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidth(float width) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("width"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), width);
                return this;
            }
        }
        
        /**
         * the height
         * @param height The value for the {@code height} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeight(float height) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("height"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), height);
                return this;
            }
        }
    }
}
