package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Renders text in a cell
 * <p>
 * A <code>GtkCellRendererText</code> renders a given text in its cell, using the font, color and
 * style information provided by its properties. The text will be ellipsized if it is
 * too long and the <code>GtkCellRendererText:ellipsize</code> property allows it.
 * <p>
 * If the <code>GtkCellRenderer:mode</code> is {@link org.gtk.gtk.CellRendererMode<code>#EDITABLE</code>  
 * the <code>GtkCellRendererText</code> allows to edit its text using an entry.
 */
public class CellRendererText extends CellRenderer {

    public CellRendererText(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellRendererText */
    public static CellRendererText castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererText(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_cell_renderer_text_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkCellRendererText</code>. Adjust how text is drawn using
     * object properties. Object properties can be
     * set globally (with g_object_set()). Also, with <code>GtkTreeViewColumn</code>,
     * you can bind a property to a value in a <code>GtkTreeModel</code>. For example,
     * you can bind the &<code>#8220</code> text&<code>#8221</code>  property on the cell renderer to a string
     * value in the model, thus rendering a different string in each row
     * of the <code>GtkTreeView</code>.
     */
    public CellRendererText() {
        super(constructNew());
    }
    
    /**
     * Sets the height of a renderer to explicitly be determined by the &<code>#8220</code> font&<code>#8221</code>  and
     * &<code>#8220</code> y_pad&<code>#8221</code>  property set on it.  Further changes in these properties do not
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
    public SignalHandle onEdited(EditedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellRendererTextEdited", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("edited").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
