package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkPrintOperationPreview} is the interface that is used to
 * implement print preview.
 * <p>
 * A {@code GtkPrintOperationPreview} object is passed to the
 * {@code Gtk.PrintOperation::preview} signal by
 * {@link PrintOperation}.
 */
public interface PrintOperationPreview extends io.github.jwharm.javagi.Proxy {

    /**
     * Ends a preview.
     * <p>
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
        return RESULT != 0;
    }
    
    /**
     * Renders a page to the preview.
     * <p>
     * This is using the print context that was passed to the
     * {@code Gtk.PrintOperation::preview} handler together
     * with {@code preview}.
     * <p>
     * A custom print preview should use this function to render
     * the currently selected page.
     * <p>
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
     * <p>
     * A handler for this signal should update the {@code context}
     * according to {@code page_setup} and set up a suitable cairo
     * context, using {@link PrintContext#setCairoContext}.
     */
    public default SignalHandle onGotPageSize(GotPageSizeHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("got-page-size").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperationPreview.class, "__signalPrintOperationPreviewGotPageSize",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalPrintOperationPreviewGotPageSize(MemoryAddress source, MemoryAddress context, MemoryAddress pageSetup, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (PrintOperationPreview.GotPageSizeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperationPreview.PrintOperationPreviewImpl(References.get(source)), new PrintContext(References.get(context, false)), new PageSetup(References.get(pageSetup, false)));
    }
    
    @FunctionalInterface
    public interface ReadyHandler {
        void signalReceived(PrintOperationPreview source, PrintContext context);
    }
    
    /**
     * The ::ready signal gets emitted once per preview operation,
     * before the first page is rendered.
     * <p>
     * A handler for this signal can be used for setup tasks.
     */
    public default SignalHandle onReady(ReadyHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("ready").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperationPreview.class, "__signalPrintOperationPreviewReady",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalPrintOperationPreviewReady(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (PrintOperationPreview.ReadyHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperationPreview.PrintOperationPreviewImpl(References.get(source)), new PrintContext(References.get(context, false)));
    }
    
    class PrintOperationPreviewImpl extends org.gtk.gobject.Object implements PrintOperationPreview {
        public PrintOperationPreviewImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
