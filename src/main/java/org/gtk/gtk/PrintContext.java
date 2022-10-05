package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkPrintContext} encapsulates context information that is required when
 * drawing pages for printing.
 * <p>
 * This includes the cairo context and important parameters like page size
 * and resolution. It also lets you easily create {@link org.pango.Layout} and
 * {@link org.pango.Context} objects that match the font metrics of the cairo surface.
 * <p>
 * {@code GtkPrintContext} objects get passed to the
 * {@code Gtk.PrintOperation::begin-print},
 * {@code Gtk.PrintOperation::end-print},
 * {@code Gtk.PrintOperation::request-page-setup} and
 * {@code Gtk.PrintOperation::draw-page} signals on the
 * {@link PrintOperation} object.
 * <p>
 * <h2>Using GtkPrintContext in a ::draw-page callback</h2>
 * <p>
 * <pre>{@code c
 * static void
 * draw_page (GtkPrintOperation *operation,
 *            GtkPrintContext   *context,
 *            int                page_nr)
 * {
 *   cairo_t *cr;
 *   PangoLayout *layout;
 *   PangoFontDescription *desc;
 * 
 *   cr = gtk_print_context_get_cairo_context (context);
 * 
 *   // Draw a red rectangle, as wide as the paper (inside the margins)
 *   cairo_set_source_rgb (cr, 1.0, 0, 0);
 *   cairo_rectangle (cr, 0, 0, gtk_print_context_get_width (context), 50);
 * 
 *   cairo_fill (cr);
 * 
 *   // Draw some lines
 *   cairo_move_to (cr, 20, 10);
 *   cairo_line_to (cr, 40, 20);
 *   cairo_arc (cr, 60, 60, 20, 0, M_PI);
 *   cairo_line_to (cr, 80, 20);
 * 
 *   cairo_set_source_rgb (cr, 0, 0, 0);
 *   cairo_set_line_width (cr, 5);
 *   cairo_set_line_cap (cr, CAIRO_LINE_CAP_ROUND);
 *   cairo_set_line_join (cr, CAIRO_LINE_JOIN_ROUND);
 * 
 *   cairo_stroke (cr);
 * 
 *   // Draw some text
 *   layout = gtk_print_context_create_pango_layout (context);
 *   pango_layout_set_text (layout, "Hello World! Printing is easy", -1);
 *   desc = pango_font_description_from_string ("sans 28");
 *   pango_layout_set_font_description (layout, desc);
 *   pango_font_description_free (desc);
 * 
 *   cairo_move_to (cr, 30, 20);
 *   pango_cairo_layout_path (cr, layout);
 * 
 *   // Font Outline
 *   cairo_set_source_rgb (cr, 0.93, 1.0, 0.47);
 *   cairo_set_line_width (cr, 0.5);
 *   cairo_stroke_preserve (cr);
 * 
 *   // Font Fill
 *   cairo_set_source_rgb (cr, 0, 0.0, 1.0);
 *   cairo_fill (cr);
 * 
 *   g_object_unref (layout);
 * }
 * }</pre>
 */
public class PrintContext extends org.gtk.gobject.Object {

    public PrintContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PrintContext */
    public static PrintContext castFrom(org.gtk.gobject.Object gobject) {
        return new PrintContext(gobject.refcounted());
    }
    
    static final MethodHandle gtk_print_context_create_pango_context = Interop.downcallHandle(
        "gtk_print_context_create_pango_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@code PangoContext} that can be used with the
     * {@code GtkPrintContext}.
     */
    public org.pango.Context createPangoContext() {
        try {
            var RESULT = (MemoryAddress) gtk_print_context_create_pango_context.invokeExact(handle());
            return new org.pango.Context(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_context_create_pango_layout = Interop.downcallHandle(
        "gtk_print_context_create_pango_layout",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@code PangoLayout} that is suitable for use
     * with the {@code GtkPrintContext}.
     */
    public org.pango.Layout createPangoLayout() {
        try {
            var RESULT = (MemoryAddress) gtk_print_context_create_pango_layout.invokeExact(handle());
            return new org.pango.Layout(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_context_get_cairo_context = Interop.downcallHandle(
        "gtk_print_context_get_cairo_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the cairo context that is associated with the
     * {@code GtkPrintContext}.
     */
    public org.cairographics.Context getCairoContext() {
        try {
            var RESULT = (MemoryAddress) gtk_print_context_get_cairo_context.invokeExact(handle());
            return new org.cairographics.Context(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_context_get_dpi_x = Interop.downcallHandle(
        "gtk_print_context_get_dpi_x",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the horizontal resolution of the {@code GtkPrintContext},
     * in dots per inch.
     */
    public double getDpiX() {
        try {
            var RESULT = (double) gtk_print_context_get_dpi_x.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_context_get_dpi_y = Interop.downcallHandle(
        "gtk_print_context_get_dpi_y",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the vertical resolution of the {@code GtkPrintContext},
     * in dots per inch.
     */
    public double getDpiY() {
        try {
            var RESULT = (double) gtk_print_context_get_dpi_y.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_context_get_hard_margins = Interop.downcallHandle(
        "gtk_print_context_get_hard_margins",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the hardware printer margins of the {@code GtkPrintContext},
     * in units.
     */
    public boolean getHardMargins(PointerDouble top, PointerDouble bottom, PointerDouble left, PointerDouble right) {
        try {
            var RESULT = (int) gtk_print_context_get_hard_margins.invokeExact(handle(), top.handle(), bottom.handle(), left.handle(), right.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_context_get_height = Interop.downcallHandle(
        "gtk_print_context_get_height",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the height of the {@code GtkPrintContext}, in pixels.
     */
    public double getHeight() {
        try {
            var RESULT = (double) gtk_print_context_get_height.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_context_get_page_setup = Interop.downcallHandle(
        "gtk_print_context_get_page_setup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the {@code GtkPageSetup} that determines the page
     * dimensions of the {@code GtkPrintContext}.
     */
    public PageSetup getPageSetup() {
        try {
            var RESULT = (MemoryAddress) gtk_print_context_get_page_setup.invokeExact(handle());
            return new PageSetup(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_context_get_pango_fontmap = Interop.downcallHandle(
        "gtk_print_context_get_pango_fontmap",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a {@code PangoFontMap} that is suitable for use
     * with the {@code GtkPrintContext}.
     */
    public org.pango.FontMap getPangoFontmap() {
        try {
            var RESULT = (MemoryAddress) gtk_print_context_get_pango_fontmap.invokeExact(handle());
            return new org.pango.FontMap(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_context_get_width = Interop.downcallHandle(
        "gtk_print_context_get_width",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the width of the {@code GtkPrintContext}, in pixels.
     */
    public double getWidth() {
        try {
            var RESULT = (double) gtk_print_context_get_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_context_set_cairo_context = Interop.downcallHandle(
        "gtk_print_context_set_cairo_context",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets a new cairo context on a print context.
     * <p>
     * This function is intended to be used when implementing
     * an internal print preview, it is not needed for printing,
     * since GTK itself creates a suitable cairo context in that
     * case.
     */
    public void setCairoContext(org.cairographics.Context cr, double dpiX, double dpiY) {
        try {
            gtk_print_context_set_cairo_context.invokeExact(handle(), cr.handle(), dpiX, dpiY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
