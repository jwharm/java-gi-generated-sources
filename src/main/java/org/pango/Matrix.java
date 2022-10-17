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
 * 
 * <pre>{@code 
 * x_device = x_user * matrix->xx + y_user * matrix->xy + matrix->x0;
 * y_device = x_user * matrix->yx + y_user * matrix->yy + matrix->y0;
 * }</pre>
 */
public class Matrix extends io.github.jwharm.javagi.ResourceBase {

    public Matrix(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle pango_matrix_concat = Interop.downcallHandle(
        "pango_matrix_concat",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first applying transformation
     * given by {@code new_matrix} then applying the original transformation.
     */
    public @NotNull void concat(@NotNull Matrix newMatrix) {
        try {
            pango_matrix_concat.invokeExact(handle(), newMatrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_matrix_copy = Interop.downcallHandle(
        "pango_matrix_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@code PangoMatrix}.
     */
    public @Nullable Matrix copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_matrix_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_matrix_free = Interop.downcallHandle(
        "pango_matrix_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Free a {@code PangoMatrix}.
     */
    public @NotNull void free() {
        try {
            pango_matrix_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_matrix_get_font_scale_factor = Interop.downcallHandle(
        "pango_matrix_get_font_scale_factor",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the scale factor of a matrix on the height of the font.
     * <p>
     * That is, the scale factor in the direction perpendicular to the
     * vector that the X coordinate is mapped to.  If the scale in the X
     * coordinate is needed as well, use {@link Matrix#getFontScaleFactors}.
     */
    public double getFontScaleFactor() {
        double RESULT;
        try {
            RESULT = (double) pango_matrix_get_font_scale_factor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle pango_matrix_get_font_scale_factors = Interop.downcallHandle(
        "pango_matrix_get_font_scale_factors",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calculates the scale factor of a matrix on the width and height of the font.
     * <p>
     * That is, {@code xscale} is the scale factor in the direction of the X coordinate,
     * and {@code yscale} is the scale factor in the direction perpendicular to the
     * vector that the X coordinate is mapped to.
     * <p>
     * Note that output numbers will always be non-negative.
     */
    public @NotNull void getFontScaleFactors(@NotNull Out<Double> xscale, @NotNull Out<Double> yscale) {
        MemorySegment xscalePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment yscalePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            pango_matrix_get_font_scale_factors.invokeExact(handle(), (Addressable) xscalePOINTER.address(), (Addressable) yscalePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xscale.set(xscalePOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        yscale.set(yscalePOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
    }
    
    private static final MethodHandle pango_matrix_get_slant_ratio = Interop.downcallHandle(
        "pango_matrix_get_slant_ratio",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the slant ratio of a matrix.
     * <p>
     * For a simple shear matrix in the form:
     * <p>
     *     1 λ
     *     0 1
     * <p>
     * this is simply λ.
     */
    public double getSlantRatio() {
        double RESULT;
        try {
            RESULT = (double) pango_matrix_get_slant_ratio.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle pango_matrix_rotate = Interop.downcallHandle(
        "pango_matrix_rotate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first rotating by {@code degrees} degrees
     * counter-clockwise then applying the original transformation.
     */
    public @NotNull void rotate(@NotNull double degrees) {
        try {
            pango_matrix_rotate.invokeExact(handle(), degrees);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_matrix_scale = Interop.downcallHandle(
        "pango_matrix_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first scaling by {@code sx} in the X direction
     * and {@code sy} in the Y direction then applying the original
     * transformation.
     */
    public @NotNull void scale(@NotNull double scaleX, @NotNull double scaleY) {
        try {
            pango_matrix_scale.invokeExact(handle(), scaleX, scaleY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_matrix_transform_distance = Interop.downcallHandle(
        "pango_matrix_transform_distance",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms the distance vector ({@code dx},{@code dy}) by {@code matrix}.
     * <p>
     * This is similar to {@link Matrix#transformPoint},
     * except that the translation components of the transformation
     * are ignored. The calculation of the returned vector is as follows:
     * 
     * <pre>{@code 
     * dx2 = dx1 * xx + dy1 * xy;
     * dy2 = dx1 * yx + dy1 * yy;
     * }</pre>
     * <p>
     * Affine transformations are position invariant, so the same vector
     * always transforms to the same vector. If ({@code x1},{@code y1}) transforms
     * to ({@code x2},{@code y2}) then ({@code x1}+{@code dx1},{@code y1}+{@code dy1}) will transform to
     * ({@code x1}+{@code dx2},{@code y1}+{@code dy2}) for all values of {@code x1} and {@code x2}.
     */
    public @NotNull void transformDistance(@NotNull Out<Double> dx, @NotNull Out<Double> dy) {
        MemorySegment dxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment dyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            pango_matrix_transform_distance.invokeExact(handle(), (Addressable) dxPOINTER.address(), (Addressable) dyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dx.set(dxPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        dy.set(dyPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
    }
    
    private static final MethodHandle pango_matrix_transform_pixel_rectangle = Interop.downcallHandle(
        "pango_matrix_transform_pixel_rectangle",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * using {@link extents_to_pixels#null}'s first argument.
     */
    public @NotNull void transformPixelRectangle(@NotNull Out<Rectangle> rect) {
        MemorySegment rectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            pango_matrix_transform_pixel_rectangle.invokeExact(handle(), (Addressable) rectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        rect.set(new Rectangle(Refcounted.get(rectPOINTER.get(ValueLayout.ADDRESS, 0), true)));
    }
    
    private static final MethodHandle pango_matrix_transform_point = Interop.downcallHandle(
        "pango_matrix_transform_point",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms the point (@x, @y) by {@code matrix}.
     */
    public @NotNull void transformPoint(@NotNull Out<Double> x, @NotNull Out<Double> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            pango_matrix_transform_point.invokeExact(handle(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        y.set(yPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
    }
    
    private static final MethodHandle pango_matrix_transform_rectangle = Interop.downcallHandle(
        "pango_matrix_transform_rectangle",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void transformRectangle(@NotNull Out<Rectangle> rect) {
        MemorySegment rectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            pango_matrix_transform_rectangle.invokeExact(handle(), (Addressable) rectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        rect.set(new Rectangle(Refcounted.get(rectPOINTER.get(ValueLayout.ADDRESS, 0), true)));
    }
    
    private static final MethodHandle pango_matrix_translate = Interop.downcallHandle(
        "pango_matrix_translate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first translating by ({@code tx}, {@code ty})
     * then applying the original transformation.
     */
    public @NotNull void translate(@NotNull double tx, @NotNull double ty) {
        try {
            pango_matrix_translate.invokeExact(handle(), tx, ty);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
