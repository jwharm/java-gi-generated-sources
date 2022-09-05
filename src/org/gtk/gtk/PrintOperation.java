package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkPrintOperation` is the high-level, portable printing API.
 * 
 * It looks a bit different than other GTK dialogs such as the
 * `GtkFileChooser`, since some platforms don’t expose enough
 * infrastructure to implement a good print dialog. On such
 * platforms, `GtkPrintOperation` uses the native print dialog.
 * On platforms which do not provide a native print dialog, GTK
 * uses its own, see [class@Gtk.PrintUnixDialog].
 * 
 * The typical way to use the high-level printing API is to create
 * a `GtkPrintOperation` object with [ctor@Gtk.PrintOperation.new]
 * when the user selects to print. Then you set some properties on it,
 * e.g. the page size, any [class@Gtk.PrintSettings] from previous print
 * operations, the number of pages, the current page, etc.
 * 
 * Then you start the print operation by calling [method@Gtk.PrintOperation.run].
 * It will then show a dialog, let the user select a printer and options.
 * When the user finished the dialog, various signals will be emitted on
 * the `GtkPrintOperation`, the main one being
 * [signal@Gtk.PrintOperation::draw-page], which you are supposed to handle
 * and render the page on the provided [class@Gtk.PrintContext] using Cairo.
 * 
 * # The high-level printing API
 * 
 * ```c
 * static GtkPrintSettings *settings = NULL;
 * 
 * static void
 * do_print (void)
 * {
 *   GtkPrintOperation *print;
 *   GtkPrintOperationResult res;
 * 
 *   print = gtk_print_operation_new ();
 * 
 *   if (settings != NULL)
 *     gtk_print_operation_set_print_settings (print, settings);
 * 
 *   g_signal_connect (print, "begin_print", G_CALLBACK (begin_print), NULL);
 *   g_signal_connect (print, "draw_page", G_CALLBACK (draw_page), NULL);
 * 
 *   res = gtk_print_operation_run (print, GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG,
 *                                  GTK_WINDOW (main_window), NULL);
 * 
 *   if (res == GTK_PRINT_OPERATION_RESULT_APPLY)
 *     {
 *       if (settings != NULL)
 *         g_object_unref (settings);
 *       settings = g_object_ref (gtk_print_operation_get_print_settings (print));
 *     }
 * 
 *   g_object_unref (print);
 * }
 * ```
 * 
 * By default `GtkPrintOperation` uses an external application to do
 * print preview. To implement a custom print preview, an application
 * must connect to the preview signal. The functions
 * [method@Gtk.PrintOperationPreview.render_page],
 * [method@Gtk.PrintOperationPreview.end_preview] and
 * [method@Gtk.PrintOperationPreview.is_selected]
 * are useful when implementing a print preview.
 */
public class PrintOperation extends org.gtk.gobject.Object implements PrintOperationPreview {

    public PrintOperation(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to PrintOperation */
    public static PrintOperation castFrom(org.gtk.gobject.Object gobject) {
        return new PrintOperation(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkPrintOperation`.
     */
    public PrintOperation() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_new(), true));
    }
    
    /**
     * Cancels a running print operation.
     * 
     * This function may be called from a [signal@Gtk.PrintOperation::begin-print],
     * [signal@Gtk.PrintOperation::paginate] or [signal@Gtk.PrintOperation::draw-page]
     * signal handler to stop the currently running print operation.
     */
    public void cancel() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_cancel(HANDLE());
    }
    
    /**
     * Signal that drawing of particular page is complete.
     * 
     * It is called after completion of page drawing (e.g. drawing
     * in another thread). If [method@Gtk.PrintOperation.set_defer_drawing]
     * was called before, then this function has to be called by application.
     * Otherwise it is called by GTK itself.
     */
    public void drawPageFinish() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_draw_page_finish(HANDLE());
    }
    
    /**
     * Returns the default page setup.
     */
    public PageSetup getDefaultPageSetup() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_get_default_page_setup(HANDLE());
        return new PageSetup(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets whether page setup selection combos are embedded
     */
    public boolean getEmbedPageSetup() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_get_embed_page_setup(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Call this when the result of a print operation is
     * %GTK_PRINT_OPERATION_RESULT_ERROR.
     * 
     * It can be called either after [method@Gtk.PrintOperation.run]
     * returns, or in the [signal@Gtk.PrintOperation::done] signal
     * handler.
     * 
     * The returned `GError` will contain more details on what went wrong.
     */
    public void getError() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_get_error(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
    }
    
    /**
     * Gets whether there is a selection.
     */
    public boolean getHasSelection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_get_has_selection(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the number of pages that will be printed.
     * 
     * Note that this value is set during print preparation phase
     * (%GTK_PRINT_STATUS_PREPARING), so this function should never be
     * called before the data generation phase (%GTK_PRINT_STATUS_GENERATING_DATA).
     * You can connect to the [signal@Gtk.PrintOperation::status-changed]
     * signal and call gtk_print_operation_get_n_pages_to_print() when
     * print status is %GTK_PRINT_STATUS_GENERATING_DATA.
     * 
     * This is typically used to track the progress of print operation.
     */
    public int getNPagesToPrint() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_get_n_pages_to_print(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the current print settings.
     * 
     * Note that the return value is %NULL until either
     * [method@Gtk.PrintOperation.set_print_settings] or
     * [method@Gtk.PrintOperation.run] have been called.
     */
    public PrintSettings getPrintSettings() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_get_print_settings(HANDLE());
        return new PrintSettings(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the status of the print operation.
     * 
     * Also see [method@Gtk.PrintOperation.get_status_string].
     */
    public PrintStatus getStatus() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_get_status(HANDLE());
        return PrintStatus.fromValue(RESULT);
    }
    
    /**
     * Returns a string representation of the status of the
     * print operation.
     * 
     * The string is translated and suitable for displaying
     * the print status e.g. in a `GtkStatusbar`.
     * 
     * Use [method@Gtk.PrintOperation.get_status] to obtain
     * a status value that is suitable for programmatic use.
     */
    public java.lang.String getStatusString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_get_status_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the application supports print of selection
     */
    public boolean getSupportSelection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_get_support_selection(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * A convenience function to find out if the print operation
     * is finished.
     * 
     * a print operation is finished if its status is either
     * %GTK_PRINT_STATUS_FINISHED or %GTK_PRINT_STATUS_FINISHED_ABORTED.
     * 
     * Note: when you enable print status tracking the print operation
     * can be in a non-finished state even after done has been called, as
     * the operation status then tracks the print job status on the printer.
     */
    public boolean isFinished() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_is_finished(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Runs the print operation.
     * 
     * Normally that this function does not return until the rendering
     * of all pages is complete. You can connect to the
     * [signal@Gtk.PrintOperation::status-changed] signal on @op to obtain
     * some information about the progress of the print operation.
     * 
     * Furthermore, it may use a recursive mainloop to show the print dialog.
     * 
     * If you set the [Gtk.PrintOperation:allow-async] property, the operation
     * will run asynchronously if this is supported on the platform. The
     * [signal@Gtk.PrintOperation::done] signal will be emitted with the result
     * of the operation when the it is done (i.e. when the dialog is canceled,
     * or when the print succeeds or fails).
     * 
     * ```c
     * if (settings != NULL)
     *   gtk_print_operation_set_print_settings (print, settings);
     * 
     * if (page_setup != NULL)
     *   gtk_print_operation_set_default_page_setup (print, page_setup);
     * 
     * g_signal_connect (print, "begin-print",
     *                   G_CALLBACK (begin_print), &data);
     * g_signal_connect (print, "draw-page",
     *                   G_CALLBACK (draw_page), &data);
     * 
     * res = gtk_print_operation_run (print,
     *                                GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG,
     *                                parent,
     *                                &error);
     * 
     * if (res == GTK_PRINT_OPERATION_RESULT_ERROR)
     *  {
     *    error_dialog = gtk_message_dialog_new (GTK_WINDOW (parent),
     *   			                     GTK_DIALOG_DESTROY_WITH_PARENT,
     * 					     GTK_MESSAGE_ERROR,
     * 					     GTK_BUTTONS_CLOSE,
     * 					     "Error printing file:\\n%s",
     * 					     error->message);
     *    g_signal_connect (error_dialog, "response",
     *                      G_CALLBACK (gtk_window_destroy), NULL);
     *    gtk_widget_show (error_dialog);
     *    g_error_free (error);
     *  }
     * else if (res == GTK_PRINT_OPERATION_RESULT_APPLY)
     *  {
     *    if (settings != NULL)
     * g_object_unref (settings);
     *    settings = g_object_ref (gtk_print_operation_get_print_settings (print));
     *  }
     * ```
     * 
     * Note that gtk_print_operation_run() can only be called once on a
     * given `GtkPrintOperation`.
     */
    public PrintOperationResult run(PrintOperationAction action, Window parent) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_run(HANDLE(), action.getValue(), parent.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return PrintOperationResult.fromValue(RESULT);
    }
    
    /**
     * Sets whether gtk_print_operation_run() may return
     * before the print operation is completed.
     * 
     * Note that some platforms may not allow asynchronous
     * operation.
     */
    public void setAllowAsync(boolean allowAsync) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_allow_async(HANDLE(), allowAsync ? 1 : 0);
    }
    
    /**
     * Sets the current page.
     * 
     * If this is called before [method@Gtk.PrintOperation.run],
     * the user will be able to select to print only the current page.
     * 
     * Note that this only makes sense for pre-paginated documents.
     */
    public void setCurrentPage(int currentPage) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_current_page(HANDLE(), currentPage);
    }
    
    /**
     * Sets the label for the tab holding custom widgets.
     */
    public void setCustomTabLabel(java.lang.String label) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_custom_tab_label(HANDLE(), Interop.allocateNativeString(label).HANDLE());
    }
    
    /**
     * Makes @default_page_setup the default page setup for @op.
     * 
     * This page setup will be used by [method@Gtk.PrintOperation.run],
     * but it can be overridden on a per-page basis by connecting
     * to the [signal@Gtk.PrintOperation::request-page-setup] signal.
     */
    public void setDefaultPageSetup(PageSetup defaultPageSetup) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_default_page_setup(HANDLE(), defaultPageSetup.HANDLE());
    }
    
    /**
     * Sets up the `GtkPrintOperation` to wait for calling of
     * [method@Gtk.PrintOperation.draw_page_finish from application.
     * 
     * This can be used for drawing page in another thread.
     * 
     * This function must be called in the callback of the
     * [signal@Gtk.PrintOperation::draw-page] signal.
     */
    public void setDeferDrawing() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_defer_drawing(HANDLE());
    }
    
    /**
     * Embed page size combo box and orientation combo box into page setup page.
     * 
     * Selected page setup is stored as default page setup in `GtkPrintOperation`.
     */
    public void setEmbedPageSetup(boolean embed) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_embed_page_setup(HANDLE(), embed ? 1 : 0);
    }
    
    /**
     * Sets up the `GtkPrintOperation` to generate a file instead
     * of showing the print dialog.
     * 
     * The intended use of this function is for implementing
     * “Export to PDF” actions. Currently, PDF is the only supported
     * format.
     * 
     * “Print to PDF” support is independent of this and is done
     * by letting the user pick the “Print to PDF” item from the list
     * of printers in the print dialog.
     */
    public void setExportFilename(java.lang.String filename) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_export_filename(HANDLE(), Interop.allocateNativeString(filename).HANDLE());
    }
    
    /**
     * Sets whether there is a selection to print.
     * 
     * Application has to set number of pages to which the selection
     * will draw by [method@Gtk.PrintOperation.set_n_pages] in a handler
     * for the [signal@Gtk.PrintOperation::begin-print] signal.
     */
    public void setHasSelection(boolean hasSelection) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_has_selection(HANDLE(), hasSelection ? 1 : 0);
    }
    
    /**
     * Sets the name of the print job.
     * 
     * The name is used to identify the job (e.g. in monitoring
     * applications like eggcups).
     * 
     * If you don’t set a job name, GTK picks a default one by
     * numbering successive print jobs.
     */
    public void setJobName(java.lang.String jobName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_job_name(HANDLE(), Interop.allocateNativeString(jobName).HANDLE());
    }
    
    /**
     * Sets the number of pages in the document.
     * 
     * This must be set to a positive number before the rendering
     * starts. It may be set in a [signal@Gtk.PrintOperation::begin-print]
     * signal handler.
     * 
     * Note that the page numbers passed to the
     * [signal@Gtk.PrintOperation::request-page-setup]
     * and [signal@Gtk.PrintOperation::draw-page] signals are 0-based, i.e.
     * if the user chooses to print all pages, the last ::draw-page signal
     * will be for page @n_pages - 1.
     */
    public void setNPages(int nPages) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_n_pages(HANDLE(), nPages);
    }
    
    /**
     * Sets the print settings for @op.
     * 
     * This is typically used to re-establish print settings
     * from a previous print operation, see [method@Gtk.PrintOperation.run].
     */
    public void setPrintSettings(PrintSettings printSettings) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_print_settings(HANDLE(), printSettings.HANDLE());
    }
    
    /**
     * If @show_progress is %TRUE, the print operation will show
     * a progress dialog during the print operation.
     */
    public void setShowProgress(boolean showProgress) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_show_progress(HANDLE(), showProgress ? 1 : 0);
    }
    
    /**
     * Sets whether selection is supported by `GtkPrintOperation`.
     */
    public void setSupportSelection(boolean supportSelection) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_support_selection(HANDLE(), supportSelection ? 1 : 0);
    }
    
    /**
     * If track_status is %TRUE, the print operation will try to continue
     * report on the status of the print job in the printer queues and printer.
     * 
     * This can allow your application to show things like “out of paper”
     * issues, and when the print job actually reaches the printer.
     * 
     * This function is often implemented using some form of polling,
     * so it should not be enabled unless needed.
     */
    public void setTrackPrintStatus(boolean trackStatus) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_track_print_status(HANDLE(), trackStatus ? 1 : 0);
    }
    
    /**
     * Sets up the transformation for the cairo context obtained from
     * `GtkPrintContext` in such a way that distances are measured in
     * units of @unit.
     */
    public void setUnit(Unit unit) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_unit(HANDLE(), unit.getValue());
    }
    
    /**
     * If @full_page is %TRUE, the transformation for the cairo context
     * obtained from `GtkPrintContext` puts the origin at the top left
     * corner of the page.
     * 
     * This may not be the top left corner of the sheet, depending on page
     * orientation and the number of pages per sheet). Otherwise, the origin
     * is at the top left corner of the imageable area (i.e. inside the margins).
     */
    public void setUseFullPage(boolean fullPage) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_operation_set_use_full_page(HANDLE(), fullPage ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface BeginPrintHandler {
        void signalReceived(PrintOperation source, PrintContext context);
    }
    
    /**
     * Emitted after the user has finished changing print settings
     * in the dialog, before the actual rendering starts.
     * 
     * A typical use for ::begin-print is to use the parameters from the
     * [class@Gtk.PrintContext] and paginate the document accordingly,
     * and then set the number of pages with
     * [method@Gtk.PrintOperation.set_n_pages].
     */
    public void onBeginPrint(BeginPrintHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationBeginPrint", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("begin-print").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CreateCustomWidgetHandler {
        void signalReceived(PrintOperation source);
    }
    
    /**
     * Emitted when displaying the print dialog.
     * 
     * If you return a widget in a handler for this signal it will be
     * added to a custom tab in the print dialog. You typically return a
     * container widget with multiple widgets in it.
     * 
     * The print dialog owns the returned widget, and its lifetime is not
     * controlled by the application. However, the widget is guaranteed
     * to stay around until the [signal@Gtk.PrintOperation::custom-widget-apply]
     * signal is emitted on the operation. Then you can read out any
     * information you need from the widgets.
     */
    public void onCreateCustomWidget(CreateCustomWidgetHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationCreateCustomWidget", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("create-custom-widget").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CustomWidgetApplyHandler {
        void signalReceived(PrintOperation source, Widget widget);
    }
    
    /**
     * Emitted right before ::begin-print if you added
     * a custom widget in the ::create-custom-widget handler.
     * 
     * When you get this signal you should read the information from the
     * custom widgets, as the widgets are not guaranteed to be around at a
     * later time.
     */
    public void onCustomWidgetApply(CustomWidgetApplyHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationCustomWidgetApply", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("custom-widget-apply").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DoneHandler {
        void signalReceived(PrintOperation source, PrintOperationResult result);
    }
    
    /**
     * Emitted when the print operation run has finished doing
     * everything required for printing.
     * 
     * @result gives you information about what happened during the run.
     * If @result is %GTK_PRINT_OPERATION_RESULT_ERROR then you can call
     * [method@Gtk.PrintOperation.get_error] for more information.
     * 
     * If you enabled print status tracking then
     * [method@Gtk.PrintOperation.is_finished] may still return %FALSE
     * after the ::done signal was emitted.
     */
    public void onDone(DoneHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationDone", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("done").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DrawPageHandler {
        void signalReceived(PrintOperation source, PrintContext context, int pageNr);
    }
    
    /**
     * Emitted for every page that is printed.
     * 
     * The signal handler must render the @page_nr's page onto the cairo
     * context obtained from @context using
     * [method@Gtk.PrintContext.get_cairo_context].
     * 
     * ```c
     * static void
     * draw_page (GtkPrintOperation *operation,
     *            GtkPrintContext   *context,
     *            int                page_nr,
     *            gpointer           user_data)
     * {
     *   cairo_t *cr;
     *   PangoLayout *layout;
     *   double width, text_height;
     *   int layout_height;
     *   PangoFontDescription *desc;
     *   
     *   cr = gtk_print_context_get_cairo_context (context);
     *   width = gtk_print_context_get_width (context);
     *   
     *   cairo_rectangle (cr, 0, 0, width, HEADER_HEIGHT);
     *   
     *   cairo_set_source_rgb (cr, 0.8, 0.8, 0.8);
     *   cairo_fill (cr);
     *   
     *   layout = gtk_print_context_create_pango_layout (context);
     *   
     *   desc = pango_font_description_from_string ("sans 14");
     *   pango_layout_set_font_description (layout, desc);
     *   pango_font_description_free (desc);
     *   
     *   pango_layout_set_text (layout, "some text", -1);
     *   pango_layout_set_width (layout, width * PANGO_SCALE);
     *   pango_layout_set_alignment (layout, PANGO_ALIGN_CENTER);
     *      		      
     *   pango_layout_get_size (layout, NULL, &layout_height);
     *   text_height = (double)layout_height / PANGO_SCALE;
     *   
     *   cairo_move_to (cr, width / 2,  (HEADER_HEIGHT - text_height) / 2);
     *   pango_cairo_show_layout (cr, layout);
     *   
     *   g_object_unref (layout);
     * }
     * ```
     * 
     * Use [method@Gtk.PrintOperation.set_use_full_page] and
     * [method@Gtk.PrintOperation.set_unit] before starting the print
     * operation to set up the transformation of the cairo context
     * according to your needs.
     */
    public void onDrawPage(DrawPageHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationDrawPage", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("draw-page").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface EndPrintHandler {
        void signalReceived(PrintOperation source, PrintContext context);
    }
    
    /**
     * Emitted after all pages have been rendered.
     * 
     * A handler for this signal can clean up any resources that have
     * been allocated in the [signal@Gtk.PrintOperation::begin-print] handler.
     */
    public void onEndPrint(EndPrintHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationEndPrint", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("end-print").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PaginateHandler {
        boolean signalReceived(PrintOperation source, PrintContext context);
    }
    
    /**
     * Emitted after the ::begin-print signal, but before the actual rendering
     * starts.
     * 
     * It keeps getting emitted until a connected signal handler returns %TRUE.
     * 
     * The ::paginate signal is intended to be used for paginating a document
     * in small chunks, to avoid blocking the user interface for a long
     * time. The signal handler should update the number of pages using
     * [method@Gtk.PrintOperation.set_n_pages], and return %TRUE if the document
     * has been completely paginated.
     * 
     * If you don't need to do pagination in chunks, you can simply do
     * it all in the ::begin-print handler, and set the number of pages
     * from there.
     */
    public void onPaginate(PaginateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationPaginate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("paginate").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PreviewHandler {
        boolean signalReceived(PrintOperation source, PrintOperationPreview preview, PrintContext context, Window parent);
    }
    
    /**
     * Gets emitted when a preview is requested from the native dialog.
     * 
     * The default handler for this signal uses an external viewer
     * application to preview.
     * 
     * To implement a custom print preview, an application must return
     * %TRUE from its handler for this signal. In order to use the
     * provided @context for the preview implementation, it must be
     * given a suitable cairo context with
     * [method@Gtk.PrintContext.set_cairo_context].
     * 
     * The custom preview implementation can use
     * [method@Gtk.PrintOperationPreview.is_selected] and
     * [method@Gtk.PrintOperationPreview.render_page] to find pages which
     * are selected for print and render them. The preview must be
     * finished by calling [method@Gtk.PrintOperationPreview.end_preview]
     * (typically in response to the user clicking a close button).
     */
    public void onPreview(PreviewHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationPreview", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("preview").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RequestPageSetupHandler {
        void signalReceived(PrintOperation source, PrintContext context, int pageNr, PageSetup setup);
    }
    
    /**
     * Emitted once for every page that is printed.
     * 
     * This gives the application a chance to modify the page setup.
     * Any changes done to @setup will be in force only for printing
     * this page.
     */
    public void onRequestPageSetup(RequestPageSetupHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationRequestPageSetup", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("request-page-setup").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface StatusChangedHandler {
        void signalReceived(PrintOperation source);
    }
    
    /**
     * Emitted at between the various phases of the print operation.
     * 
     * See [enum@Gtk.PrintStatus] for the phases that are being discriminated.
     * Use [method@Gtk.PrintOperation.get_status] to find out the current
     * status.
     */
    public void onStatusChanged(StatusChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationStatusChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("status-changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UpdateCustomWidgetHandler {
        void signalReceived(PrintOperation source, Widget widget, PageSetup setup, PrintSettings settings);
    }
    
    /**
     * Emitted after change of selected printer.
     * 
     * The actual page setup and print settings are passed to the custom
     * widget, which can actualize itself according to this change.
     */
    public void onUpdateCustomWidget(UpdateCustomWidgetHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationUpdateCustomWidget", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("update-custom-widget").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
