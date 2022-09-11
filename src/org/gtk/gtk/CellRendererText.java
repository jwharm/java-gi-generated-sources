package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Renders text in a cell
 * 
 * A `GtkCellRendererText` renders a given text in its cell, using the font, color and
 * style information provided by its properties. The text will be ellipsized if it is
 * too long and the `GtkCellRendererText:ellipsize` property allows it.
 * 
 * If the `GtkCellRenderer:mode` is %GTK_CELL_RENDERER_MODE_EDITABLE,
 * the `GtkCellRendererText` allows to edit its text using an entry.
 */
public class CellRendererText extends CellRenderer {

    public CellRendererText(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellRendererText */
    public static CellRendererText castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererText(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkCellRendererText`. Adjust how text is drawn using
     * object properties. Object properties can be
     * set globally (with g_object_set()). Also, with `GtkTreeViewColumn`,
     * you can bind a property to a value in a `GtkTreeModel`. For example,
     * you can bind the “text” property on the cell renderer to a string
     * value in the model, thus rendering a different string in each row
     * of the `GtkTreeView`.
     */
    public CellRendererText() {
        super(References.get(gtk_h.gtk_cell_renderer_text_new(), false));
    }
    
    /**
     * Sets the height of a renderer to explicitly be determined by the “font” and
     * “y_pad” property set on it.  Further changes in these properties do not
     * affect the height, so they must be accompanied by a subsequent call to this
     * function.  Using this function is inflexible, and should really only be used
     * if calculating the size of a cell is too slow (ie, a massive number of cells
     * displayed).  If @number_of_rows is -1, then the fixed height is unset, and
     * the height is determined by the properties again.
     */
    public void setFixedHeightFromFont(int numberOfRows) {
        gtk_h.gtk_cell_renderer_text_set_fixed_height_from_font(handle(), numberOfRows);
    }
    
    @FunctionalInterface
    public interface EditedHandler {
        void signalReceived(CellRendererText source, java.lang.String path, java.lang.String newText);
    }
    
    /**
     * This signal is emitted after @renderer has been edited.
     * 
     * It is the responsibility of the application to update the model
     * and store @new_text at the position indicated by @path.
     */
    public void onEdited(EditedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellRendererTextEdited", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("edited").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
