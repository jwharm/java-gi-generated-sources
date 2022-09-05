package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoMatrix` specifies a transformation between user-space
 * and device coordinates.
 * 
 * The transformation is given by
 * 
 * ```
 * x_device = x_user * matrix->xx + y_user * matrix->xy + matrix->x0;
 * y_device = x_user * matrix->yx + y_user * matrix->yy + matrix->y0;
 * ```
 */
public class Matrix extends io.github.jwharm.javagi.interop.ResourceBase {

    public Matrix(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first applying transformation
     * given by @new_matrix then applying the original transformation.
     */
    public void concat(Matrix newMatrix) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_matrix_concat(HANDLE(), newMatrix.HANDLE());
    }
    
    /**
     * Copies a `PangoMatrix`.
     */
    public Matrix copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_matrix_copy(HANDLE());
        return new Matrix(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Free a `PangoMatrix`.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_matrix_free(HANDLE());
    }
    
    /**
     * Returns the scale factor of a matrix on the height of the font.
     * 
     * That is, the scale factor in the direction perpendicular to the
     * vector that the X coordinate is mapped to.  If the scale in the X
     * coordinate is needed as well, use [method@Pango.Matrix.get_font_scale_factors].
     */
    public double getFontScaleFactor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_matrix_get_font_scale_factor(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the slant ratio of a matrix.
     * 
     * For a simple shear matrix in the form:
     * 
     *     1 λ
     *     0 1
     * 
     * this is simply λ.
     */
    public double getSlantRatio() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_matrix_get_slant_ratio(HANDLE());
        return RESULT;
    }
    
    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first rotating by @degrees degrees
     * counter-clockwise then applying the original transformation.
     */
    public void rotate(double degrees) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_matrix_rotate(HANDLE(), degrees);
    }
    
    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first scaling by @sx in the X direction
     * and @sy in the Y direction then applying the original
     * transformation.
     */
    public void scale(double scaleX, double scaleY) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_matrix_scale(HANDLE(), scaleX, scaleY);
    }
    
    /**
     * First transforms the @rect using @matrix, then calculates the bounding box
     * of the transformed rectangle.
     * 
     * This function is useful for example when you want to draw a rotated
     * @PangoLayout to an image buffer, and want to know how large the image
     * should be and how much you should shift the layout when rendering.
     * 
     * For better accuracy, you should use [method@Pango.Matrix.transform_rectangle]
     * on original rectangle in Pango units and convert to pixels afterward
     * using [func@extents_to_pixels]'s first argument.
     */
    public void transformPixelRectangle(Rectangle rect) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_matrix_transform_pixel_rectangle(HANDLE(), rect.HANDLE());
    }
    
    /**
     * First transforms @rect using @matrix, then calculates the bounding box
     * of the transformed rectangle.
     * 
     * This function is useful for example when you want to draw a rotated
     * @PangoLayout to an image buffer, and want to know how large the image
     * should be and how much you should shift the layout when rendering.
     * 
     * If you have a rectangle in device units (pixels), use
     * [method@Pango.Matrix.transform_pixel_rectangle].
     * 
     * If you have the rectangle in Pango units and want to convert to
     * transformed pixel bounding box, it is more accurate to transform it first
     * (using this function) and pass the result to pango_extents_to_pixels(),
     * first argument, for an inclusive rounded rectangle.
     * However, there are valid reasons that you may want to convert
     * to pixels first and then transform, for example when the transformed
     * coordinates may overflow in Pango units (large matrix translation for
     * example).
     */
    public void transformRectangle(Rectangle rect) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_matrix_transform_rectangle(HANDLE(), rect.HANDLE());
    }
    
    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first translating by (@tx, @ty)
     * then applying the original transformation.
     */
    public void translate(double tx, double ty) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_matrix_translate(HANDLE(), tx, ty);
    }
    
}