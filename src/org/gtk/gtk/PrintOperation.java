package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkPrintOperation} is the high-level, portable printing API.
 * <p>
 * It looks a bit different than other GTK dialogs such as the
 * {@code GtkFileChooser}, since some platforms don’t expose enough
 * infrastructure to implement a good print dialog. On such
 * platforms, {@code GtkPrintOperation} uses the native print dialog.
 * On platforms which do not provide a native print dialog, GTK
 * uses its own, see {@link PrintUnixDialog}.
 * <p>
 * The typical way to use the high-level printing API is to create
 * a {@code GtkPrintOperation} object with {@link PrintOperation#PrintOperation}
 * when the user selects to print. Then you set some properties on it,
 * e.g. the page size, any {@link PrintSettings} from previous print
 * operations, the number of pages, the current page, etc.
 * <p>
 * Then you start the print operation by calling {@link PrintOperation#run}.
 * It will then show a dialog, let the user select a printer and options.
 * When the user finished the dialog, various signals will be emitted on
 * the {@code GtkPrintOperation}, the main one being
 * {@code Gtk.PrintOperation::draw-page}, which you are supposed to handle
 * and render the page on the provided {@link PrintContext} using Cairo.
 * <p>
 * <h1>The high-level printing API</h1>
 * <p>
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * By default {@code GtkPrintOperation} uses an external application to do
 * print preview. To implement a custom print preview, an application
 * must connect to the preview signal. The functions
 * {@link PrintOperationPreview#renderPage},
 * {@link PrintOperationPreview#endPreview} and
 * {@link PrintOperationPreview#isSelected}
 * are useful when implementing a print preview.
 */
public class PrintOperation extends org.gtk.gobject.Object implements PrintOperationPreview {

    public PrintOperation(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PrintOperation */
    public static PrintOperation castFrom(org.gtk.gobject.Object gobject) {
        return new PrintOperation(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_print_operation_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPrintOperation}.
     */
    public PrintOperation() {
        super(constructNew());
    }
    
    /**
     * Cancels a running print operation.
     * <p>
     * This function may be called from a {@code Gtk.PrintOperation::begin-print},
     * {@code Gtk.PrintOperation::draw-page}
     * signal handler to stop the currently running print operation.
     */
    public void cancel() {
        gtk_h.gtk_print_operation_cancel(handle());
    }
    
    /**
     * Signal that drawing of particular page is complete.
     * <p>
     * It is called after completion of page drawing (e.g. drawing
     * in another thread). If {@link PrintOperation#setDeferDrawing}
     * was called before, then this function has to be called by application.
     * Otherwise it is called by GTK itself.
     */
    public void drawPageFinish() {
        gtk_h.gtk_print_operation_draw_page_finish(handle());
    }
    
    /**
     * Returns the default page setup.
     */
    public PageSetup getDefaultPageSetup() {
        var RESULT = gtk_h.gtk_print_operation_get_default_page_setup(handle());
        return new PageSetup(References.get(RESULT, false));
    }
    
    /**
     * Gets whether page setup selection combos are embedded
     */
    public boolean getEmbedPageSetup() {
        var RESULT = gtk_h.gtk_print_operation_get_embed_page_setup(handle());
        return (RESULT != 0);
    }
    
    /**
     * Call this when the result of a print operation is
     * {@link PrintOperationResult#ERROR}.
     * <p>
     * It can be called either after {@link PrintOperation#run}
     * returns, or in the {@code Gtk.PrintOperation::done} signal
     * handler.
     * <p>
     * The returned {@code GError} will contain more details on what went wrong.
     */
    public void getError() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        gtk_h.gtk_print_operation_get_error(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
    }
    
    /**
     * Gets whether there is a selection.
     */
    public boolean getHasSelection() {
        var RESULT = gtk_h.gtk_print_operation_get_has_selection(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the number of pages that will be printed.
     * <p>
     * Note that this value is set during print preparation phase
     * ({@link PrintStatus#PREPARING}), so this function should never be
     * called before the data generation phase ({@link PrintStatus#GENERATING_DATA}).
     * You can connect to the {@code Gtk.PrintOperation::status-changed}
     * signal and call gtk_print_operation_get_n_pages_to_print() when
     * print status is {@link PrintStatus#GENERATING_DATA}.
     * <p>
     * This is typically used to track the progress of print operation.
     */
    public int getNPagesToPrint() {
        var RESULT = gtk_h.gtk_print_operation_get_n_pages_to_print(handle());
        return RESULT;
    }
    
    /**
     * Returns the current print settings.
     * <p>
     * Note that the return value is <code>null</code> until either
     * {@link PrintOperation#setPrintSettings} or
     * {@link PrintOperation#run} have been called.
     */
    public PrintSettings getPrintSettings() {
        var RESULT = gtk_h.gtk_print_operation_get_print_settings(handle());
        return new PrintSettings(References.get(RESULT, false));
    }
    
    /**
     * Returns the status of the print operation.
     * <p>
     * Also see {@link PrintOperation#getStatusString}.
     */
    public PrintStatus getStatus() {
        var RESULT = gtk_h.gtk_print_operation_get_status(handle());
        return PrintStatus.fromValue(RESULT);
    }
    
    /**
     * Returns a string representation of the status of the
     * print operation.
     * <p>
     * The string is translated and suitable for displaying
     * the print status e.g. in a {@code GtkStatusbar}.
     * <p>
     * Use {@link PrintOperation#getStatus} to obtain
     * a status value that is suitable for programmatic use.
     */
    public java.lang.String getStatusString() {
        var RESULT = gtk_h.gtk_print_operation_get_status_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the application supports print of selection
     */
    public boolean getSupportSelection() {
        var RESULT = gtk_h.gtk_print_operation_get_support_selection(handle());
        return (RESULT != 0);
    }
    
    /**
     * A convenience function to find out if the print operation
     * is finished.
     * <p>
     * a print operation is finished if its status is either
     * {@link PrintStatus#FINISHED} or {@link PrintStatus#FINISHED_ABORTED}.
     * <p>
     * Note: when you enable print status tracking the print operation
     * can be in a non-finished state even after done has been called, as
     * the operation status then tracks the print job status on the printer.
     */
    public boolean isFinished() {
        var RESULT = gtk_h.gtk_print_operation_is_finished(handle());
        return (RESULT != 0);
    }
    
    /**
     * Runs the print operation.
     * <p>
     * Normally that this function does not return until the rendering
     * of all pages is complete. You can connect to the
     * {@code Gtk.PrintOperation::status-changed} signal on {@code op} to obtain
     * some information about the progress of the print operation.
     * <p>
     * Furthermore, it may use a recursive mainloop to show the print dialog.
     * <p>
     * If you set the [Gtk.PrintOperation:allow-async] property, the operation
     * will run asynchronously if this is supported on the platform. The
     * {@code Gtk.PrintOperation::done} signal will be emitted with the result
     * of the operation when the it is done (i.e. when the dialog is canceled,
     * or when the print succeeds or fails).
     * <p>
     * <pre>{@code c
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
     * }</pre>
     * <p>
     * Note that gtk_print_operation_run() can only be called once on a
     * given {@code GtkPrintOperation}.
     */
    public PrintOperationResult run(PrintOperationAction action, Window parent) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_print_operation_run(handle(), action.getValue(), parent.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return PrintOperationResult.fromValue(RESULT);
    }
    
    /**
     * Sets whether gtk_print_operation_run() may return
     * before the print operation is completed.
     * <p>
     * Note that some platforms may not allow asynchronous
     * operation.
     */
    public void setAllowAsync(boolean allowAsync) {
        gtk_h.gtk_print_operation_set_allow_async(handle(), allowAsync ? 1 : 0);
    }
    
    /**
     * Sets the current page.
     * <p>
     * If this is called before {@link PrintOperation#run},
     * the user will be able to select to print only the current page.
     * <p>
     * Note that this only makes sense for pre-paginated documents.
     */
    public void setCurrentPage(int currentPage) {
        gtk_h.gtk_print_operation_set_current_page(handle(), currentPage);
    }
    
    /**
     * Sets the label for the tab holding custom widgets.
     */
    public void setCustomTabLabel(java.lang.String label) {
        gtk_h.gtk_print_operation_set_custom_tab_label(handle(), Interop.allocateNativeString(label).handle());
    }
    
    /**
     * Makes {@code default_page_setup} the default page setup for {@code op}.
     * <p>
     * This page setup will be used by {@link PrintOperation#run},
     * but it can be overridden on a per-page basis by connecting
     * to the {@code Gtk.PrintOperation::request-page-setup} signal.
     */
    public void setDefaultPageSetup(PageSetup defaultPageSetup) {
        gtk_h.gtk_print_operation_set_default_page_setup(handle(), defaultPageSetup.handle());
    }
    
    /**
     * Sets up the {@code GtkPrintOperation} to wait for calling of
     * [method{@code Gtk}.PrintOperation.draw_page_finish from application.
     * <p>
     * This can be used for drawing page in another thread.
     * <p>
     * This function must be called in the callback of the
     * {@code Gtk.PrintOperation::draw-page} signal.
     */
    public void setDeferDrawing() {
        gtk_h.gtk_print_operation_set_defer_drawing(handle());
    }
    
    /**
     * Embed page size combo box and orientation combo box into page setup page.
     * <p>
     * Selected page setup is stored as default page setup in {@code GtkPrintOperation}.
     */
    public void setEmbedPageSetup(boolean embed) {
        gtk_h.gtk_print_operation_set_embed_page_setup(handle(), embed ? 1 : 0);
    }
    
    /**
     * Sets up the {@code GtkPrintOperation} to generate a file instead
     * of showing the print dialog.
     * <p>
     * The intended use of this function is for implementing
     * “Export to PDF” actions. Currently, PDF is the only supported
     * format.
     * <p>
     * “Print to PDF” support is independent of this and is done
     * by letting the user pick the “Print to PDF” item from the list
     * of printers in the print dialog.
     */
    public void setExportFilename(java.lang.String filename) {
        gtk_h.gtk_print_operation_set_export_filename(handle(), Interop.allocateNativeString(filename).handle());
    }
    
    /**
     * Sets whether there is a selection to print.
     * <p>
     * Application has to set number of pages to which the selection
     * will draw by {@link PrintOperation#setNPages} in a handler
     * for the {@code Gtk.PrintOperation::begin-print} signal.
     */
    public void setHasSelection(boolean hasSelection) {
        gtk_h.gtk_print_operation_set_has_selection(handle(), hasSelection ? 1 : 0);
    }
    
    /**
     * Sets the name of the print job.
     * <p>
     * The name is used to identify the job (e.g. in monitoring
     * applications like eggcups).
     * <p>
     * If you don’t set a job name, GTK picks a default one by
     * numbering successive print jobs.
     */
    public void setJobName(java.lang.String jobName) {
        gtk_h.gtk_print_operation_set_job_name(handle(), Interop.allocateNativeString(jobName).handle());
    }
    
    /**
     * Sets the number of pages in the document.
     * <p>
     * This must be set to a positive number before the rendering
     * starts. It may be set in a {@code Gtk.PrintOperation::begin-print}
     * signal handler.
     * <p>
     * Note that the page numbers passed to the
     * {@code Gtk.PrintOperation::request-page-setup}
     * and {@code Gtk.PrintOperation::draw-page} signals are 0-based, i.e.
     * if the user chooses to print all pages, the last ::draw-page signal
     * will be for page {@code n_pages} - 1.
     */
    public void setNPages(int nPages) {
        gtk_h.gtk_print_operation_set_n_pages(handle(), nPages);
    }
    
    /**
     * Sets the print settings for {@code op}.
     * <p>
     * This is typically used to re-establish print settings
     * from a previous print operation, see {@link PrintOperation#run}.
     */
    public void setPrintSettings(PrintSettings printSettings) {
        gtk_h.gtk_print_operation_set_print_settings(handle(), printSettings.handle());
    }
    
    /**
     * If {@code show_progress} is <code>true</code>, the print operation will show
     * a progress dialog during the print operation.
     */
    public void setShowProgress(boolean showProgress) {
        gtk_h.gtk_print_operation_set_show_progress(handle(), showProgress ? 1 : 0);
    }
    
    /**
     * Sets whether selection is supported by {@code GtkPrintOperation}.
     */
    public void setSupportSelection(boolean supportSelection) {
        gtk_h.gtk_print_operation_set_support_selection(handle(), supportSelection ? 1 : 0);
    }
    
    /**
     * If track_status is <code>true</code>, the print operation will try to continue
     * report on the status of the print job in the printer queues and printer.
     * <p>
     * This can allow your application to show things like “out of paper”
     * issues, and when the print job actually reaches the printer.
     * <p>
     * This function is often implemented using some form of polling,
     * so it should not be enabled unless needed.
     */
    public void setTrackPrintStatus(boolean trackStatus) {
        gtk_h.gtk_print_operation_set_track_print_status(handle(), trackStatus ? 1 : 0);
    }
    
    /**
     * Sets up the transformation for the cairo context obtained from
     * {@code GtkPrintContext} in such a way that distances are measured in
     * units of {@code unit}.
     */
    public void setUnit(Unit unit) {
        gtk_h.gtk_print_operation_set_unit(handle(), unit.getValue());
    }
    
    /**
     * If {@code full_page} is <code>true</code>, the transformation for the cairo context
     * obtained from {@code GtkPrintContext} puts the origin at the top left
     * corner of the page.
     * <p>
     * This may not be the top left corner of the sheet, depending on page
     * orientation and the number of pages per sheet). Otherwise, the origin
     * is at the top left corner of the imageable area (i.e. inside the margins).
     */
    public void setUseFullPage(boolean fullPage) {
        gtk_h.gtk_print_operation_set_use_full_page(handle(), fullPage ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface BeginPrintHandler {
        void signalReceived(PrintOperation source, PrintContext context);
    }
    
    /**
     * Emitted after the user has finished changing print settings
     * in the dialog, before the actual rendering starts.
     * <p>
     * A typical use for ::begin-print is to use the parameters from the
     * {@link PrintContext} and paginate the document accordingly,
     * and then set the number of pages with
     * {@link PrintOperation#setNPages}.
     */
    public SignalHandle onBeginPrint(BeginPrintHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationBeginPrint", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("begin-print").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * If you return a widget in a handler for this signal it will be
     * added to a custom tab in the print dialog. You typically return a
     * container widget with multiple widgets in it.
     * <p>
     * The print dialog owns the returned widget, and its lifetime is not
     * controlled by the application. However, the widget is guaranteed
     * to stay around until the {@code Gtk.PrintOperation::custom-widget-apply}
     * signal is emitted on the operation. Then you can read out any
     * information you need from the widgets.
     */
    public SignalHandle onCreateCustomWidget(CreateCustomWidgetHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationCreateCustomWidget", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("create-custom-widget").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * When you get this signal you should read the information from the
     * custom widgets, as the widgets are not guaranteed to be around at a
     * later time.
     */
    public SignalHandle onCustomWidgetApply(CustomWidgetApplyHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationCustomWidgetApply", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("custom-widget-apply").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * {@code result} gives you information about what happened during the run.
     * If {@code result} is {@link PrintOperationResult#ERROR} then you can call
     * {@link PrintOperation#getError} for more information.
     * <p>
     * If you enabled print status tracking then
     * {@link PrintOperation#isFinished} may still return <code>false</code>
     * after the ::done signal was emitted.
     */
    public SignalHandle onDone(DoneHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationDone", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("done").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * The signal handler must render the {@code page_nr}'s page onto the cairo
     * context obtained from {@code context} using
     * {@link PrintContext#getCairoContext}.
     * <p>
     * <pre>{@code c
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
     * }</pre>
     * <p>
     * Use {@link PrintOperation#setUseFullPage} and
     * {@link PrintOperation#setUnit} before starting the print
     * operation to set up the transformation of the cairo context
     * according to your needs.
     */
    public SignalHandle onDrawPage(DrawPageHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationDrawPage", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("draw-page").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * A handler for this signal can clean up any resources that have
     * been allocated in the {@code Gtk.PrintOperation::begin-print} handler.
     */
    public SignalHandle onEndPrint(EndPrintHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationEndPrint", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("end-print").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * It keeps getting emitted until a connected signal handler returns <code>true</code>.
     * <p>
     * The ::paginate signal is intended to be used for paginating a document
     * in small chunks, to avoid blocking the user interface for a long
     * time. The signal handler should update the number of pages using
     * {@link PrintOperation#setNPages}, and return <code>true</code> if the document
     * has been completely paginated.
     * <p>
     * If you don't need to do pagination in chunks, you can simply do
     * it all in the ::begin-print handler, and set the number of pages
     * from there.
     */
    public SignalHandle onPaginate(PaginateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationPaginate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("paginate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * The default handler for this signal uses an external viewer
     * application to preview.
     * <p>
     * To implement a custom print preview, an application must return
     * <code>true</code> from its handler for this signal. In order to use the
     * provided {@code context} for the preview implementation, it must be
     * given a suitable cairo context with
     * {@link PrintContext#setCairoContext}.
     * <p>
     * The custom preview implementation can use
     * {@link PrintOperationPreview#isSelected} and
     * {@link PrintOperationPreview#renderPage} to find pages which
     * are selected for print and render them. The preview must be
     * finished by calling {@link PrintOperationPreview#endPreview}
     * (typically in response to the user clicking a close button).
     */
    public SignalHandle onPreview(PreviewHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationPreview", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("preview").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * This gives the application a chance to modify the page setup.
     * Any changes done to {@code setup} will be in force only for printing
     * this page.
     */
    public SignalHandle onRequestPageSetup(RequestPageSetupHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationRequestPageSetup", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("request-page-setup").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * See {@code Gtk.PrintStatus} for the phases that are being discriminated.
     * Use {@link PrintOperation#getStatus} to find out the current
     * status.
     */
    public SignalHandle onStatusChanged(StatusChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationStatusChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("status-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * The actual page setup and print settings are passed to the custom
     * widget, which can actualize itself according to this change.
     */
    public SignalHandle onUpdateCustomWidget(UpdateCustomWidgetHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintOperationUpdateCustomWidget", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("update-custom-widget").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
