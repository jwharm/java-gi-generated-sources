package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoFontset` represents a set of `PangoFont` to use when rendering text.
 * 
 * A `PangoFontset` is the result of resolving a `PangoFontDescription`
 * against a particular `PangoContext`. It has operations for finding the
 * component font for a particular Unicode character, and for finding a
 * composite set of metrics for the entire fontset.
 */
public class Fontset extends org.gtk.gobject.Object {

    public Fontset(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Fontset */
    public static Fontset castFrom(org.gtk.gobject.Object gobject) {
        return new Fontset(gobject.getReference());
    }
    
    /**
     * Iterates through all the fonts in a fontset, calling @func for
     * each one.
     * 
     * If @func returns %TRUE, that stops the iteration.
     */
    public void foreach(FontsetForeachFunc func) {
        try {
            int hash = func.hashCode();
            JVMCallbacks.signalRegistry.put(hash, func);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFontsetForeachFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.pango_fontset_foreach(handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns the font in the fontset that contains the best
     * glyph for a Unicode character.
     */
    public Font getFont(int wc) {
        var RESULT = gtk_h.pango_fontset_get_font(handle(), wc);
        return new Font(References.get(RESULT, true));
    }
    
    /**
     * Get overall metric information for the fonts in the fontset.
     */
    public FontMetrics getMetrics() {
        var RESULT = gtk_h.pango_fontset_get_metrics(handle());
        return new FontMetrics(References.get(RESULT, true));
    }
    
}
