package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkPrintContext` encapsulates context information that is required when
 * drawing pages for printing.
 * 
 * This includes the cairo context and important parameters like page size
 * and resolution. It also lets you easily create [class@Pango.Layout] and
 * [class@Pango.Context] objects that match the font metrics of the cairo surface.
 * 
 * `GtkPrintContext` objects get passed to the
 * [signal@Gtk.PrintOperation::begin-print],
 * [signal@Gtk.PrintOperation::end-print],
 * [signal@Gtk.PrintOperation::request-page-setup] and
 * [signal@Gtk.PrintOperation::draw-page] signals on the
 * [class@Gtk.PrintOperation] object.
 * 
 * ## Using GtkPrintContext in a ::draw-page callback
 * 
 * ```c
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
 * ```
 */
public class PrintContext extends org.gtk.gobject.Object {

    public PrintContext(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to PrintContext */
    public static PrintContext castFrom(org.gtk.gobject.Object gobject) {
        return new PrintContext(gobject.getProxy());
    }
    
    /**
     * Creates a new `PangoContext` that can be used with the
     * `GtkPrintContext`.
     */
    public org.pango.Context createPangoContext() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_context_create_pango_context(HANDLE());
        return new org.pango.Context(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Creates a new `PangoLayout` that is suitable for use
     * with the `GtkPrintContext`.
     */
    public org.pango.Layout createPangoLayout() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_context_create_pango_layout(HANDLE());
        return new org.pango.Layout(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Obtains the cairo context that is associated with the
     * `GtkPrintContext`.
     */
    public org.cairographics.Context getCairoContext() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_context_get_cairo_context(HANDLE());
        return new org.cairographics.Context(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Obtains the horizontal resolution of the `GtkPrintContext`,
     * in dots per inch.
     */
    public double getDpiX() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_context_get_dpi_x(HANDLE());
        return RESULT;
    }
    
    /**
     * Obtains the vertical resolution of the `GtkPrintContext`,
     * in dots per inch.
     */
    public double getDpiY() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_context_get_dpi_y(HANDLE());
        return RESULT;
    }
    
    /**
     * Obtains the height of the `GtkPrintContext`, in pixels.
     */
    public double getHeight() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_context_get_height(HANDLE());
        return RESULT;
    }
    
    /**
     * Obtains the `GtkPageSetup` that determines the page
     * dimensions of the `GtkPrintContext`.
     */
    public PageSetup getPageSetup() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_context_get_page_setup(HANDLE());
        return new PageSetup(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns a `PangoFontMap` that is suitable for use
     * with the `GtkPrintContext`.
     */
    public org.pango.FontMap getPangoFontmap() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_context_get_pango_fontmap(HANDLE());
        return new org.pango.FontMap(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Obtains the width of the `GtkPrintContext`, in pixels.
     */
    public double getWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_context_get_width(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets a new cairo context on a print context.
     * 
     * This function is intended to be used when implementing
     * an internal print preview, it is not needed for printing,
     * since GTK itself creates a suitable cairo context in that
     * case.
     */
    public void setCairoContext(org.cairographics.Context cr, double dpiX, double dpiY) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_context_set_cairo_context(HANDLE(), cr.HANDLE(), dpiX, dpiY);
    }
    
}
