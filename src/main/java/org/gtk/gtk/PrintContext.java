package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>Using GtkPrintContext in a ::draw-page callback</strong><br/>
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
public class PrintContext extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PrintContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PrintContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PrintContext> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PrintContext(input, ownership);
    
    /**
     * Creates a new {@code PangoContext} that can be used with the
     * {@code GtkPrintContext}.
     * @return a new Pango context for {@code context}
     */
    public org.pango.Context createPangoContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_context_create_pango_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Context) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.pango.Context.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@code PangoLayout} that is suitable for use
     * with the {@code GtkPrintContext}.
     * @return a new Pango layout for {@code context}
     */
    public org.pango.Layout createPangoLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_context_create_pango_layout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Layout) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.pango.Layout.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Obtains the cairo context that is associated with the
     * {@code GtkPrintContext}.
     * @return the cairo context of {@code context}
     */
    public org.cairographics.Context getCairoContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_context_get_cairo_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.cairographics.Context.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Obtains the horizontal resolution of the {@code GtkPrintContext},
     * in dots per inch.
     * @return the horizontal resolution of {@code context}
     */
    public double getDpiX() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_context_get_dpi_x.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Obtains the vertical resolution of the {@code GtkPrintContext},
     * in dots per inch.
     * @return the vertical resolution of {@code context}
     */
    public double getDpiY() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_context_get_dpi_y.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Obtains the hardware printer margins of the {@code GtkPrintContext},
     * in units.
     * @param top top hardware printer margin
     * @param bottom bottom hardware printer margin
     * @param left left hardware printer margin
     * @param right right hardware printer margin
     * @return {@code true} if the hard margins were retrieved
     */
    public boolean getHardMargins(Out<Double> top, Out<Double> bottom, Out<Double> left, Out<Double> right) {
        MemorySegment topPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment bottomPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment leftPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment rightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_context_get_hard_margins.invokeExact(
                    handle(),
                    (Addressable) topPOINTER.address(),
                    (Addressable) bottomPOINTER.address(),
                    (Addressable) leftPOINTER.address(),
                    (Addressable) rightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        top.set(topPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        bottom.set(bottomPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        left.set(leftPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        right.set(rightPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Obtains the height of the {@code GtkPrintContext}, in pixels.
     * @return the height of {@code context}
     */
    public double getHeight() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_context_get_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Obtains the {@code GtkPageSetup} that determines the page
     * dimensions of the {@code GtkPrintContext}.
     * @return the page setup of {@code context}
     */
    public org.gtk.gtk.PageSetup getPageSetup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_context_get_page_setup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.PageSetup) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.PageSetup.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a {@code PangoFontMap} that is suitable for use
     * with the {@code GtkPrintContext}.
     * @return the font map of {@code context}
     */
    public org.pango.FontMap getPangoFontmap() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_context_get_pango_fontmap.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.FontMap) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.pango.FontMap.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Obtains the width of the {@code GtkPrintContext}, in pixels.
     * @return the width of {@code context}
     */
    public double getWidth() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_context_get_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets a new cairo context on a print context.
     * <p>
     * This function is intended to be used when implementing
     * an internal print preview, it is not needed for printing,
     * since GTK itself creates a suitable cairo context in that
     * case.
     * @param cr the cairo context
     * @param dpiX the horizontal resolution to use with {@code cr}
     * @param dpiY the vertical resolution to use with {@code cr}
     */
    public void setCairoContext(org.cairographics.Context cr, double dpiX, double dpiY) {
        try {
            DowncallHandles.gtk_print_context_set_cairo_context.invokeExact(
                    handle(),
                    cr.handle(),
                    dpiX,
                    dpiY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_print_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PrintContext.Builder} object constructs a {@link PrintContext} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PrintContext.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PrintContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PrintContext}.
         * @return A new instance of {@code PrintContext} with the properties 
         *         that were set in the Builder object.
         */
        public PrintContext build() {
            return (PrintContext) org.gtk.gobject.GObject.newWithProperties(
                PrintContext.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_print_context_create_pango_context = Interop.downcallHandle(
            "gtk_print_context_create_pango_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_context_create_pango_layout = Interop.downcallHandle(
            "gtk_print_context_create_pango_layout",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_context_get_cairo_context = Interop.downcallHandle(
            "gtk_print_context_get_cairo_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_context_get_dpi_x = Interop.downcallHandle(
            "gtk_print_context_get_dpi_x",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_context_get_dpi_y = Interop.downcallHandle(
            "gtk_print_context_get_dpi_y",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_context_get_hard_margins = Interop.downcallHandle(
            "gtk_print_context_get_hard_margins",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_context_get_height = Interop.downcallHandle(
            "gtk_print_context_get_height",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_context_get_page_setup = Interop.downcallHandle(
            "gtk_print_context_get_page_setup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_context_get_pango_fontmap = Interop.downcallHandle(
            "gtk_print_context_get_pango_fontmap",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_context_get_width = Interop.downcallHandle(
            "gtk_print_context_get_width",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_context_set_cairo_context = Interop.downcallHandle(
            "gtk_print_context_set_cairo_context",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_print_context_get_type = Interop.downcallHandle(
            "gtk_print_context_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
