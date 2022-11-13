package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node drawing a set of glyphs.
 */
public class TextNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskTextNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TextNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TextNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TextNode if its GType is a (or inherits from) "GskTextNode".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TextNode} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskTextNode", a ClassCastException will be thrown.
     */
    public static TextNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskTextNode"))) {
            return new TextNode(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskTextNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.pango.Font font, @NotNull org.pango.GlyphString glyphs, @NotNull org.gtk.gdk.RGBA color, @NotNull org.gtk.graphene.Point offset) {
        java.util.Objects.requireNonNull(font, "Parameter 'font' must not be null");
        java.util.Objects.requireNonNull(glyphs, "Parameter 'glyphs' must not be null");
        java.util.Objects.requireNonNull(color, "Parameter 'color' must not be null");
        java.util.Objects.requireNonNull(offset, "Parameter 'offset' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_text_node_new.invokeExact(
                    font.handle(),
                    glyphs.handle(),
                    color.handle(),
                    offset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a render node that renders the given glyphs.
     * <p>
     * Note that {@code color} may not be used if the font contains
     * color glyphs.
     * @param font the {@code PangoFont} containing the glyphs
     * @param glyphs the {@code PangoGlyphString} to render
     * @param color the foreground color to render with
     * @param offset offset of the baseline
     */
    public TextNode(@NotNull org.pango.Font font, @NotNull org.pango.GlyphString glyphs, @NotNull org.gtk.gdk.RGBA color, @NotNull org.gtk.graphene.Point offset) {
        super(constructNew(font, glyphs, color, offset), Ownership.FULL);
    }
    
    /**
     * Retrieves the color used by the text {@code node}.
     * @return the text color
     */
    public @NotNull org.gtk.gdk.RGBA getColor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_text_node_get_color.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.RGBA(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the font used by the text {@code node}.
     * @return the font
     */
    public @NotNull org.pango.Font getFont() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_text_node_get_font.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Font(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the glyph information in the {@code node}.
     * @param nGlyphs the number of glyphs returned
     * @return the glyph information
     */
    public @NotNull org.pango.GlyphInfo[] getGlyphs(Out<Integer> nGlyphs) {
        java.util.Objects.requireNonNull(nGlyphs, "Parameter 'nGlyphs' must not be null");
        MemorySegment nGlyphsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_text_node_get_glyphs.invokeExact(
                    handle(),
                    (Addressable) nGlyphsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nGlyphs.set(nGlyphsPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.pango.GlyphInfo[] resultARRAY = new org.pango.GlyphInfo[nGlyphs.get().intValue()];
        for (int I = 0; I < nGlyphs.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new org.pango.GlyphInfo(OBJ, Ownership.NONE);
        }
        return resultARRAY;
    }
    
    /**
     * Retrieves the number of glyphs in the text node.
     * @return the number of glyphs
     */
    public int getNumGlyphs() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_text_node_get_num_glyphs.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the offset applied to the text.
     * @return a point with the horizontal and vertical offsets
     */
    public @NotNull org.gtk.graphene.Point getOffset() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_text_node_get_offset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks whether the text {@code node} has color glyphs.
     * @return {@code true} if the text node has color glyphs
     */
    public boolean hasColorGlyphs() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_text_node_has_color_glyphs.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_text_node_new = Interop.downcallHandle(
            "gsk_text_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_get_color = Interop.downcallHandle(
            "gsk_text_node_get_color",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_get_font = Interop.downcallHandle(
            "gsk_text_node_get_font",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_get_glyphs = Interop.downcallHandle(
            "gsk_text_node_get_glyphs",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_get_num_glyphs = Interop.downcallHandle(
            "gsk_text_node_get_num_glyphs",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_get_offset = Interop.downcallHandle(
            "gsk_text_node_get_offset",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_has_color_glyphs = Interop.downcallHandle(
            "gsk_text_node_has_color_glyphs",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
