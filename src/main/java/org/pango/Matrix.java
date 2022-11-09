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
public class Matrix extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoMatrix";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_DOUBLE.withName("xx"),
        ValueLayout.JAVA_DOUBLE.withName("xy"),
        ValueLayout.JAVA_DOUBLE.withName("yx"),
        ValueLayout.JAVA_DOUBLE.withName("yy"),
        ValueLayout.JAVA_DOUBLE.withName("x0"),
        ValueLayout.JAVA_DOUBLE.withName("y0")
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
    public double xx$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("xx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code xx}
     * @param xx The new value of the field {@code xx}
     */
    public void xx$set(double xx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("xx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), xx);
    }
    
    /**
     * Get the value of the field {@code xy}
     * @return The value of the field {@code xy}
     */
    public double xy$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("xy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code xy}
     * @param xy The new value of the field {@code xy}
     */
    public void xy$set(double xy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("xy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), xy);
    }
    
    /**
     * Get the value of the field {@code yx}
     * @return The value of the field {@code yx}
     */
    public double yx$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("yx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code yx}
     * @param yx The new value of the field {@code yx}
     */
    public void yx$set(double yx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("yx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), yx);
    }
    
    /**
     * Get the value of the field {@code yy}
     * @return The value of the field {@code yy}
     */
    public double yy$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("yy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code yy}
     * @param yy The new value of the field {@code yy}
     */
    public void yy$set(double yy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("yy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), yy);
    }
    
    /**
     * Get the value of the field {@code x0}
     * @return The value of the field {@code x0}
     */
    public double x0$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x0"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code x0}
     * @param x0 The new value of the field {@code x0}
     */
    public void x0$set(double x0) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x0"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), x0);
    }
    
    /**
     * Get the value of the field {@code y0}
     * @return The value of the field {@code y0}
     */
    public double y0$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y0"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code y0}
     * @param y0 The new value of the field {@code y0}
     */
    public void y0$set(double y0) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y0"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), y0);
    }
    
    /**
     * Create a Matrix proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Matrix(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first applying transformation
     * given by {@code new_matrix} then applying the original transformation.
     * @param newMatrix a {@code PangoMatrix}
     */
    public void concat(@NotNull org.pango.Matrix newMatrix) {
        java.util.Objects.requireNonNull(newMatrix, "Parameter 'newMatrix' must not be null");
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
        return new org.pango.Matrix(RESULT, Ownership.FULL);
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
        java.util.Objects.requireNonNull(xscale, "Parameter 'xscale' must not be null");
        java.util.Objects.requireNonNull(yscale, "Parameter 'yscale' must not be null");
        MemorySegment xscalePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment yscalePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            DowncallHandles.pango_matrix_get_font_scale_factors.invokeExact(
                    handle(),
                    (Addressable) xscalePOINTER.address(),
                    (Addressable) yscalePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xscale.set(xscalePOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        yscale.set(yscalePOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
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
        java.util.Objects.requireNonNull(dx, "Parameter 'dx' must not be null");
        java.util.Objects.requireNonNull(dy, "Parameter 'dy' must not be null");
        MemorySegment dxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment dyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            DowncallHandles.pango_matrix_transform_distance.invokeExact(
                    handle(),
                    (Addressable) dxPOINTER.address(),
                    (Addressable) dyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dx.set(dxPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        dy.set(dyPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
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
    public void transformPixelRectangle(@NotNull org.pango.Rectangle rect) {
        java.util.Objects.requireNonNull(rect, "Parameter 'rect' must not be null");
        try {
            DowncallHandles.pango_matrix_transform_pixel_rectangle.invokeExact(
                    handle(),
                    rect.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transforms the point ({@code x}, {@code y}) by {@code matrix}.
     * @param x in/out X position
     * @param y in/out Y position
     */
    public void transformPoint(Out<Double> x, Out<Double> y) {
        java.util.Objects.requireNonNull(x, "Parameter 'x' must not be null");
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            DowncallHandles.pango_matrix_transform_point.invokeExact(
                    handle(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        y.set(yPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
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
    public void transformRectangle(@NotNull org.pango.Rectangle rect) {
        java.util.Objects.requireNonNull(rect, "Parameter 'rect' must not be null");
        try {
            DowncallHandles.pango_matrix_transform_rectangle.invokeExact(
                    handle(),
                    rect.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_copy = Interop.downcallHandle(
            "pango_matrix_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_free = Interop.downcallHandle(
            "pango_matrix_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_get_font_scale_factor = Interop.downcallHandle(
            "pango_matrix_get_font_scale_factor",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_get_font_scale_factors = Interop.downcallHandle(
            "pango_matrix_get_font_scale_factors",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_get_slant_ratio = Interop.downcallHandle(
            "pango_matrix_get_slant_ratio",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_rotate = Interop.downcallHandle(
            "pango_matrix_rotate",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle pango_matrix_scale = Interop.downcallHandle(
            "pango_matrix_scale",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle pango_matrix_transform_distance = Interop.downcallHandle(
            "pango_matrix_transform_distance",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_transform_pixel_rectangle = Interop.downcallHandle(
            "pango_matrix_transform_pixel_rectangle",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_transform_point = Interop.downcallHandle(
            "pango_matrix_transform_point",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_transform_rectangle = Interop.downcallHandle(
            "pango_matrix_transform_rectangle",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_matrix_translate = Interop.downcallHandle(
            "pango_matrix_translate",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
    }
}
