package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkRectangle} data type for representing rectangles.
 * <p>
 * {@code GdkRectangle} is identical to {@code cairo_rectangle_t}. Together with Cairo’s
 * {@code cairo_region_t} data type, these are the central types for representing
 * sets of pixels.
 * <p>
 * The intersection of two rectangles can be computed with
 * {@link Rectangle#intersect}; to find the union of two rectangles use
 * {@link Rectangle#union}.
 * <p>
 * The {@code cairo_region_t} type provided by Cairo is usually used for managing
 * non-rectangular clipping of graphical operations.
 * <p>
 * The Graphene library has a number of other data types for regions and
 * volumes in 2D and 3D.
 */
public class Rectangle extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkRectangle";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("x"),
            Interop.valueLayout.C_INT.withName("y"),
            Interop.valueLayout.C_INT.withName("width"),
            Interop.valueLayout.C_INT.withName("height")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Rectangle}
     * @return A new, uninitialized @{link Rectangle}
     */
    public static Rectangle allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Rectangle newInstance = new Rectangle(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code x}
     * @return The value of the field {@code x}
     */
    public int getX() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code x}
     * @param x The new value of the field {@code x}
     */
    public void setX(int x) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), x);
    }
    
    /**
     * Get the value of the field {@code y}
     * @return The value of the field {@code y}
     */
    public int getY() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code y}
     * @param y The new value of the field {@code y}
     */
    public void setY(int y) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
    }
    
    /**
     * Get the value of the field {@code width}
     * @return The value of the field {@code width}
     */
    public int getWidth() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code width}
     * @param width The new value of the field {@code width}
     */
    public void setWidth(int width) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), width);
    }
    
    /**
     * Get the value of the field {@code height}
     * @return The value of the field {@code height}
     */
    public int getHeight() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("height"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code height}
     * @param height The new value of the field {@code height}
     */
    public void setHeight(int height) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), height);
    }
    
    /**
     * Create a Rectangle proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Rectangle(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Rectangle> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Rectangle(input, ownership);
    
    /**
     * Returns {@code true} if {@code rect} contains the point described by {@code x} and {@code y}.
     * @param x X coordinate
     * @param y Y coordinate
     * @return {@code true} if {@code rect} contains the point
     */
    public boolean containsPoint(int x, int y) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_rectangle_contains_point.invokeExact(
                    handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the two given rectangles are equal.
     * @param rect2 a {@code GdkRectangle}
     * @return {@code true} if the rectangles are equal.
     */
    public boolean equal(org.gtk.gdk.Rectangle rect2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_rectangle_equal.invokeExact(
                    handle(),
                    rect2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Calculates the intersection of two rectangles.
     * <p>
     * It is allowed for {@code dest} to be the same as either {@code src1} or {@code src2}.
     * If the rectangles do not intersect, {@code dest}’s width and height is set
     * to 0 and its x and y values are undefined. If you are only interested
     * in whether the rectangles intersect, but not in the intersecting area
     * itself, pass {@code null} for {@code dest}.
     * @param src2 a {@code GdkRectangle}
     * @param dest return location for the
     *   intersection of {@code src1} and {@code src2}
     * @return {@code true} if the rectangles intersect.
     */
    public boolean intersect(org.gtk.gdk.Rectangle src2, @Nullable org.gtk.gdk.Rectangle dest) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_rectangle_intersect.invokeExact(
                    handle(),
                    src2.handle(),
                    (Addressable) (dest == null ? MemoryAddress.NULL : dest.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Calculates the union of two rectangles.
     * <p>
     * The union of rectangles {@code src1} and {@code src2} is the smallest rectangle which
     * includes both {@code src1} and {@code src2} within it. It is allowed for {@code dest} to be
     * the same as either {@code src1} or {@code src2}.
     * <p>
     * Note that this function does not ignore 'empty' rectangles (ie. with
     * zero width or height).
     * @param src2 a {@code GdkRectangle}
     * @param dest return location for the union of {@code src1} and {@code src2}
     */
    public void union(org.gtk.gdk.Rectangle src2, org.gtk.gdk.Rectangle dest) {
        try {
            DowncallHandles.gdk_rectangle_union.invokeExact(
                    handle(),
                    src2.handle(),
                    dest.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_rectangle_contains_point = Interop.downcallHandle(
            "gdk_rectangle_contains_point",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_rectangle_equal = Interop.downcallHandle(
            "gdk_rectangle_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_rectangle_intersect = Interop.downcallHandle(
            "gdk_rectangle_intersect",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_rectangle_union = Interop.downcallHandle(
            "gdk_rectangle_union",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Rectangle.Builder} object constructs a {@link Rectangle} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Rectangle.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Rectangle struct;
        
        private Builder() {
            struct = Rectangle.allocate();
        }
        
         /**
         * Finish building the {@link Rectangle} struct.
         * @return A new instance of {@code Rectangle} with the fields 
         *         that were set in the Builder object.
         */
        public Rectangle build() {
            return struct;
        }
        
        /**
         * the x coordinate of the top left corner
         * @param x The value for the {@code x} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setX(int x) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), x);
            return this;
        }
        
        /**
         * the y coordinate of the top left corner
         * @param y The value for the {@code y} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setY(int y) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
            return this;
        }
        
        /**
         * the width of the rectangle
         * @param width The value for the {@code width} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidth(int width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), width);
            return this;
        }
        
        /**
         * the height of the rectangle
         * @param height The value for the {@code height} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeight(int height) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), height);
            return this;
        }
    }
}
