package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoMatrix} specifies a transformation between user-space
 * and device coordinates.
 * <p>
 * The transformation is given by
 * <p>
 * <pre>{@code 
 * x_device = x_user * matrix->xx + y_user * matrix->xy + matrix->x0;
 * y_device = x_user * matrix->yx + y_user * matrix->yy + matrix->y0;
 * }</pre>
 */
public class Matrix extends io.github.jwharm.javagi.ResourceBase {

    public Matrix(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public Matrix() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoMatrix.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first applying transformation
     * given by {@code new_matrix} then applying the original transformation.
     */
    public void concat(Matrix newMatrix) {
        gtk_h.pango_matrix_concat(handle(), newMatrix.handle());
    }
    
    /**
     * Copies a {@code PangoMatrix}.
     */
    public Matrix copy() {
        var RESULT = gtk_h.pango_matrix_copy(handle());
        return new Matrix(References.get(RESULT, true));
    }
    
    /**
     * Free a {@code PangoMatrix}.
     */
    public void free() {
        gtk_h.pango_matrix_free(handle());
    }
    
    /**
     * Returns the scale factor of a matrix on the height of the font.
     * <p>
     * That is, the scale factor in the direction perpendicular to the
     * vector that the X coordinate is mapped to.  If the scale in the X
     * coordinate is needed as well, use {@link Matrix#getFontScaleFactors}.
     */
    public double getFontScaleFactor() {
        var RESULT = gtk_h.pango_matrix_get_font_scale_factor(handle());
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
     */
    public void getFontScaleFactors(PointerDouble xscale, PointerDouble yscale) {
        gtk_h.pango_matrix_get_font_scale_factors(handle(), xscale.handle(), yscale.handle());
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
     */
    public double getSlantRatio() {
        var RESULT = gtk_h.pango_matrix_get_slant_ratio(handle());
        return RESULT;
    }
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first rotating by {@code degrees} degrees
     * counter-clockwise then applying the original transformation.
     */
    public void rotate(double degrees) {
        gtk_h.pango_matrix_rotate(handle(), degrees);
    }
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first scaling by {@code sx} in the X direction
     * and {@code sy} in the Y direction then applying the original
     * transformation.
     */
    public void scale(double scaleX, double scaleY) {
        gtk_h.pango_matrix_scale(handle(), scaleX, scaleY);
    }
    
    /**
     * Transforms the distance vector ({@code dx},{@code dy}) by {@code matrix}.
     * <p>
     * This is similar to {@link Matrix#transformPoint},
     * except that the translation components of the transformation
     * are ignored. The calculation of the returned vector is as follows:
     * <p>
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
    public void transformDistance(PointerDouble dx, PointerDouble dy) {
        gtk_h.pango_matrix_transform_distance(handle(), dx.handle(), dy.handle());
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
     * using {@link extents_to_pixels#null}'s first argument.
     */
    public void transformPixelRectangle(Rectangle rect) {
        gtk_h.pango_matrix_transform_pixel_rectangle(handle(), rect.handle());
    }
    
    /**
     * Transforms the point (@x, @y) by {@code matrix}.
     */
    public void transformPoint(PointerDouble x, PointerDouble y) {
        gtk_h.pango_matrix_transform_point(handle(), x.handle(), y.handle());
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
     */
    public void transformRectangle(Rectangle rect) {
        gtk_h.pango_matrix_transform_rectangle(handle(), rect.handle());
    }
    
    /**
     * Changes the transformation represented by {@code matrix} to be the
     * transformation given by first translating by ({@code tx}, {@code ty})
     * then applying the original transformation.
     */
    public void translate(double tx, double ty) {
        gtk_h.pango_matrix_translate(handle(), tx, ty);
    }
    
}
