package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkPrintOperationPreview` is the interface that is used to
 * implement print preview.
 * 
 * A `GtkPrintOperationPreview` object is passed to the
 * [signal@Gtk.PrintOperation::preview] signal by
 * [class@Gtk.PrintOperation].
 */
public interface PrintOperationPreview extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Ends a preview.
     * 
     * This function must be called to finish a custom print preview.
     */
    public default void endPreview() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_preview_end_preview(HANDLE());
    }
    
    /**
     * Returns whether the given page is included in the set of pages that
     * have been selected for printing.
     */
    public default boolean isSelected(int pageNr) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_preview_is_selected(HANDLE(), pageNr);
        return (RESULT != 0);
    }
    
    /**
     * Renders a page to the preview.
     * 
     * This is using the print context that was passed to the
     * [signal@Gtk.PrintOperation::preview] handler together
     * with @preview.
     * 
     * A custom print preview should use this function to render
     * the currently selected page.
     * 
     * Note that this function requires a suitable cairo context to
     * be associated with the print context.
     */
    public default void renderPage(int pageNr) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_preview_render_page(HANDLE(), pageNr);
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
     * context, using [method@Gtk.PrintContext.set_cairo_context].
     */
    public default void onGotPageSize(GotPageSizeHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationPreviewGotPageSize", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("got-page-size").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public default void onReady(ReadyHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationPreviewReady", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("ready").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class PrintOperationPreviewImpl extends org.gtk.gobject.Object implements PrintOperationPreview {
        public PrintOperationPreviewImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
