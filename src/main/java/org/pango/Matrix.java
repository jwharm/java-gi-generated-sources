package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoMatrix} specifies a transformation between user-space
 * and device coordinates.
 * <p>
 * The transformation is given by
 * <pre>{@code 
 * x_device = x_user * matrix->xx + y_user * matrix->xy + matrix->x0;
 * y_device = x_user * matrix->yx + y_user * matrix->yy + matrix->y0;
 * }</pre>
 * @version 1.6
 */
public class Matrix extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoMatrix";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_DOUBLE.withName("xx"),
            Interop.valueLayout.C_DOUBLE.withName("xy"),
            Interop.valueLayout.C_DOUBLE.withName("yx"),
            Interop.valueLayout.C_DOUBLE.withName("yy"),
            Interop.valueLayout.C_DOUBLE.withName("x0"),
            Interop.valueLayout.C_DOUBLE.withName("y0")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Matrix}
     * @return A new, uninitialized @{link Matrix}
     */
    public static Matrix allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Matrix newInstance = new Matrix(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code xx}
     * @return The value of the field {@code xx}
     */
    public double getXx() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("xx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code xx}
     * @param xx The new value of the field {@code xx}
     */
    public void setXx(double xx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("xx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), xx);
    }
    
    /**
     * Get the value of the field {@code xy}
     * @return The value of the field {@code xy}
     */
    public double getXy() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("xy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code xy}
     * @param xy The new value of the field {@code xy}
     */
    public void setXy(double xy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("xy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), xy);
    }
    
    /**
     * Get the value of the field {@code yx}
     * @return The value of the field {@code yx}
     */
    public double getYx() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("yx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code yx}
     * @param yx The new value of the field {@code yx}
     */
    public void setYx(double yx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("yx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), yx);
    }
    
    /**
     * Get the value of the field {@code yy}
     * @return The value of the field {@code yy}
     */
    public double getYy() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("yy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code yy}
     * @param yy The new value of the field {@code yy}
     */
    public void setYy(double yy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("yy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), yy);
    }
    
    /**
     * Get the value of the field {@code x0}
     * @return The value of the field {@code x0}
     */
    public double getX0() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x0"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code x0}
     * @param x0 The new value of the field {@code x0}
     */
    public void setX0(double x0) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x0"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), x0);
    }
    
    /**
     * Get the value of the field {@code y0}
     * @return The value of the field {@code y0}
     */
    public double getY0() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y0"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code y0}
     * @param y0 The new value of the field {@code y0}
     */
    public void setY0(double y0) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y0"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), y0);
    }
    
    /**
     * Create a Matrix proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Matrix(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Matrix> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Matrix(input, ownership);
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first applying transformation
     * given by {@code new_matrix} then applying the original transformation.
     * @param newMatrix a {@code PangoMatrix}
     */
    public void concat(org.pango.Matrix newMatrix) {
        try {
            DowncallHandles.pango_matrix_concat.invokeExact(
                    handle(),
                    newMatrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Copies a {@code PangoMatrix}.
     * @return the newly allocated {@code PangoMatrix}
     */
    public @Nullable org.pango.Matrix copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_matrix_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Matrix.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Free a {@code PangoMatrix}.
     */
    public void free() {
        try {
            DowncallHandles.pango_matrix_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the scale factor of a matrix on the height of the font.
     * <p>
     * That is, the scale factor in the direction perpendicular to the
     * vector that the X coordinate is mapped to.  If the scale in the X
     * coordinate is needed as well, use {@link Matrix#getFontScaleFactors}.
     * @return the scale factor of {@code matrix} on the height of the font,
     *   or 1.0 if {@code matrix} is {@code null}.
     */
    public double getFontScaleFactor() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.pango_matrix_get_font_scale_factor.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Calculates the scale factor of a matrix on the width and height of the font.
     * <p>
     * That is, {@code xscale} is the scale factor in the direction of the X coordinate,
     * and {@code yscale} is the scale factor in the direction perpendicular to the
     * vector that the X coordinate is mapped to.
     * <p>
     * Note that output numbers will always be non-negative.
     * @param xscale output scale factor in the x direction
     * @param yscale output scale factor perpendicular to the x direction
     */
    public void getFontScaleFactors(Out<Double> xscale, Out<Double> yscale) {
        MemorySegment xscalePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment yscalePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        try {
            DowncallHandles.pango_matrix_get_font_scale_factors.invokeExact(
                    handle(),
                    (Addressable) (xscale == null ? MemoryAddress.NULL : (Addressable) xscalePOINTER.address()),
                    (Addressable) (yscale == null ? MemoryAddress.NULL : (Addressable) yscalePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (xscale != null) xscale.set(xscalePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        if (yscale != null) yscale.set(yscalePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
    }
    
    /**
     * Gets the slant ratio of a matrix.
     * <p>
     * For a simple shear matrix in the form:
     * <p>
     *     1 λ
     *     0 1
     * <p>
     * this is simply λ.
     * @return the slant ratio of {@code matrix}
     */
    public double getSlantRatio() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.pango_matrix_get_slant_ratio.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first rotating by {@code degrees} degrees
     * counter-clockwise then applying the original transformation.
     * @param degrees degrees to rotate counter-clockwise
     */
    public void rotate(double degrees) {
        try {
            DowncallHandles.pango_matrix_rotate.invokeExact(
                    handle(),
                    degrees);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first scaling by {@code sx} in the X direction
     * and {@code sy} in the Y direction then applying the original
     * transformation.
     * @param scaleX amount to scale by in X direction
     * @param scaleY amount to scale by in Y direction
     */
    public void scale(double scaleX, double scaleY) {
        try {
            DowncallHandles.pango_matrix_scale.invokeExact(
                    handle(),
                    scaleX,
                    scaleY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transforms the distance vector ({@code dx},{@code dy}) by {@code matrix}.
     * <p>
     * This is similar to {@link Matrix#transformPoint},
     * except that the translation components of the transformation
     * are ignored. The calculation of the returned vector is as follows:
     * <pre>{@code 
     * dx2 = dx1 * xx + dy1 * xy;
     * dy2 = dx1 * yx + dy1 * yy;
     * }</pre>
     * <p>
     * Affine transformations are position invariant, so the same vector
     * always transforms to the same vector. If ({@code x1},{@code y1}) transforms
     * to ({@code x2},{@code y2}) then ({@code x1}+{@code dx1},{@code y1}+{@code dy1}) will transform to
     * ({@code x1}+{@code dx2},{@code y1}+{@code dy2}) for all values of {@code x1} and {@code x2}.
     * @param dx in/out X component of a distance vector
     * @param dy in/out Y component of a distance vector
     */
    public void transformDistance(Out<Double> dx, Out<Double> dy) {
        MemorySegment dxPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment dyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        try {
            DowncallHandles.pango_matrix_transform_distance.invokeExact(
                    handle(),
                    (Addressable) dxPOINTER.address(),
                    (Addressable) dyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dx.set(dxPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        dy.set(dyPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
    }
    
    /**
     * First transforms the {@code rect} using {@code matrix}, then calculates the bounding box
     * of the transformed rectangle.
     * <p>
     * This function is useful for example when you want to draw a rotated
     * {@code PangoLayout} to an image buffer, and want to know how large the image
     * should be and how much you should shift the layout when rendering.
     * <p>
     * For better accuracy, you should use {@link Matrix#transformRectangle}
     * on original rectangle in Pango units and convert to pixels afterward
     * using {@link Pango#extentsToPixels}'s first argument.
     * @param rect in/out bounding box in device units
     */
    public void transformPixelRectangle(@Nullable org.pango.Rectangle rect) {
        try {
            DowncallHandles.pango_matrix_transform_pixel_rectangle.invokeExact(
                    handle(),
                    (Addressable) (rect == null ? MemoryAddress.NULL : rect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        rect.yieldOwnership();
    }
    
    /**
     * Transforms the point ({@code x}, {@code y}) by {@code matrix}.
     * @param x in/out X position
     * @param y in/out Y position
     */
    public void transformPoint(Out<Double> x, Out<Double> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        try {
            DowncallHandles.pango_matrix_transform_point.invokeExact(
                    handle(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
    }
    
    /**
     * First transforms {@code rect} using {@code matrix}, then calculates the bounding box
     * of the transformed rectangle.
     * <p>
     * This function is useful for example when you want to draw a rotated
     * {@code PangoLayout} to an image buffer, and want to know how large the image
     * should be and how much you should shift the layout when rendering.
     * <p>
     * If you have a rectangle in device units (pixels), use
     * {@link Matrix#transformPixelRectangle}.
     * <p>
     * If you have the rectangle in Pango units and want to convert to
     * transformed pixel bounding box, it is more accurate to transform it first
     * (using this function) and pass the result to pango_extents_to_pixels(),
     * first argument, for an inclusive rounded rectangle.
     * However, there are valid reasons that you may want to convert
     * to pixels first and then transform, for example when the transformed
     * coordinates may overflow in Pango units (large matrix translation for
     * example).
     * @param rect in/out bounding box in Pango units
     */
    public void transformRectangle(@Nullable org.pango.Rectangle rect) {
        try {
            DowncallHandles.pango_matrix_transform_rectangle.invokeExact(
                    handle(),
                    (Addressable) (rect == null ? MemoryAddress.NULL : rect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        rect.yieldOwnership();
    }
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first translating by ({@code tx}, {@code ty})
     * then applying the original transformation.
     * @param tx amount to translate in the X direction
     * @param ty amount to translate in the Y direction
     */
    public void translate(double tx, double ty) {
        try {
            DowncallHandles.pango_matrix_translate.invokeExact(
                    handle(),
                    tx,
                    ty);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_matrix_concat = Interop.downcallHandle(
            "pango_matrix_concat",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_copy = Interop.downcallHandle(
            "pango_matrix_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_free = Interop.downcallHandle(
            "pango_matrix_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_get_font_scale_factor = Interop.downcallHandle(
            "pango_matrix_get_font_scale_factor",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_get_font_scale_factors = Interop.downcallHandle(
            "pango_matrix_get_font_scale_factors",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_get_slant_ratio = Interop.downcallHandle(
            "pango_matrix_get_slant_ratio",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_rotate = Interop.downcallHandle(
            "pango_matrix_rotate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle pango_matrix_scale = Interop.downcallHandle(
            "pango_matrix_scale",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle pango_matrix_transform_distance = Interop.downcallHandle(
            "pango_matrix_transform_distance",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_transform_pixel_rectangle = Interop.downcallHandle(
            "pango_matrix_transform_pixel_rectangle",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_transform_point = Interop.downcallHandle(
            "pango_matrix_transform_point",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_transform_rectangle = Interop.downcallHandle(
            "pango_matrix_transform_rectangle",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_translate = Interop.downcallHandle(
            "pango_matrix_translate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
    }
    
    /**
     * A {@link Matrix.Builder} object constructs a {@link Matrix} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Matrix.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Matrix struct;
        
        private Builder() {
            struct = Matrix.allocate();
        }
        
         /**
         * Finish building the {@link Matrix} struct.
         * @return A new instance of {@code Matrix} with the fields 
         *         that were set in the Builder object.
         */
        public Matrix build() {
            return struct;
        }
        
        /**
         * 1st component of the transformation matrix
         * @param xx The value for the {@code xx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setXx(double xx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("xx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), xx);
            return this;
        }
        
        /**
         * 2nd component of the transformation matrix
         * @param xy The value for the {@code xy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setXy(double xy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("xy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), xy);
            return this;
        }
        
        /**
         * 3rd component of the transformation matrix
         * @param yx The value for the {@code yx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setYx(double yx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("yx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), yx);
            return this;
        }
        
        /**
         * 4th component of the transformation matrix
         * @param yy The value for the {@code yy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setYy(double yy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("yy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), yy);
            return this;
        }
        
        /**
         * x translation
         * @param x0 The value for the {@code x0} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setX0(double x0) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x0"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), x0);
            return this;
        }
        
        /**
         * y translation
         * @param y0 The value for the {@code y0} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setY0(double y0) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y0"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), y0);
            return this;
        }
    }
}
