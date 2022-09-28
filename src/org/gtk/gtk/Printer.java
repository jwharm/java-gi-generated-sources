package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkPrinter} object represents a printer.
 * <p>
 * You only need to deal directly with printers if you use the
 * non-portable {@link PrintUnixDialog} API.
 * <p>
 * A {@code GtkPrinter} allows to get status information about the printer,
 * such as its description, its location, the number of queued jobs,
 * etc. Most importantly, a {@code GtkPrinter} object can be used to create
 * a {@link PrintJob} object, which lets you print to the printer.
 */
public class Printer extends org.gtk.gobject.Object {

    public Printer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Printer */
    public static Printer castFrom(org.gtk.gobject.Object gobject) {
        return new Printer(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String name, PrintBackend backend, boolean virtual) {
        Reference RESULT = References.get(gtk_h.gtk_printer_new(Interop.allocateNativeString(name).handle(), backend.handle(), virtual ? 1 : 0), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPrinter}.
     */
    public Printer(java.lang.String name, PrintBackend backend, boolean virtual) {
        super(constructNew(name, backend, virtual));
    }
    
    /**
     * Returns whether the printer accepts input in
     * PDF format.
     */
    public boolean acceptsPdf() {
        var RESULT = gtk_h.gtk_printer_accepts_pdf(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the printer accepts input in
     * PostScript format.
     */
    public boolean acceptsPs() {
        var RESULT = gtk_h.gtk_printer_accepts_ps(handle());
        return (RESULT != 0);
    }
    
    /**
     * Compares two printers.
     */
    public int compare(Printer b) {
        var RESULT = gtk_h.gtk_printer_compare(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Returns the backend of the printer.
     */
    public PrintBackend getBackend() {
        var RESULT = gtk_h.gtk_printer_get_backend(handle());
        return new PrintBackend(References.get(RESULT, false));
    }
    
    /**
     * Returns the printer’s capabilities.
     * <p>
     * This is useful when you’re using {@code GtkPrintUnixDialog}’s
     * manual-capabilities setting and need to know which settings
     * the printer can handle and which you must handle yourself.
     * <p>
     * This will return 0 unless the printer’s details are
     * available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     */
    public PrintCapabilities getCapabilities() {
        var RESULT = gtk_h.gtk_printer_get_capabilities(handle());
        return new PrintCapabilities(RESULT);
    }
    
    /**
     * Returns default page size of {@code printer}.
     */
    public PageSetup getDefaultPageSize() {
        var RESULT = gtk_h.gtk_printer_get_default_page_size(handle());
        return new PageSetup(References.get(RESULT, true));
    }
    
    /**
     * Gets the description of the printer.
     */
    public java.lang.String getDescription() {
        var RESULT = gtk_h.gtk_printer_get_description(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieve the hard margins of {@code printer}.
     * <p>
     * These are the margins that define the area at the borders
     * of the paper that the printer cannot print to.
     * <p>
     * Note: This will not succeed unless the printer’s details are
     * available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     */
    public boolean getHardMargins(PointerDouble top, PointerDouble bottom, PointerDouble left, PointerDouble right) {
        var RESULT = gtk_h.gtk_printer_get_hard_margins(handle(), top.handle(), bottom.handle(), left.handle(), right.handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieve the hard margins of {@code printer} for {@code paper_size}.
     * <p>
     * These are the margins that define the area at the borders
     * of the paper that the printer cannot print to.
     * <p>
     * Note: This will not succeed unless the printer’s details are
     * available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     */
    public boolean getHardMarginsForPaperSize(PaperSize paperSize, PointerDouble top, PointerDouble bottom, PointerDouble left, PointerDouble right) {
        var RESULT = gtk_h.gtk_printer_get_hard_margins_for_paper_size(handle(), paperSize.handle(), top.handle(), bottom.handle(), left.handle(), right.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the name of the icon to use for the printer.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.gtk_printer_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the number of jobs currently queued on the printer.
     */
    public int getJobCount() {
        var RESULT = gtk_h.gtk_printer_get_job_count(handle());
        return RESULT;
    }
    
    /**
     * Returns a description of the location of the printer.
     */
    public java.lang.String getLocation() {
        var RESULT = gtk_h.gtk_printer_get_location(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the name of the printer.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_printer_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the state message describing the current state
     * of the printer.
     */
    public java.lang.String getStateMessage() {
        var RESULT = gtk_h.gtk_printer_get_state_message(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether the printer details are available.
     */
    public boolean hasDetails() {
        var RESULT = gtk_h.gtk_printer_has_details(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the printer is accepting jobs
     */
    public boolean isAcceptingJobs() {
        var RESULT = gtk_h.gtk_printer_is_accepting_jobs(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the printer is currently active (i.e.
     * accepts new jobs).
     */
    public boolean isActive() {
        var RESULT = gtk_h.gtk_printer_is_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the printer is the default printer.
     */
    public boolean isDefault() {
        var RESULT = gtk_h.gtk_printer_is_default(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the printer is currently paused.
     * <p>
     * A paused printer still accepts jobs, but it is not
     * printing them.
     */
    public boolean isPaused() {
        var RESULT = gtk_h.gtk_printer_is_paused(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the printer is virtual (i.e. does not
     * represent actual printer hardware, but something like
     * a CUPS class).
     */
    public boolean isVirtual() {
        var RESULT = gtk_h.gtk_printer_is_virtual(handle());
        return (RESULT != 0);
    }
    
    /**
     * Lists all the paper sizes {@code printer} supports.
     * <p>
     * This will return and empty list unless the printer’s details
     * are available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     */
    public org.gtk.glib.List listPapers() {
        var RESULT = gtk_h.gtk_printer_list_papers(handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Requests the printer details.
     * <p>
     * When the details are available, the
     * {@code Gtk.Printer::details-acquired} signal
     * will be emitted on {@code printer}.
     */
    public void requestDetails() {
        gtk_h.gtk_printer_request_details(handle());
    }
    
    @FunctionalInterface
    public interface DetailsAcquiredHandler {
        void signalReceived(Printer source, boolean success);
    }
    
    /**
     * Emitted in response to a request for detailed information
     * about a printer from the print backend.
     * <p>
     * The {@code success} parameter indicates if the information was
     * actually obtained.
     */
    public SignalHandle onDetailsAcquired(DetailsAcquiredHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("details-acquired").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Printer.class, "__signalPrinterDetailsAcquired",
                        MethodType.methodType(void.class, MemoryAddress.class, boolean.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalPrinterDetailsAcquired(MemoryAddress source, boolean success, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Printer.DetailsAcquiredHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Printer(References.get(source)), success);
    }
    
}
