package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkPrintOperationPreview</code> is the interface that is used to
 * implement print preview.
 * <p>
 * A <code>GtkPrintOperationPreview</code> object is passed to the
 * {@link [signal@Gtk.PrintOperation::preview] (ref=signal)} signal by
 * {@link org.gtk.gtk.PrintOperation}.
 */
public interface PrintOperationPreview extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Ends a preview.
     * 
     * This function must be called to finish a custom print preview.
     */
    public default void endPreview() {
        gtk_h.gtk_print_operation_preview_end_preview(handle());
    }
    
    /**
     * Returns whether the given page is included in the set of pages that
     * have been selected for printing.
     */
    public default boolean isSelected(int pageNr) {
        var RESULT = gtk_h.gtk_print_operation_preview_is_selected(handle(), pageNr);
        return (RESULT != 0);
    }
    
    /**
     * Renders a page to the preview.
     * 
     * This is using the print context that was passed to the
     * {@link [signal@Gtk.PrintOperation::preview] (ref=signal)} handler together
     * with @preview.
     * 
     * A custom print preview should use this function to render
     * the currently selected page.
     * 
     * Note that this function requires a suitable cairo context to
     * be associated with the print context.
     */
    public default void renderPage(int pageNr) {
        gtk_h.gtk_print_operation_preview_render_page(handle(), pageNr);
    }
    
    @FunctionalInterface
    public interface GotPageSizeHandler {
        void signalReceived(PrintOperationPreview source, PrintContext context, PageSetup pageSetup);
    }
    
    /**
     * Emitted once for each page that gets rendered to the preview.
     * 
     * A handler for this signal should update the @context
     * according to @page_setup and set up a suitable cairo
     * context, using {@link org.gtk.gtk.PrintContext#setCairoContext}.
     */
    public default SignalHandle onGotPageSize(GotPageSizeHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationPreviewGotPageSize", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("got-page-size").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ReadyHandler {
        void signalReceived(PrintOperationPreview source, PrintContext context);
    }
    
    /**
     * The ::ready signal gets emitted once per preview operation,
     * before the first page is rendered.
     * 
     * A handler for this signal can be used for setup tasks.
     */
    public default SignalHandle onReady(ReadyHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationPreviewReady", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("ready").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class PrintOperationPreviewImpl extends org.gtk.gobject.Object implements PrintOperationPreview {
        public PrintOperationPreviewImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
