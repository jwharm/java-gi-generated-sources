package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>PangoMatrix</code> specifies a transformation between user-space
 * and device coordinates.
 * <p>
 * The transformation is given by
 * <p><pre>
 * x_device = x_user * matrix-&<code>#62</code> xx + y_user * matrix-&<code>#62</code> xy + matrix-&<code>#62</code> x0;
 * y_device = x_user * matrix-&<code>#62</code> yx + y_user * matrix-&<code>#62</code> yy + matrix-&<code>#62</code> y0;
 * </pre>
 */
public class Matrix extends io.github.jwharm.javagi.ResourceBase {

    public Matrix(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first applying transformation
     * given by @new_matrix then applying the original transformation.
     */
    public void concat(Matrix newMatrix) {
        gtk_h.pango_matrix_concat(handle(), newMatrix.handle());
    }
    
    /**
     * Copies a <code>PangoMatrix</code>.
     */
    public Matrix copy() {
        var RESULT = gtk_h.pango_matrix_copy(handle());
        return new Matrix(References.get(RESULT, true));
    }
    
    /**
     * Free a <code>PangoMatrix</code>.
     */
    public void free() {
        gtk_h.pango_matrix_free(handle());
    }
    
    /**
     * Returns the scale factor of a matrix on the height of the font.
     * 
     * That is, the scale factor in the direction perpendicular to the
     * vector that the X coordinate is mapped to.  If the scale in the X
     * coordinate is needed as well, use {@link org.pango.Matrix<code>#getFontScaleFactors</code> .
     */
    public double getFontScaleFactor() {
        var RESULT = gtk_h.pango_matrix_get_font_scale_factor(handle());
        return RESULT;
    }
    
    /**
     * Gets the slant ratio of a matrix.
     * 
     * For a simple shear matrix in the form:
     * 
     *     1 &<code>#955</code> 
     *     0 1
     * 
     * this is simply &<code>#955</code> .
     */
    public double getSlantRatio() {
        var RESULT = gtk_h.pango_matrix_get_slant_ratio(handle());
        return RESULT;
    }
    
    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first rotating by @degrees degrees
     * counter-clockwise then applying the original transformation.
     */
    public void rotate(double degrees) {
        gtk_h.pango_matrix_rotate(handle(), degrees);
    }
    
    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first scaling by @sx in the X direction
     * and @sy in the Y direction then applying the original
     * transformation.
     */
    public void scale(double scaleX, double scaleY) {
        gtk_h.pango_matrix_scale(handle(), scaleX, scaleY);
    }
    
    /**
     * First transforms the @rect using @matrix, then calculates the bounding box
     * of the transformed rectangle.
     * 
     * This function is useful for example when you want to draw a rotated
     * @PangoLayout to an image buffer, and want to know how large the image
     * should be and how much you should shift the layout when rendering.
     * 
     * For better accuracy, you should use {@link org.pango.Matrix<code>#transformRectangle</code> 
     * on original rectangle in Pango units and convert to pixels afterward
     * using {@link [func@extents_to_pixels]}&<code>#39</code> s first argument.
     */
    public void transformPixelRectangle(Rectangle rect) {
        gtk_h.pango_matrix_transform_pixel_rectangle(handle(), rect.handle());
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
     * {@link org.pango.Matrix<code>#transformPixelRectangle</code> .
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
        gtk_h.pango_matrix_transform_rectangle(handle(), rect.handle());
    }
    
    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first translating by (@tx, @ty)
     * then applying the original transformation.
     */
    public void translate(double tx, double ty) {
        gtk_h.pango_matrix_translate(handle(), tx, ty);
    }
    
}
